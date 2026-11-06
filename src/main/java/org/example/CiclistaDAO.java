package org.example;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CiclistaDAO {

    public void criaciclista(Ciclista ciclista) {
           String sql = "INSERT INTO ciclista (nome, genero, idade) VALUES (?, ?, ?)";

           try (Connection conn = ConexaoBike.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
               stmt.setString(1, ciclista.getNome());
               stmt.setString(2, ciclista.getGenero());
               stmt.setInt(3, ciclista.getIdade());
               stmt.executeUpdate();
           } catch (SQLException e){
               throw new RuntimeException("Erro de cadastro;" + e.getMessage(), e);
               }
           }
    public List<Ciclista> buscaTodos(){
     String sql = "SELECT * FROM ciclista";
     List<Ciclista> lista = new ArrayList<>();

     try (Connection conn = ConexaoBike.getConnection();
          PreparedStatement stmt = conn.prepareStatement(sql);
          ResultSet rs = stmt.executeQuery()){

         while (rs.next()){
             Ciclista ciclista = new Ciclista(
                     rs.getInt("id"),
                     rs.getString("nome"),
                     rs.getString("genero"),
                     rs.getInt("idade")
             );

             lista.add(ciclista);
         }

    } catch (SQLException e){
         throw new RuntimeException("Erro ao listar ciclistas" + e.getMessage(), e);
     }
     return lista;
}

public void atualiza(Ciclista ciclista) {
        String sql = "UPDATE ciclista SET nome = ?, genero = ?, idade = ? WHERE id = ?";

        try (Connection conn = ConexaoBike.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)){

            stmt.setString(1, ciclista.getNome());
            stmt.setString(2, ciclista.getGenero());
            stmt.setInt(3, ciclista.getIdade());
            stmt.setInt(4, ciclista.getId());
            stmt.executeUpdate();

        } catch (SQLException e){
            throw new RuntimeException("Erro ao atualizar ciclista" + e.getMessage(), e);
        }
}

public void deletar(int id){
        String sql = "DELETE FROM ciclista WHERE id = ?";

        try (Connection conn = ConexaoBike.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (SQLException e){
            throw new RuntimeException("Erro ao deletar ciclista" + e.getMessage(), e);
        }
}
}
