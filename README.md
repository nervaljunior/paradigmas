---



# Sistema de Cadastro de Escola

Este é um sistema de cadastro de uma escola desenvolvido no NetBeans, com uma interface gráfica intuitiva criada através da ferramenta de design do NetBeans. O sistema permite cadastrar professores, alunos e responsáveis pelos alunos, armazenando os dados em um banco de dados MySQL usando o Workbench.

todo esse projeto foi feito com base em um modelo de classes feito no StarUML, o qual ireei apresentar dia 10 d enovembro



# projeto no starUML
![image](https://github.com/nervaljunior/paradigmas/assets/108685222/ba674bdb-1c0f-4ac3-9c48-3c7f07d6a511)


# interface
![image](https://github.com/nervaljunior/paradigmas/assets/108685222/19c260b2-9967-4f33-b75a-e87b4d25bfc7)




# banco
![image](https://github.com/nervaljunior/paradigmas/assets/108685222/1882ad26-6f96-4fd5-a104-69c913c09046)


# pastas netbeans 
![image](https://github.com/nervaljunior/paradigmas/assets/108685222/97deedaa-4f1d-47e7-ba18-d17ee400368d)



# xamp
![image](https://github.com/nervaljunior/paradigmas/assets/108685222/392b436c-1b17-4a0d-9ccd-f33daf51accb)


## Estrutura do Projeto

O projeto segue a arquitetura MVC (Model-View-Controller) para uma organização clara e eficiente do código. A estrutura do projeto é dividida em pacotes:

- `dao`: Contém classes responsáveis por realizar operações de inserção, seleção, atualização e exclusão no banco de dados.
- `gui`: A interface gráfica do sistema, que é a parte que o usuário interage. Aqui, é possível cadastrar e visualizar professores, alunos e responsáveis.
- `model`: Contém as classes de modelo, que representam as entidades do sistema. Isso inclui as classes Aluno, Professor, Cliente (responsável), Disciplina, Pessoa, Situação e Turma.
- `utils`: Um pacote para gerenciar a conexão com o banco de dados, permitindo uma separação clara das responsabilidades.

## Requisitos e Ferramentas

- JDK 21 ou superior
- NetBeans IDE
- Workbench MySQL
- StarUML (para modelagem de software)

## Funcionalidades

- Desenvolvemos as interaçoes baseado no modelo CRUD que são as quatro operações básicas do desenvolvimento de uma aplicação, sendo utilizadas em bases de dados relacionais fornecidas aos utilizadores do sistema.
- Cadastro de professores com informações detalhadas.
- Cadastro de alunos, incluindo matrícula e situação.
- Cadastro de responsáveis pelos alunos.
- Armazenamento seguro dos dados no banco de dados MySQL.

## Como Executar o Projeto

1. Abra o projeto no NetBeans.
2. Configure a conexão com o banco de dados no arquivo `utils/ConexaoBD.java`.
3. Execute o programa a partir da classe `gui/ClienteGUI.java`.


Sinta-se à vontade para contribuir com melhorias ou correções neste projeto. Basta criar um fork, fazer as alterações desejadas e enviar um pull request.

#CONEXAO
```jsx
public class Conexao {
    
    public static Connection getConexao() throws ClassNotFoundException {

        try {

            Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3307/paradigmas","root","");
            System.out.println("Conectado com o banco com Sucesso");
            return connection;
        }catch(SQLException e){
            System.out.println("erro na conexão com o banco de dados \nErro:"+ e);
        }
        return null;

    } 
```


## Licença

Este projeto é distribuído sob a licença MIT. Veja o arquivo LICENSE para obter mais detalhes.

---
