package model;

import java.util.ArrayList;


public class Disciplina {
    
    private String nome_disciplina;
    private int Cargahoraria;
    private int codigo;
    private String descricao;
    private Integer cargaHoraria;
    private String ementa;
    
    ArrayList<Professor>professores;
    ArrayList<Turma>turmas;

    public Disciplina(String nome_disciplina, int Cargahoraria, ArrayList<Professor> professores, ArrayList<Turma> turmas, int codigo, String descricao, Integer cargaHoraria, String ementa) {
        this.nome_disciplina = nome_disciplina;
        this.Cargahoraria = Cargahoraria;
        this.professores = professores;
        this.turmas = turmas;
        this.codigo = codigo;
        this.descricao = descricao;
        this.cargaHoraria = cargaHoraria;
        this.ementa = ementa;
    }

    public Disciplina() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getNome_disciplina() {
        return nome_disciplina;
    }

    public void setNome_disciplina(String nome_disciplina) {
        this.nome_disciplina = nome_disciplina;
    }

    public int getCargahoraria() {
        return Cargahoraria;
    }

    public void setCargahoraria(int Cargahoraria) {
        this.Cargahoraria = Cargahoraria;
    }

    public ArrayList<Professor> getProfessores() {
        return professores;
    }

    public void setProfessores(ArrayList<Professor> professores) {
        this.professores = professores;
    }

    public ArrayList<Turma> getTurmas() {
        return turmas;
    }

    public void setTurmas(ArrayList<Turma> turmas) {
        this.turmas = turmas;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(Integer cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public String getEmenta() {
        return ementa;
    }

    public void setEmenta(String ementa) {
        this.ementa = ementa;
    }

    public void cadastrar() {
        System.out.println("Disciplina " + this.nome_disciplina + " cadastrada com sucesso.");
    }
    
    public void alocarProfessor(Professor professor) {
        this.professores.add(professor);
        System.out.println("Professor " + professor.getNome() + " alocado para a disciplina " + this.nome_disciplina);

    }
    public void adicionarTurma(Turma turma) {
        this.turmas.add(turma);
        System.out.println("Turma " + turma.getSigla() + " adicionada à disciplina " + this.nome_disciplina);

    }



}
