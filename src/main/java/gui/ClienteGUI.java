package gui;

import dao.AlunoDAO;
import java.util.logging.Level;
import java.util.logging.Logger;
import dao.ClienteDAO;
import dao.ProfessorDAO;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Aluno;
import model.Cliente;
import model.Professor;
/**
 *
 * @author DELL
 */
public class ClienteGUI extends javax.swing.JFrame {
    
    
    ClienteDAO clienteDAO=new ClienteDAO();
    AlunoDAO alunoDAO= new AlunoDAO();
    ProfessorDAO professorDAO= new ProfessorDAO();

    /**
     * Creates new form Cliente
     */
    public ClienteGUI() {
        initComponents();
        try {      
            atualizarTabela();
        } catch (Exception ex) {
            Logger.getLogger(ClienteGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnExcluir = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        CampoPesquisar = new javax.swing.JTextField();
        btnEditar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        campoNome = new javax.swing.JTextField();
        campoTelefone = new javax.swing.JTextField();
        campoEmail = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        campoMasculino = new javax.swing.JRadioButton();
        campoFeminino = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        CampoTabela = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        Objetoaluno = new javax.swing.JRadioButton();
        Objetocliente = new javax.swing.JRadioButton();
        Objetoprofessor = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pagina de cliente");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setBackground(new java.awt.Color(51, 51, 255));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cadastro de pessoas");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnExcluir.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnSalvar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        jLabel6.setText("Pesquisar:");

        btnEditar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(btnSalvar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExcluir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEditar)
                .addGap(51, 51, 51)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CampoPesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, 347, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExcluir)
                    .addComponent(btnSalvar)
                    .addComponent(jLabel6)
                    .addComponent(CampoPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditar))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setText("e-mail:");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setText("Telefone");

        campoNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoNomeActionPerformed(evt);
            }
        });

        campoEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoEmailActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Sexo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12))); // NOI18N
        jPanel3.setToolTipText("");

        buttonGroup1.add(campoMasculino);
        campoMasculino.setText("Masculino");

        buttonGroup1.add(campoFeminino);
        campoFeminino.setText("Feminino");
        campoFeminino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoFemininoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(campoMasculino)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoFeminino)
                .addGap(35, 35, 35))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoMasculino)
                    .addComponent(campoFeminino))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jLabel5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel5.setText("Nome:");

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel4MouseClicked(evt);
            }
        });

        CampoTabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome ", "Telefone", "email", "sexo", "id"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        CampoTabela.setToolTipText("");
        CampoTabela.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                CampoTabelaComponentAdded(evt);
            }
        });
        CampoTabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CampoTabelaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(CampoTabela);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 694, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tipo de Pessoa", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12))); // NOI18N
        jPanel5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        buttonGroup2.add(Objetoaluno);
        Objetoaluno.setText("Aluno");
        Objetoaluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ObjetoalunoActionPerformed(evt);
            }
        });

        buttonGroup2.add(Objetocliente);
        Objetocliente.setText("Resposável");
        Objetocliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ObjetoclienteActionPerformed(evt);
            }
        });

        buttonGroup2.add(Objetoprofessor);
        Objetoprofessor.setText("Professor");
        Objetoprofessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ObjetoprofessorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Objetoprofessor)
                    .addComponent(Objetocliente)
                    .addComponent(Objetoaluno))
                .addContainerGap(111, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(Objetocliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Objetoprofessor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Objetoaluno)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(campoNome)
                                        .addComponent(campoTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel3)))
                                .addGap(18, 18, 18)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(campoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(campoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(campoTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3)
                            .addGap(28, 28, 28))
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campoNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoNomeActionPerformed
       
    }//GEN-LAST:event_campoNomeActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed

