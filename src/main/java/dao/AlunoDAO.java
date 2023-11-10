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
import model.Aluno;
import utils.Conexao;

/**
 *
 * @author DELL
 */
public class AlunoDAO {
   

    private Connection connection;

    public AlunoDAO() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = Conexao.getConexao();
        } catch (ClassNotFoundException e) {
            
        }
    }
    
    public void save(Aluno aluno) {
        try {
            PreparedStatement ps = connection.prepareStatement("INSERT INTO alunos (nome, email, sexo, telefone) VALUES (?,?,?,?)");
            ps.setString(1, aluno.getNome());
            ps.setString(2, aluno.getEmail());
            ps.setString(3, aluno.getSexo());
            ps.setString(4, aluno.getTelefone());
            ps.execute();
            JOptionPane.showMessageDialog(null, "Aluno cadastrado com sucesso!");
        } catch (SQLException ex) {
            Logger.getLogger(AlunoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void update(Aluno aluno) {
        try {
            PreparedStatement ps = connection.prepareStatement("UPDATE alunos SET  nome=?, email=?, sexo=?, telefone=? WHERE id=?");
            ps.setString(1, aluno.getNome());
            ps.setString(2, aluno.getEmail());
            ps.setString(3, aluno.getSexo());
            ps.setString(4, aluno.getTelefone());
            ps.setInt(5, aluno.getId());
            ps.execute();
            JOptionPane.showMessageDialog(null, "Aluno atualizado com sucesso!");
        } catch (SQLException ex) {
            Logger.getLogger(AlunoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void saveOrUpdate(Aluno aluno) {
        if (aluno.getId() == 0) {
            save(aluno);
        } else {
            update(aluno);
            
        }
    }


    public void delete(Aluno aluno) {
        try {
            PreparedStatement ps = connection.prepareStatement("DELETE FROM alunos WHERE id=?");
            ps.setInt(1, aluno.getId());
            ps.execute();
            JOptionPane.showMessageDialog(null, "Aluno deletado com sucesso!");
        } catch (SQLException ex) {
            Logger.getLogger(AlunoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    public List<Aluno> getAll() throws Exception {
        List<Aluno> alunos = new ArrayList<>();
        try {
            PreparedStatement ps = connection.prepareStatement("SELECT * FROM alunos");
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Aluno aluno = new Aluno();
                aluno.setId(rs.getInt("id"));
                aluno.setNome(rs.getString("nome"));
                aluno.setEmail(rs.getString("email"));
                aluno.setSexo(rs.getString("sexo"));
                aluno.setTelefone(rs.getString("telefone"));
                alunos.add(aluno);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(AlunoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return alunos;
    }

    public Aluno getById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}




