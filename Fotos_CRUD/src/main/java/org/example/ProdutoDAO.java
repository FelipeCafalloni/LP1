package org.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProdutoDAO {

    void criaproduto(Produto produto){
        String sql = "INSERT INTO produto(nome, tamanho, cor) VALUES (?, ?, ?)";

        try (Connection conn = ConexaoBike.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, produto.getNome());
            stmt.setString(2, produto.getTamanho());
            stmt.setString(3, produto.getCor());
            stmt.executeUpdate();
        } catch (SQLException e){
            e.printStackTrace();
            throw new RuntimeException("Erro de cadastro;" + e.getMessage(), e);
        }
    }

    public List<Produto> buscatodos(){

        String sql = "SELECT * FROM produto";
        List<Produto> lista = new ArrayList<>();

        try (Connection conn = ConexaoBike.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()){

            while (rs.next()){
                Produto produto = new Produto(
                        rs.getInt("id"),
                        rs.getString("nome"),
                        rs.getString("tamanho"),
                        rs.getString("cor")
                );

                lista.add(produto);
            }

        }catch (SQLException e){
            throw new RuntimeException("Erro ao listar produtos" + e.getMessage(), e);
        }
        return lista;
    }


    public void atualiza(Produto produto) {
        String sql = "UPDATE produto SET nome = ?, tamanho = ?, cor = ? WHERE id = ?";

        try (Connection conn = ConexaoBike.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)){

            stmt.setString(1, produto.getNome());
            stmt.setString(2, produto.getTamanho());
            stmt.setString(3, produto.getCor());
            stmt.setInt(4, produto.getId());
            stmt.executeUpdate();

        } catch (SQLException e){
            throw new RuntimeException("Erro ao atualizar produto" + e.getMessage(), e);
        }
    }

    public void deletar(int id){
        String sql = "DELETE FROM produto WHERE id = ?";

        try (Connection conn = ConexaoBike.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (SQLException e){
            throw new RuntimeException("Erro ao deletar produto" + e.getMessage(), e);
        }
    }
}
