package Crud;

public interface Cadastro {
    void cadastrar(Funcionario funcionario);
    void editar(int id, Funcionario funcionario);
    void excluir(int id);
}
