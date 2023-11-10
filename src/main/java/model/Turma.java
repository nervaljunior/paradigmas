package model;

import java.sql.Date;
import java.util.ArrayList;
/**
 *
 * @author DELL
 */
public class Turma {

    public Turma() {
    }


    private String sigla;
    private Date ano;

    private ArrayList<Aluno>alunos;
    private ArrayList<Professor>professores;
    private ArrayList<Disciplina>disciplina;


    private String semestre;


    private String horarios;


    public void abrirTurma() {
        System.out.println("A turma " + this.sigla + " foi aberta para o semestre " + this.semestre + " do ano " + this.ano);

    }


    public void alocarProfessor(Professor professor) {
        this.professores.add(professor);
        System.out.println("Professor " + professor.getNome() + " alocado para a turma " + this.sigla);
    }


  
    public void matricularAluno(Aluno aluno) {
        this.alunos.add(aluno);
        System.out.println("Aluno " + aluno.getNome() + " matriculado na turma " + this.sigla);

    }


    public Turma(String sigla, Date ano, ArrayList<Aluno> alunos, ArrayList<Professor> professores, ArrayList<Disciplina> disciplina, String semestre, String horarios) {
        this.sigla = sigla;
        this.ano = ano;
        this.alunos = alunos;
        this.professores = professores;
        this.disciplina = disciplina;
        this.semestre = semestre;
        this.horarios = horarios;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public Date getAno() {
        return ano;
    }

    public void setAno(Date ano) {
        this.ano = ano;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }

    public ArrayList<Professor> getProfessores() {
        return professores;
    }

    public void setProfessores(ArrayList<Professor> professores) {
        this.professores = professores;
    }

    public ArrayList<Disciplina> getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(ArrayList<Disciplina> disciplina) {
        this.disciplina = disciplina;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    public String getHorarios() {
        return horarios;
    }

    public void setHorarios(String horarios) {
        this.horarios = horarios;
    }

    
}