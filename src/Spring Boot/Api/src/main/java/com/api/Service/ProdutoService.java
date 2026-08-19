package com.api.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.entities.Produto;
import com.api.repository.ProdutoRepository;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository repository;

    public Produto salvar(Produto produto) {

        if (produto.getDescricao() == null || produto.getDescricao().isEmpty()) {
            throw new RuntimeException("A descrição deve ser informada");
        }

        if (produto.getPreco() < 0) {
            throw new RuntimeException("O preço não pode ser negativo");
        }

        if (produto.getEstoque() < 0) {
            produto.setEstoque(0);
        }

        return repository.save(produto);
    }

    public List<Produto> consultar() {
        return repository.findAll();
    }

    public Produto getUm(Long id) {

        Produto prod = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Produto não encontrado"));

        return prod;
    }

    public Produto alterar(Long id, Produto produto) {

        Produto prod = getUm(id);

        prod.setDescricao(produto.getDescricao());
        prod.setPreco(produto.getPreco());
        prod.setEstoque(produto.getEstoque());

        return repository.save(prod);
    }

    public void excluir(Long id) {
        repository.deleteById(id);
    }
}