int selectedRow = CampoTabela.getSelectedRow();

    if (selectedRow == -1) {
        JOptionPane.showMessageDialog(this, "Por favor, selecione um registro para excluir.", "Erro", JOptionPane.ERROR_MESSAGE);
        return;
    }

    Object idObject = CampoTabela.getValueAt(selectedRow, 4);

    if (idObject instanceof Integer) {
        int objetoID = (int) idObject;

        Object selectedObject = getSelectedObject();
        if (selectedObject != null) {
            try {
                if (selectedObject instanceof Cliente) {
                    Cliente cliente = new Cliente();
                    cliente.setId(objetoID);
                    clienteDAO.delete(cliente);
                } else if (selectedObject instanceof Aluno) {
                    Aluno aluno = new Aluno();
                    aluno.setId(objetoID);
                    alunoDAO.delete(aluno);
                } else if (selectedObject instanceof Professor) {
                    Professor professor = new Professor();
                    professor.setId(objetoID);
                    professorDAO.delete(professor);
                }

                DefaultTableModel tabela = (DefaultTableModel) CampoTabela.getModel();
                tabela.removeRow(selectedRow);
            } catch (Exception ex) {
                Logger.getLogger(ClienteGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    } else {
        JOptionPane.showMessageDialog(this, "ID do registro não é um número válido.", "Erro", JOptionPane.ERROR_MESSAGE);
    }
        
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void campoFemininoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoFemininoActionPerformed
       
    }//GEN-LAST:event_campoFemininoActionPerformed

    private void campoEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoEmailActionPerformed
      
    }//GEN-LAST:event_campoEmailActionPerformed

    private void ObjetoalunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ObjetoalunoActionPerformed
        
    }//GEN-LAST:event_ObjetoalunoActionPerformed

    private void ObjetoclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ObjetoclienteActionPerformed
      
    }//GEN-LAST:event_ObjetoclienteActionPerformed

    private void ObjetoprofessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ObjetoprofessorActionPerformed
       
    }//GEN-LAST:event_ObjetoprofessorActionPerformed
   
    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
 
    Object selectedObject = getSelectedObject(); 

    if (selectedObject != null) {
        try {
            if (selectedObject instanceof Cliente) {
                Cliente cliente = (Cliente) selectedObject;
                cliente.setNome(campoNome.getText());
                cliente.setEmail(campoEmail.getText());
                cliente.setTelefone(campoTelefone.getText());
                cliente.setSexo(campoMasculino.isSelected() ? "Masculino" : "Feminino");
                clienteDAO.saveOrUpdate(cliente);
            } else if (selectedObject instanceof Aluno) {
                Aluno aluno = (Aluno) selectedObject;
                aluno.setNome(campoNome.getText());
                aluno.setEmail(campoEmail.getText());
                aluno.setTelefone(campoTelefone.getText());
                aluno.setSexo(campoMasculino.isSelected() ? "Masculino" : "Feminino");
                alunoDAO.saveOrUpdate(aluno);
            } else if (selectedObject instanceof Professor) {
                Professor professor = (Professor) selectedObject;
                professor.setNome(campoNome.getText());
                professor.setEmail(campoEmail.getText());
                professor.setTelefone(campoTelefone.getText());
                professor.setSexo(campoMasculino.isSelected() ? "Masculino" : "Feminino");
                //professor.setFormacao(campoFormacao.getText());
                //professor.setSalario(Double.parseDouble(campoSalario.getText()));
                professorDAO.saveOrUpdate(professor);
            }

            atualizarTabela();

        } catch (Exception ex) {
            Logger.getLogger(ClienteGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
      

    }//GEN-LAST:event_btnSalvarActionPerformed

    private void CampoTabelaComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_CampoTabelaComponentAdded

    }//GEN-LAST:event_CampoTabelaComponentAdded
    private int idClienteSelecionado = -1;    
    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
   
    int selectedRow = CampoTabela.getSelectedRow();

    if (selectedRow == -1) {
        JOptionPane.showMessageDialog(this, "Por favor, selecione um registro para editar.", "Erro", JOptionPane.ERROR_MESSAGE);
        return;
    }

    Object idObject = CampoTabela.getValueAt(selectedRow, 4);

    if (idObject instanceof Integer) {
        int objetoID = (int) idObject;

        Object selectedObject = getSelectedObject();
        if (selectedObject != null) {
            try {
                if (selectedObject instanceof Cliente) {
                    Cliente cliente = new Cliente();
                    cliente.setId(objetoID);
                    cliente.setNome(campoNome.getText());
                    cliente.setEmail(campoEmail.getText());
                    cliente.setTelefone(campoTelefone.getText());
                    cliente.setSexo(campoMasculino.isSelected() ? "Masculino" : "Feminino");
                    clienteDAO.saveOrUpdate(cliente);
                } else if (selectedObject instanceof Aluno) {
                    Aluno aluno = new Aluno();
                    aluno.setId(objetoID);
                    aluno.setNome(campoNome.getText());
                    aluno.setEmail(campoEmail.getText());
                    aluno.setTelefone(campoTelefone.getText());
                    aluno.setSexo(campoMasculino.isSelected() ? "Masculino" : "Feminino");
                    alunoDAO.saveOrUpdate(aluno);
                } else if (selectedObject instanceof Professor) {
                    Professor professor = new Professor();
                    professor.setId(objetoID);
                    professor.setNome(campoNome.getText());
                    professor.setEmail(campoEmail.getText());
                    professor.setTelefone(campoTelefone.getText());
                    professor.setSexo(campoMasculino.isSelected() ? "Masculino" : "Feminino");
                    professorDAO.saveOrUpdate(professor);
                }

                DefaultTableModel tabela = (DefaultTableModel) CampoTabela.getModel();
                tabela.setValueAt(campoNome.getText(), selectedRow, 0);
                tabela.setValueAt(campoTelefone.getText(), selectedRow, 1);
                tabela.setValueAt(campoEmail.getText(), selectedRow, 2);
                tabela.setValueAt(campoMasculino.isSelected() ? "Masculino" : "Feminino", selectedRow, 3);
            } catch (Exception ex) {
                Logger.getLogger(ClienteGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    } else {
        JOptionPane.showMessageDialog(this, "ID do registro não é um número válido.", "Erro", JOptionPane.ERROR_MESSAGE);
    }
        try {
            atualizarTabela();
        } catch (Exception ex) {
            Logger.getLogger(ClienteGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void jPanel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseClicked
   
    }//GEN-LAST:event_jPanel4MouseClicked

    private void CampoTabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CampoTabelaMouseClicked
 
    int selectedRow = CampoTabela.getSelectedRow();
    if (selectedRow != -1) {
        campoNome.setText((String) CampoTabela.getValueAt(selectedRow, 0)); 
        campoTelefone.setText((String) CampoTabela.getValueAt(selectedRow, 1)); 
        campoEmail.setText((String) CampoTabela.getValueAt(selectedRow, 2)); 
        
        String sexo = (String) CampoTabela.getValueAt(selectedRow, 3); 
        campoMasculino.setSelected(sexo.equals("Masculino"));
        campoFeminino.setSelected(sexo.equals("Feminino"));
        
        
        idClienteSelecionado = (int) CampoTabela.getValueAt(selectedRow, 4);
        
     }
          

    }//GEN-LAST:event_CampoTabelaMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */ 
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ClienteGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClienteGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClienteGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClienteGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        /*
        Disciplina disciplina1=new Disciplina();
        disciplina1.setNome_disciplina("matematica");
        disciplina1.setCargahoraria(10);*/
        
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ClienteGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClienteGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClienteGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClienteGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }


        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClienteGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CampoPesquisar;
    private javax.swing.JTable CampoTabela;
    private javax.swing.JRadioButton Objetoaluno;
    private javax.swing.JRadioButton Objetocliente;
    private javax.swing.JRadioButton Objetoprofessor;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnSalvar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JTextField campoEmail;
    private javax.swing.JRadioButton campoFeminino;
    private javax.swing.JRadioButton campoMasculino;
    private javax.swing.JTextField campoNome;
    private javax.swing.JTextField campoTelefone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables


private void atualizarTabela() throws Exception {
    DefaultTableModel tabela = (DefaultTableModel) CampoTabela.getModel();
    tabela.setRowCount(0);

    List<Object> objects = new ArrayList<>();
    objects.addAll(clienteDAO.getAll());
    objects.addAll(alunoDAO.getAll());
    objects.addAll(professorDAO.getAll());

    for (Object object : objects) {
        if (object instanceof Cliente) {
            Cliente cliente = (Cliente) object;
            tabela.addRow(new Object[] {
                cliente.getNome(),
                cliente.getTelefone(),
                cliente.getEmail(),
                cliente.getSexo(),
                cliente.getId()
            });
        } else if (object instanceof Aluno) {
            Aluno aluno = (Aluno) object;
            tabela.addRow(new Object[] {
                aluno.getNome(),
                aluno.getTelefone(),
                aluno.getEmail(),
                aluno.getSexo(),
                aluno.getId()
            });
        } else if (object instanceof Professor) {
            Professor professor = (Professor) object;
            tabela.addRow(new Object[] {
                professor.getNome(),
                professor.getTelefone(),
                professor.getEmail(),
                professor.getSexo(),
                professor.getId()
            });
        }
    }
}

private Object getSelectedObject() {
    if (Objetocliente.isSelected()) {
        return new Cliente();
    } else if (Objetoaluno.isSelected()) {
        return new Aluno();
    } else if (Objetoprofessor.isSelected()) {
        return new Professor();
    } else {
        return null;
    }
}

}
