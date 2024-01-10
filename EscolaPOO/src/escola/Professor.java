package escola;

import java.util.ArrayList;

public class Professor extends Pessoa{

    private String formacao_academica;
    private double salario;



    public Professor(String nome, String matricula, String endereco, String telefone, String formacao_academica,
            double salario, ArrayList<Disciplina> disciplinas, ArrayList<Turma> turmas) {
        super(nome, matricula, endereco, telefone);
        this.formacao_academica = formacao_academica;
        this.salario = salario;
        this.disciplinas = disciplinas;
        this.turmas = turmas;
    }


    public void cadastrar() {
        
    }


    ArrayList<Disciplina>disciplinas;
    ArrayList<Turma>turmas;



    void aplicarProva(){


    }



    /**
     * @return String return the formacao_academica
     */
    public String getFormacao_academica() {
        return formacao_academica;
    }

    /**
     * @param formacao_academica the formacao_academica to set
     */
    public void setFormacao_academica(String formacao_academica) {
        this.formacao_academica = formacao_academica;
    }

    /**
     * @return double return the salario
     */
    public double getSalario() {
        return salario;
    }

    /**
     * @param salario the salario to set
     */
    public void setSalario(double salario) {
        this.salario = salario;
    }


    public ArrayList<Disciplina> getDisciplinas() {
        return disciplinas;
    }


    public void setDisciplinas(ArrayList<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }


    public ArrayList<Turma> getTurmas() {
        return turmas;
    }


    public void setTurmas(ArrayList<Turma> turmas) {
        this.turmas = turmas;
    }


    @Override
    public String toString() {
        return "Professor [formacao_academica=" + formacao_academica + ", salario=" + salario + ", disciplinas="
                + disciplinas + ", turmas=" + turmas + "]";
    }

    

}
