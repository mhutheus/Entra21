package DAO;

import Interfaces.ICRUD;
import Modelos.Produto;
import java.util.List;

public class ProdutoDao implements ICRUD {

    @Override
    public Produto salvar(Produto prod) {
        prod.setId(1);
        return prod;
    }

    @Override
    public void deletar(int id) {
        System.out.println("Deletando produto: " + id);
    }

    @Override
    public void alterar(Produto prod) {
        System.out.println("Alterando produto: " + prod.getId());
    }

    @Override
    public Produto consultar(int id) {
        return null;
    }

    @Override
    public List<Produto> consultar() {
        return null;
    }
    
}
