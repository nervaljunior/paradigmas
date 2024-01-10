
package escola;

import java.util.*;

public class Aluno extends Pessoa {

    private Date data_nascimento;

    private Situacao situacao;


    public Aluno(String nome, String matricula, String endereco, String telefone, Date data_nascimento,
            Situacao situacao, Turma turma) {
        super(nome, matricula, endereco, telefone);
        this.data_nascimento = data_nascimento;
        this.situacao = situacao;
        this.turma = turma;
    }

    

    public Date getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(Date data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    public Situacao getSituacao() {
        return situacao;
    }

    public void setSituacao(Situacao situacao) {
        this.situacao = situacao;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    


    @Override
    public String toString() {
        return "Aluno [data_nascimento=" + data_nascimento + ", situacao=" + situacao + ", turma=" + turma + "]";
    }




    Turma turma;

    void realizar_avaliacao(){

    }

    public void matricularCurso() {
        
    }

    public void trancar() {
        
    }

    public void emitirHistorico() {
        
    }


    public void abandonar() {
        
    }

    public void obterAvaliacoes() {
       
    }
    


}
