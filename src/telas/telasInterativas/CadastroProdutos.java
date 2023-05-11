package telas.telasInterativas;

/**
 * @author : Davidson Teixeira Filho
 * @date : 26/01/2023
 */

import database.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.awt.TrayIcon;
import javax.naming.Context;
import javax.swing.JOptionPane;

public class CadastroProdutos extends javax.swing.JFrame {

    public CadastroProdutos() {
        setTitle("Cadastro de produtos");
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLNome = new javax.swing.JLabel();
        jTFProdNome = new javax.swing.JTextField();
        jLIdade = new javax.swing.JLabel();
        jLContato = new javax.swing.JLabel();
        jBCadastrar = new javax.swing.JButton();
        jBLimparCad = new javax.swing.JButton();
        jBVoltarCad = new javax.swing.JButton();
        jLExib = new javax.swing.JLabel();
        jTFQuantidade = new javax.swing.JFormattedTextField();
        jTFValor = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLNome.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLNome.setText("Nome do produto");

        jLIdade.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLIdade.setText("Valor (separe as casas decimais com '.')");

        jLContato.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLContato.setText("Quantidade");

        jBCadastrar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jBCadastrar.setText("Cadastrar");
        jBCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCadastrarActionPerformed(evt);
            }
        });

        jBLimparCad.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jBLimparCad.setText("Limpar");
        jBLimparCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimparCadActionPerformed(evt);
            }
        });

        jBVoltarCad.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jBVoltarCad.setText("Voltar");
        jBVoltarCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBVoltarCadActionPerformed(evt);
            }
        });

        jTFQuantidade.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getIntegerInstance())));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBVoltarCad, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75)
                        .addComponent(jBLimparCad, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                        .addComponent(jBCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTFValor, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTFQuantidade)
                            .addComponent(jLNome, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLIdade, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLContato)
                                .addGap(170, 170, 170)
                                .addComponent(jLExib, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTFProdNome, javax.swing.GroupLayout.DEFAULT_SIZE, 444, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFProdNome, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLIdade)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFValor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLContato)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBVoltarCad, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBLimparCad, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLExib, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //  BOTÃO QUE REDIRECIONA PARA A TELA PRINCIPAL
    private void jBVoltarCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBVoltarCadActionPerformed
        dispose();
        TelaPrincipal set = new TelaPrincipal(); 
        set.setVisible(true);
    }//GEN-LAST:event_jBVoltarCadActionPerformed

    //  BOTÃO QUE LIMPA AS INFORMAÇÕES DA TELA
    private void jBLimparCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimparCadActionPerformed
        jTFProdNome.setText(null);
        jTFValor.setText(null);
        jTFQuantidade.setText(null);
    }//GEN-LAST:event_jBLimparCadActionPerformed

    //  BOTÃO QUE CADASTRA O PRODUTO
    private void jBCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCadastrarActionPerformed
        int quantidade;
        String nome;
        double valor;
        
        valor = Double.parseDouble(jTFValor.getText());
        nome = jTFProdNome.getText();
        quantidade = Integer.parseInt(jTFQuantidade.getText());
        
            try {
                String insert = "insert into produto(nome, valor, quantidade) values (?, ?, ?)";
                Connection con = new Conexao().getConnection();
                System.out.println("Connection established!");
                
                PreparedStatement stmt = con.prepareStatement(insert);
                
                stmt.setString(1, nome);
                stmt.setDouble(2, valor);
                stmt.setInt(3, quantidade);
                
                stmt.executeUpdate();
                
                stmt.close();
                System.out.println("Connection closed!");
                
                dispose();
                CadastroProdutos set = new CadastroProdutos();
                set.setVisible(true);
                
                dispose();
                CadastroProdutos obj = new CadastroProdutos();
                obj.setVisible(true);
                
                JOptionPane.showMessageDialog(jLExib, "Produto cadastrado com sucesso!");

            } catch (SQLException ex) {
                System.err.println(ex);
            } catch (Exception ex) {
            Logger.getLogger(CadastroProdutos.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jBCadastrarActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroProdutos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCadastrar;
    private javax.swing.JButton jBLimparCad;
    private javax.swing.JButton jBVoltarCad;
    private javax.swing.JLabel jLContato;
    private javax.swing.JLabel jLExib;
    private javax.swing.JLabel jLIdade;
    private javax.swing.JLabel jLNome;
    private javax.swing.JTextField jTFProdNome;
    private javax.swing.JFormattedTextField jTFQuantidade;
    private javax.swing.JTextField jTFValor;
    // End of variables declaration//GEN-END:variables
}
