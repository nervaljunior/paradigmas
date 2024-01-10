import escola.Disciplina;
import escola.Turma;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App {

    private JFrame frame;
    private JLabel variable1Label;
    private JLabel variable2Label;
    private JLabel variable3Label;
    private int variable1Value = 0;
    private int variable2Value = 0;
    private int variable3Value = 0;

    public App() {
        frame = new JFrame("Dashboard App");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLayout(new GridLayout(3, 2));

        variable1Label = new JLabel("Variable 1: " + variable1Value);
        variable2Label = new JLabel("Variable 2: " + variable2Value);
        variable3Label = new JLabel("Variable 3: " + variable3Value);

        JButton variable1Button = new JButton("Increment Variable 1");
        JButton variable2Button = new JButton("Increment Variable 2");
        JButton variable3Button = new JButton("Increment Variable 3");

        variable1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                variable1Value++;
                variable1Label.setText("Variable 1: " + variable1Value);
            }
        });

        variable2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                variable2Value++;
                variable2Label.setText("Variable 2: " + variable2Value);
            }
        });

        variable3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                variable3Value++;
                variable3Label.setText("Variable 3: " + variable3Value);
            }
        });

        frame.add(variable1Label);
        frame.add(variable1Button);
        frame.add(variable2Label);
        frame.add(variable2Button);
        frame.add(variable3Label);
        frame.add(variable3Button);

        frame.setVisible(true);
    }

    public static void main(String[] args) throws Exception {
        Disciplina disciplina1 = new Disciplina();
        disciplina1.setNome_disciplina("Matemática");
        disciplina1.setCargahoraria(10); // Corrigido para um valor positivo

        System.out.println(disciplina1.getCargahoraria());
        System.out.println(disciplina1.getNome_disciplina());

        Turma turma1= new Turma();

        turma1.setAno(null);        
        turma1.setSigla("ma");    
/*         
        Aluno aluno1= new Aluno();

        aluno1.setData_nascimento(null);
        aluno1.setNome("nerval");
        aluno1.setMatricula(null);
        
        System.out.println(aluno1.getNome());
        
        */


        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new App();
            }
        });
    }
}
