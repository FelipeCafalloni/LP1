package org.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FuncionarioDAO {

    public void criafuncionario(Funcionario funcionario) {
        String sql = "INSERT INTO funcionario (nome, cargo, salario) VALUES (?, ?, ?)";

        try (Connection conn = ConexaoBike.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, funcionario.getNome());
            stmt.setString(2, funcionario.getCargo());
            stmt.setDouble(3, funcionario.getSalario());
            stmt.executeUpdate();
        } catch (SQLException e){
            e.printStackTrace();
            throw new RuntimeException("Erro de cadastro;" + e.getMessage(), e);
        }
    }

    public List<Funcionario> buscaTodos(){
        String sql = "SELECT * FROM funcionario";
        List<Funcionario> lista = new ArrayList<>();

        try (Connection conn = ConexaoBike.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()){

            while (rs.next()){
                Funcionario funcionario = new Funcionario(
                        rs.getInt("id"),
                        rs.getString("nome"),
                        rs.getString("cargo"),
                        rs.getDouble("salario")
                );

                lista.add(funcionario);
            }

        } catch (SQLException e){
            throw new RuntimeException("Erro ao listar funcionarios" + e.getMessage(), e);
        }
        return lista;
    }

    public void atualiza(Funcionario funcionario) {
        String sql = "UPDATE funcionario SET nome = ?, cargo = ?, salario = ? WHERE id = ?";

        try (Connection conn = ConexaoBike.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)){

            stmt.setString(1, funcionario.getNome());
            stmt.setString(2, funcionario.getCargo());
            stmt.setDouble(3, funcionario.getSalario());
            stmt.setInt(4, funcionario.getId());
            stmt.executeUpdate();

        } catch (SQLException e){
            throw new RuntimeException("Erro ao atualizar funcionario" + e.getMessage(), e);
        }
    }

    public void deletar(int id){
        String sql = "DELETE FROM funcionario WHERE id = ?";

        try (Connection conn = ConexaoBike.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (SQLException e){
            throw new RuntimeException("Erro ao deletar funcionario" + e.getMessage(), e);
        }
    }
}
