package escola;

import java.util.*;

public class Disciplina {

    private String nome_disciplina;
    private int Cargahoraria;

    public Disciplina() {
    }


    private int codigo;


    private String descricao;


    private int cargaHoraria;


    private String ementa;


    public void cadastrar() {
        
    }

    


    public Disciplina(String nome_disciplina, int cargahoraria, int codigo, String descricao, int cargaHoraria2,
            String ementa, ArrayList<Professor> professores, ArrayList<Turma> turmas) {
        this.nome_disciplina = nome_disciplina;
        Cargahoraria = cargahoraria;
        this.codigo = codigo;
        this.descricao = descricao;
        cargaHoraria = cargaHoraria2;
        this.ementa = ementa;
        this.professores = professores;
        this.turmas = turmas;
    }


    ArrayList<Professor>professores;
    ArrayList<Turma>turmas;



    public String getNome_disciplina() {
        return nome_disciplina;
    }

    public void setNome_disciplina(String nome_disciplina) {
        this.nome_disciplina = nome_disciplina;
    }

    public int getCargahoraria() {
        return Cargahoraria;
    }

    public void setCargahoraria(int cargahoraria) {
        Cargahoraria = cargahoraria;
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

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public String getEmenta() {
        return ementa;
    }

    public void setEmenta(String ementa) {
        this.ementa = ementa;
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

    @Override
    public String toString() {
        return "Disciplina [nome_disciplina=" + nome_disciplina + ", Cargahoraria=" + Cargahoraria + ", codigo="
                + codigo + ", descricao=" + descricao + ", cargaHoraria=" + cargaHoraria + ", ementa=" + ementa
                + ", professores=" + professores + ", turmas=" + turmas + "]";
    }

    


}
