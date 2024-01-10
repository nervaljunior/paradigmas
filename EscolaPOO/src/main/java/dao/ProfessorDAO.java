/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Professor;
import utils.Conexao;

/**
 *
 * @author DELL
 */
public class ProfessorDAO {
    

    private Connection connection;

    public ProfessorDAO() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = Conexao.getConexao();
        } catch (ClassNotFoundException e) {
            
        }
    }
    
    public void save(Professor professor) {
        try {
            PreparedStatement ps = connection.prepareStatement("INSERT INTO professores (nome, email, sexo, telefone) VALUES (?,?,?,?)");
            ps.setString(1, professor.getNome());
            ps.setString(2, professor.getEmail());
            ps.setString(3, professor.getSexo());
            ps.setString(4, professor.getTelefone());
            ps.execute();
            JOptionPane.showMessageDialog(null, "Professor cadastrado com sucesso!");
        } catch (SQLException ex) {
            Logger.getLogger(ProfessorDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void update(Professor professor) {
        try {
            PreparedStatement ps = connection.prepareStatement("UPDATE professores SET nome=?, email=?, sexo=?, telefone=? WHERE id=?");
            ps.setString(1, professor.getNome());
            ps.setString(2, professor.getEmail());
            ps.setString(3, professor.getSexo());
            ps.setString(4, professor.getTelefone());
            ps.setInt(5, professor.getId());
            ps.execute();
            JOptionPane.showMessageDialog(null, "Professor atualizado com sucesso!");
        } catch (SQLException ex) {
            Logger.getLogger(ProfessorDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void saveOrUpdate(Professor professor) {
        if (professor.getId() == 0) {
            save(professor);
        } else {
            update(professor);
        }
    }

    public void delete(Professor professor) {
        try {
            PreparedStatement ps = connection.prepareStatement("DELETE FROM professores WHERE id=?");
            ps.setInt(1, professor.getId());
            ps.execute();
            JOptionPane.showMessageDialog(null, "Professor deletado com sucesso!");
        } catch (SQLException ex) {
            Logger.getLogger(ProfessorDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<Professor> getAll() throws Exception {
        List<Professor> professores = new ArrayList<>();
        try {
            PreparedStatement ps = connection.prepareStatement("SELECT * FROM professores");
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Professor professor = new Professor();
                professor.setId(rs.getInt("id"));
                professor.setNome(rs.getString("nome"));
                professor.setEmail(rs.getString("email"));
                professor.setSexo(rs.getString("sexo"));
                professor.setTelefone(rs.getString("telefone"));
                professores.add(professor);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProfessorDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return professores;
    }

    public Professor getById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
