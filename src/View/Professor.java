/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Marcos Vinicius
 */
public class Professor extends javax.swing.JFrame {

    
/**
* Creates new form Professor
*/
    
    private void carregarDadosTabela() {
        try (Connection conexao = ConexaoBD.obterConexao()) {
        String sql = "SELECT  cpf_professor, nome_professor, instituicao, externo FROM professor";
        try (PreparedStatement preparedStatement = conexao.prepareStatement(sql)) {
            ResultSet resultSet = preparedStatement.executeQuery();

            // Limpa a tabela antes de adicionar novos dados
            DefaultTableModel model = (DefaultTableModel) jTableProfessor.getModel();
            model.setRowCount(0);

            // Adiciona os dados na tabela
            while (resultSet.next()) {
                Object[] row = {
                    resultSet.getString("nome_professor"),
                    resultSet.getString("cpf_professor"),
                    resultSet.getString("instituicao"),
                    resultSet.getString("externo"),
                };
                model.addRow(row);
            }
        }
    } catch (SQLException e) {
        e.printStackTrace();
        exibirMensagemErro();
    }
     }
    
    private DefaultTableModel model;
    
    public Professor() {
        initComponents();
        
        carregarDadosTabela(); // Adicione esta linha para carregar os dados inicialmente
        
        // iniciar modelo tabela 
        model = new DefaultTableModel();
        jTableProfessor.setModel(model);
        model.addColumn("Nome");
        model.addColumn("CPF");
        model.addColumn("Instituição");
        model.addColumn("Externo");
        
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtxtNomeProfessor = new javax.swing.JTextField();
        jtxtCPFProfessor = new javax.swing.JTextField();
        jtxtInstituicao = new javax.swing.JTextField();
        jbntCadastrarProfessor = new javax.swing.JButton();
        jbntListarProfessor = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jtxtExterno = new javax.swing.JTextField();
        jbntEditarProfessor = new javax.swing.JButton();
        jbntExcluirProfessor = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableProfessor = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(193, 166));

        jLabel1.setText("Nome:");

        jLabel2.setText("CPF:");

        jLabel3.setText("Instituição:");

