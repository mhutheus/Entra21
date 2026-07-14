package dao;

import interfaces.ICRUD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelos.Produto;
import utils.ConectaDB;

public class ProdutoDao implements ICRUD {

    @Override
    public Produto salvar(Produto prod) {
        String sql = "INSERT INTO tb_produtos(descricao, preco) VALUES (?, ?)";

        Connection con = ConectaDB.conectar();

        try {
            PreparedStatement stm = con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);

            stm.setString(1, prod.getDescricao());
            stm.setDouble(2, prod.getPreco());

            stm.executeUpdate();

            ResultSet rs = stm.getGeneratedKeys();

            if (rs.next()) {
                prod.setId(rs.getInt(1));
            }

            rs.close();
            stm.close();
            con.close();

            return prod;

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public void deletar(int id) {
        String sql = "DELETE FROM tb_produtos WHERE id = ?";

        Connection con = ConectaDB.conectar();

        try {
            PreparedStatement stm = con.prepareStatement(sql);
            stm.setInt(1, id);

            stm.executeUpdate();

            stm.close();
            con.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void alterar(Produto prod) {
        String sql = "update tb_produtos set descricao = ?, preco = ? where id = ?";

        Connection con = ConectaDB.conectar();

        try {
            PreparedStatement stm = con.prepareStatement(sql);

            stm.setString(1, prod.getDescricao());
            stm.setDouble(2, prod.getPreco());
            stm.setInt(3, prod.getId());

            stm.executeUpdate();

            stm.close();
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Produto consultar(int id) {
        String sql = "SELECT * FROM tb_produtos WHERE id = ?";

        Connection con = ConectaDB.conectar();

        try {
            PreparedStatement stm = con.prepareStatement(sql);
            stm.setInt(1, id);

            ResultSet rs = stm.executeQuery();

            Produto prod = null;

            if (rs.next()) {
                prod = new Produto();
                prod.setId(rs.getInt("id"));
                prod.setDescricao(rs.getString("descricao"));
                prod.setPreco(rs.getDouble("preco"));
            }

            rs.close();
            stm.close();
            con.close();

            return prod;

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public List<Produto> consultar() {
        List<Produto> produtos = new ArrayList<Produto>();
        Connection con = ConectaDB.conectar();
        String sql = "select * from tb_produtos";
        try {
            PreparedStatement stm = con.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Produto p = new Produto(rs.getInt(1), rs.getString(2), rs.getDouble(3));
                produtos.add(p);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return produtos;
    }

}
