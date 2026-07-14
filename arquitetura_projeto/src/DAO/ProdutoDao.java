package dao;

import interfaces.ICRUD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;
import modelos.Produto;
import utils.ConectaDB;

public class ProdutoDao implements ICRUD {

    @Override
    public Produto salvar(Produto prod) {

        String sql = "INSERT INTO tb_produtos (descricao, preco) VALUES (?, ?)";

        try (
            Connection conn = ConectaDB.conectar();
            PreparedStatement stmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        ) {

            stmt.setString(1, prod.getDescricao());
            stmt.setDouble(2, prod.getPreco());

            int linhas = stmt.executeUpdate();

            if (linhas > 0) {
                ResultSet rs = stmt.getGeneratedKeys();

                if (rs.next()) {
                    prod.setId(rs.getInt(1));
                }

                System.out.println("Produto salvo com sucesso!");
            }

        } catch (Exception e) {
            System.out.println("Erro ao salvar produto.");
            e.printStackTrace();
        }

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