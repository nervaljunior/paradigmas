package escola;
import java.util.Date;
import java.util.ArrayList;

public class Turma {

    private String sigla;
    private Date ano;

    private ArrayList<Aluno>alunos;
    private ArrayList<Professor>professores;
    private ArrayList<Disciplina>disciplina;

    public Turma() {
    }

    private int semestre;

    private String horarios;

    public void abrirTurma() {
        
    }

    public void alocarProfessor() {
        
    }

    public void matricularAluno() {
        
    }
    
    void adicionarAluno(){

        
    }

    public Turma(String sigla, Date ano, ArrayList<Aluno> alunos, ArrayList<Professor> professores,
            ArrayList<Disciplina> disciplina, int semestre, String horarios) {
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

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public String getHorarios() {
        return horarios;
    }

    public void setHorarios(String horarios) {
        this.horarios = horarios;
    }

    @Override
    public String toString() {
        return "Turma [sigla=" + sigla + ", ano=" + ano + ", alunos=" + alunos + ", professores=" + professores
                + ", disciplina=" + disciplina + ", semestre=" + semestre + ", horarios=" + horarios + "]";
    }

    


}
