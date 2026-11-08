package org.example;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class RotaDAO {

public void criaRota(Rota rota){
    String sql = "INSERT INTO rota (nome, endereco, distancia) VALUES (?, ?, ?)";

    try (Connection conn = ConexaoBike.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)){
        stmt.setString(1, rota.getNome());
        stmt.setString(2, rota.getEndereco());
        stmt.setDouble(3, rota.getDistancia());
        stmt.executeUpdate();
    }catch (SQLException e){
        throw new RuntimeException("Erro de cadastro" + e.getMessage(), e);
    }
}


public List <Rota> buscaRotas() {
    String sql = "SELECT * FROM rota";
    List<Rota> lista = new ArrayList<>();

    try (Connection conn = ConexaoBike.getConnection();
         PreparedStatement stmt = conn.prepareStatement(sql);
         ResultSet rs = stmt.executeQuery()){

        while (rs.next()){
            Rota rota = new Rota(
                rs.getInt("id"),
                rs.getString("nome"),
                rs.getString("endereco"),
                rs.getDouble("distancia")
            );

            lista.add(rota);
        }

    } catch (SQLException e){
        throw new RuntimeException("Erro na listagem de rotas" + e.getMessage(), e);
    }

    return lista;
}


void deletarRota(int id){
    String sql = "DELETE FROM rota WHERE id = ?";

    try (Connection conn = ConexaoBike.getConnection();
    PreparedStatement stmt = conn.prepareStatement(sql)){

        stmt.setInt(1, id);
        stmt.executeUpdate();
    } catch (SQLException e){
        throw new RuntimeException("Rota não encontrada, escolha outra para remover" + e.getMessage(), e);
    }
}


void atualizaRota(Rota rota){
    String sql = "UPDATE rota SET nome = ?, endereco = ?, distancia = ? WHERE id = ? ";

    try (Connection conn = ConexaoBike.getConnection();
    PreparedStatement stmt = conn.prepareStatement(sql)){
        stmt.setString(1, rota.getNome());
        stmt.setString(2, rota.getEndereco());
        stmt.setDouble(3, rota.getDistancia());
        stmt.setInt(4, rota.getId());
        stmt.executeUpdate();

    } catch (SQLException e){
        throw new RuntimeException("Erro ao atualizar rota" + e.getMessage(), e);
    }
}

}
