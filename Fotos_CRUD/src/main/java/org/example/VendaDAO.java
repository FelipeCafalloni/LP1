package org.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class VendaDAO {

    public void criavenda(Venda venda) {
        String sql = "INSERT INTO venda (nome_vendedor, nome_cliente, valor) VALUES (?, ?, ?)";

        try (Connection conn = ConexaoBike.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, venda.getVendedor());
            stmt.setString(2, venda.getCliente());
            stmt.setDouble(3, venda.getValor());
            stmt.executeUpdate();
        } catch (SQLException e){
            e.printStackTrace();
            throw new RuntimeException("Erro de cadastro;" + e.getMessage(), e);
        }
    }

    public List<Venda> buscaTodos(){
        String sql = "SELECT * FROM venda";
        List<Venda> lista = new ArrayList<>();

        try (Connection conn = ConexaoBike.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()){

            while (rs.next()){
                Venda venda = new Venda(
                        rs.getInt("id"),
                        rs.getString("nome_vendedor"),
                        rs.getString("nome_cliente"),
                        rs.getDouble("valor")
                );

                lista.add(venda);
            }

        } catch (SQLException e){
            throw new RuntimeException("Erro ao listar vendas" + e.getMessage(), e);
        }
        return lista;
    }

    public void atualiza(Venda venda) {
        String sql = "UPDATE venda SET nome_vendedor = ?, nome_cliente = ?, valor= ? WHERE id = ?";

        try (Connection conn = ConexaoBike.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)){

            stmt.setString(1, venda.getVendedor());
            stmt.setString(2, venda.getCliente());
            stmt.setDouble(3, venda.getValor());
            stmt.setInt(4, venda.getId());
            stmt.executeUpdate();

        } catch (SQLException e){
            throw new RuntimeException("Erro ao atualizar venda" + e.getMessage(), e);
        }
    }

    public void deletar(int id){
        String sql = "DELETE FROM venda WHERE id = ?";

        try (Connection conn = ConexaoBike.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (SQLException e){
            throw new RuntimeException("Erro ao deletar venda" + e.getMessage(), e);
        }
    }

}
