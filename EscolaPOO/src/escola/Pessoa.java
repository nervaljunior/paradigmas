package escola;

public class Pessoa {

    protected String nome;

    private String matricula;

    protected String endereco;

    protected String telefone;

    

    public Pessoa(String nome, String matricula, String endereco, String telefone) {
        this.nome = nome;
        this.matricula = matricula;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    

    public String getNome() {
        return nome;
    }



    public void setNome(String nome) {
        this.nome = nome;
    }



    public String getMatricula() {
        return matricula;
    }



    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }



    public String getEndereco() {
        return endereco;
    }



    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }



    public String getTelefone() {
        return telefone;
    }



    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }



    public void cadastrar() {
        

    }



    @Override
    public String toString() {
        return "Pessoa [nome=" + nome + ", matricula=" + matricula + ", endereco=" + endereco + ", telefone=" + telefone
                + "]";
    }

    


    


}