        jbntCadastrarProfessor.setText("Cadastrar");
        jbntCadastrarProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbntCadastrarProfessorActionPerformed(evt);
            }
        });

        jbntListarProfessor.setText("Listar");
        jbntListarProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbntListarProfessorActionPerformed(evt);
            }
        });

        jLabel5.setText("Externo:");

        jbntEditarProfessor.setText("Editar");
        jbntEditarProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbntEditarProfessorActionPerformed(evt);
            }
        });

        jbntExcluirProfessor.setText("Excluir");
        jbntExcluirProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbntExcluirProfessorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jbntCadastrarProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbntEditarProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbntExcluirProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbntListarProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtxtNomeProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtxtInstituicao, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtxtExterno, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtxtCPFProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtxtNomeProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtxtCPFProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtxtInstituicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jtxtExterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbntCadastrarProfessor)
                    .addComponent(jbntListarProfessor)
                    .addComponent(jbntEditarProfessor)
                    .addComponent(jbntExcluirProfessor))
                .addGap(11, 11, 11))
        );

        jScrollPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jScrollPane1MouseClicked(evt);
            }
        });

        jTableProfessor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "CPF", "Instituição", "Externo"
            }
        ));
        jScrollPane1.setViewportView(jTableProfessor);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbntListarProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbntListarProfessorActionPerformed
        // TODO add your handling code here:
        
        carregarDadosTabela(); // Adicione esta linha para carregar os dados inicialmente
    }//GEN-LAST:event_jbntListarProfessorActionPerformed

    private void jbntCadastrarProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbntCadastrarProfessorActionPerformed
        // Botão para cadastrar professor 
        
        String cpf_professor = jtxtCPFProfessor.getText();
        String nome_professor = jtxtNomeProfessor.getText();
        String instituicao = jtxtInstituicao.getText();
        String externo = jtxtExterno.getText();
        
        try (Connection conexao = ConexaoBD.obterConexao()) {
            String sql = "INSERT INTO professor (cpf_professor, nome_professor, instituicao, externo) VALUES (?, ?, ?, ?)";
            try (PreparedStatement preparedStatement = conexao.prepareStatement(sql)) {
                preparedStatement.setString(1, cpf_professor);
                preparedStatement.setString(2, nome_professor);
                preparedStatement.setString(3, instituicao);
                preparedStatement.setString(4, externo);

                int linhasAfetadas = preparedStatement.executeUpdate();

                if (linhasAfetadas > 0) {
                    exibirMensagemSucesso();
                } else {
                    exibirMensagemErro();
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            exibirMensagemErro();
        }   
        
    }//GEN-LAST:event_jbntCadastrarProfessorActionPerformed

    private void jbntExcluirProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbntExcluirProfessorActionPerformed
        // TODO add your handling code here:
        
        String cpf_professor = jtxtCPFProfessor.getText();
    
    try (Connection conexao = ConexaoBD.obterConexao()) {
        String sql = "DELETE FROM professor WHERE cpf_professor = ?";
        try (PreparedStatement preparedStatement = conexao.prepareStatement(sql)) {
            preparedStatement.setString(1, cpf_professor);

            int linhasAfetadas = preparedStatement.executeUpdate();

            if (linhasAfetadas > 0) {
                exibirMensagemSucesso();
            } else {
                exibirMensagemErro();
            }
        }
    } catch (SQLException e) {
        e.printStackTrace();
        exibirMensagemErro();
    }  
        
    }//GEN-LAST:event_jbntExcluirProfessorActionPerformed

    private void jbntEditarProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbntEditarProfessorActionPerformed
        // TODO add your handling code here:
        
        String cpf_professor = jtxtCPFProfessor.getText();
    String nome_professor = jtxtNomeProfessor.getText();
    String instituicao = jtxtInstituicao.getText();
    String externo = jtxtExterno.getText();
    
    try (Connection conexao = ConexaoBD.obterConexao()) {
        String sql = "UPDATE professor SET nome_professor = ?, instituicao = ?, externo = ? WHERE cpf_professor = ?";
        try (PreparedStatement preparedStatement = conexao.prepareStatement(sql)) {
            preparedStatement.setString(1, nome_professor);
            preparedStatement.setString(2, instituicao);
            preparedStatement.setString(3, externo);
            preparedStatement.setString(4, cpf_professor);

            int linhasAfetadas = preparedStatement.executeUpdate();

            if (linhasAfetadas > 0) {
                exibirMensagemSucesso();
            } else {
                exibirMensagemErro();
            }
        }
    } catch (SQLException e) {
        e.printStackTrace();
        exibirMensagemErro();
    }   
        
    }//GEN-LAST:event_jbntEditarProfessorActionPerformed

    private void jScrollPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jScrollPane1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jScrollPane1MouseClicked

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
            java.util.logging.Logger.getLogger(Professor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Professor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Professor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Professor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Professor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableProfessor;
    private javax.swing.JButton jbntCadastrarProfessor;
    private javax.swing.JButton jbntEditarProfessor;
    private javax.swing.JButton jbntExcluirProfessor;
    private javax.swing.JButton jbntListarProfessor;
    private javax.swing.JTextField jtxtCPFProfessor;
    private javax.swing.JTextField jtxtExterno;
    private javax.swing.JTextField jtxtInstituicao;
    private javax.swing.JTextField jtxtNomeProfessor;
    // End of variables declaration//GEN-END:variables

    private void exibirMensagemSucesso() {
    javax.swing.JOptionPane.showMessageDialog(
        this, "Dados inseridos com sucesso!", "Sucesso", 
        javax.swing.JOptionPane.INFORMATION_MESSAGE
    );

    // Aqui você pode adicionar outras ações após o sucesso, se necessário
}

    private void exibirMensagemErro() {
    javax.swing.JOptionPane.showMessageDialog(
        this, "Erro ao inserir dados.", "Erro", 
        javax.swing.JOptionPane.ERROR_MESSAGE
    );

    // Aqui você pode adicionar outras ações após o erro, se necessário
}

    private void exibirMensagemErroExclusao() {
            JOptionPane.showMessageDialog(this, "Erro ao excluir o professor.", "Erro", JOptionPane.ERROR_MESSAGE);

    }

    private void exibirMensagemSucessoExclusao() {
            JOptionPane.showMessageDialog(this, "Professor excluído com sucesso.", "Sucesso", JOptionPane.INFORMATION_MESSAGE);

    }

    private void exibirMensagemErroEdicao() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void exibirMensagemSucessoEdicao() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
