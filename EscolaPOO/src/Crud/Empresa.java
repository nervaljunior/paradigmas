package Crud;
import java.util.ArrayList;
import java.util.List;

public class Empresa implements Cadastro {
    private List<Funcionario> funcionarios = new ArrayList<>();

    @Override
    public void cadastrar(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    @Override
    public void editar(int id, Funcionario funcionario) {
        for (Funcionario f : funcionarios) {
            if (f.getId() == id) {
                f.setNome(funcionario.getNome());
                f.setCargo(funcionario.getCargo());
                f.setSalario(funcionario.getSalario());
                return;
            }
        }
    }

    @Override
    public void excluir(int id) {
        funcionarios.removeIf(f -> f.getId() == id);
    }

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }
}
