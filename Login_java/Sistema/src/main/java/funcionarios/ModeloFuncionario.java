/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funcionarios;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
public class ModeloFuncionario extends AbstractTableModel {
    
    // Salvar as informações através de Collecntion do tipo ArrayList
    
    ArrayList<EntidadeFuncionario> funcionario = new ArrayList();
    
    String[] colunas = {"Nome", "Cargo", "CPF", "Salário"};

    // método responsável por adicionar os elementos no ArrayLista
    
    /**
     *
     * 
     */
    public void cadastrarFuncionario(EntidadeFuncionario f){ 
            funcionario.add(f);
            this.fireTableDataChanged();
            
    
    }
    public EntidadeFuncionario returnEntidadeFuncionario(int index) { 
        return funcionario.get(index);
    }
    
    
    // metodo inserir dados
   
    
    // metodo alterar
    
    public void alterarFuncionario (int index, EntidadeFuncionario f){
        funcionario.set(index, f);
        this.fireTableDataChanged();
    
    }
    
    //metodo excluir
    
    public void excluirFuncionario(int index){
        funcionario.remove(index);
        this.fireTableDataChanged();
        
    
    }
    
    
    // métodos abstratos exigidos pela Classe Abstract
    @Override
    // Obter o número de linhas da Tabela
    public int getRowCount() {
     // retornar tamanho da lista
     
        return funcionario.size();
        
    }

    @Override
    // Obter o número de colunas da Tabela
    public int getColumnCount() {
        
        return colunas.length;
 
    }
    @Override
    // Nome das colunas 
    public String getColumnName(int column) {  
        return colunas[column];
    }
    
    
    @Override
    // Obter valores da tabela
    public Object getValueAt(int rowIndex, int columnIndex) {
    // indicar qual indice terá cada dado
    
        if (columnIndex == 0){
            return funcionario.get(rowIndex).getNome();
            
        } else if (columnIndex ==1  ) {
            return funcionario.get(rowIndex).getCargo();
        
        } else if (columnIndex == 2){
            return funcionario.get(rowIndex).getCpf();
        } else {  
            return funcionario.get(rowIndex).getSalario();
        }
        
        
        
    }
    
    
    
    
}
