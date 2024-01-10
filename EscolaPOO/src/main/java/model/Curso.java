package model;

/**
 *
 * @author DELL
 */
public class Curso {


    public Curso() {
        
    }

    private Integer codigo;

    private String descricao;
    
    public Curso(int codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
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

 
    public void cadastrar() {
        System.out.println("Curso " + this.descricao + " cadastrado com sucesso, código: " + this.codigo);

    }


}
