package model;

import java.util.ArrayList;

public class Professor extends Pessoa{

    private String formacao;
    private double salario;
    
    ArrayList<Disciplina>disciplinas;
    ArrayList<Turma>turmas;

    public String getFormacao() {
        return this.formacao;
    }

    public void setFormacao(String formacao) throws Exception {
        if(formacao.length()>2){
            this.formacao = formacao;
            
        }else{
            throw new Exception("O nome da formação tem que ter mais de dois caracteres");
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    


    public double getSalario() {
        return salario;
    }

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
    public void mostrarDados() {
        //throw new UnsupportedOperationException("Not supported yet.");
        System.out.printf("%s tem %d anos de idade e sua formação é %s\n",this.getNome(),this.getIdade(),this.getFormacao());
    }
    

}
