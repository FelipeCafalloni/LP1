package org.example;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AmbienteDAO {

    public void criaambiente(Ambiente ambiente) {
        String sql = "INSERT INTO ambiente (bioma, qtd, perigo) VALUES (?, ?, ?)";

        try (Connection conn = ConexaoBike.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, ambiente.getBioma());
            stmt.setInt(2, ambiente.getQtd());
            stmt.setString(3, ambiente.getAnimalPerigo());
            stmt.executeUpdate();
        } catch (SQLException e){
            e.printStackTrace();
            throw new RuntimeException("Erro de cadastro;" + e.getMessage(), e);
        }
    }
    public List<Ambiente> buscaTodos(){
        String sql = "SELECT * FROM ambiente";
        List<Ambiente> lista = new ArrayList<>();

        try (Connection conn = ConexaoBike.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()){

            while (rs.next()){
                Ambiente ambiente = new Ambiente(
                        rs.getInt("id"),
                        rs.getString("bioma"),
                        rs.getInt("qtd"),
                        rs.getString("perigo")
                );

                lista.add(ambiente);
            }

        } catch (SQLException e){
            throw new RuntimeException("Erro ao listar ambientes" + e.getMessage(), e);
        }
        return lista;
    }

    public void atualiza(Ambiente ambiente) {
        String sql = "UPDATE ambiente SET bioma = ?, qtd = ?, perigo = ? WHERE id = ?";

        try (Connection conn = ConexaoBike.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)){

            stmt.setString(1, ambiente.getBioma());
            stmt.setInt(2, ambiente.getQtd());
            stmt.setString(3, ambiente.getAnimalPerigo());
            stmt.setInt(4, ambiente.getId());
            stmt.executeUpdate();

        } catch (SQLException e){
            throw new RuntimeException("Erro ao atualizar ambiente" + e.getMessage(), e);
        }
    }

    public void deletar(int id){
        String sql = "DELETE FROM ambiente WHERE id = ?";

        try (Connection conn = ConexaoBike.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (SQLException e){
            throw new RuntimeException("Erro ao deletar ambiente" + e.getMessage(), e);
        }
    }
}
