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
import javax.swing.JOptionPane;

public class CadastroAcampante extends javax.swing.JFrame {

    public CadastroAcampante() {
        setTitle("Cadastro de acampante");
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLRG = new javax.swing.JLabel();
        jLIdade = new javax.swing.JLabel();
        jLContato = new javax.swing.JLabel();
        jBCadastrar = new javax.swing.JButton();
        jBLimparCad = new javax.swing.JButton();
        jBVoltarCad = new javax.swing.JButton();
        jLExib = new javax.swing.JLabel();
        jLNome1 = new javax.swing.JLabel();
        jTFNome = new javax.swing.JTextField();
        jLAlergia = new javax.swing.JLabel();
        jTFAlergia = new javax.swing.JTextField();
        jTFContato = new javax.swing.JFormattedTextField();
        jTFRG = new javax.swing.JFormattedTextField();
        jTFIdade = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLRG.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLRG.setText("RG");

        jLIdade.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLIdade.setText("Idade");

        jLContato.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLContato.setText("Contato");

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

        jLNome1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLNome1.setText("Nome");

        jLAlergia.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLAlergia.setText("Alergia");

        try {
            jTFContato.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            jTFRG.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("MG-##.###.###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jTFIdade.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("##"))));

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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLContato)
                                .addGap(177, 177, 177)
                                .addComponent(jLExib, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLRG)
                            .addComponent(jTFNome, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLAlergia))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLNome1)
                            .addComponent(jLIdade)
                            .addComponent(jTFIdade)
                            .addComponent(jTFRG, javax.swing.GroupLayout.DEFAULT_SIZE, 477, Short.MAX_VALUE)
                            .addComponent(jTFContato)
                            .addComponent(jTFAlergia))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLNome1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFNome, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLIdade)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(jLRG)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFRG, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLContato)
                    .addComponent(jLExib, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFContato, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLAlergia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFAlergia, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 16, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBVoltarCad, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBLimparCad, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
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
        jTFRG.setText(null);
        jTFNome.setText(null);
        jTFAlergia.setText(null);
        jTFIdade.setText(null);
        jTFContato.setText(null);
    }//GEN-LAST:event_jBLimparCadActionPerformed

    //  BOTÃO QUE CADASTRA O ACAMPANTE
    private void jBCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCadastrarActionPerformed
        Integer idade;
        String nome, contato, rg, alergia;

        idade = Integer.parseInt(jTFIdade.getText());
        nome = jTFNome.getText();
        contato = jTFContato.getText();
        rg = jTFRG.getText();
        alergia = jTFAlergia.getText();
        
        System.out.println(nome);

        try {
            String insert = "insert into acampante(nome, idade, contato, saldo, rg, alergia) values (?,?,?,?,?,?)";
            Connection con = new Conexao().getConnection();
            System.out.println("Connection established!");

            PreparedStatement stmt = con.prepareStatement(insert);

            stmt.setString(1, nome);
            stmt.setInt(2, idade);
            stmt.setString(3, contato);
            stmt.setFloat(4, 0);
            stmt.setString(5, rg);
            stmt.setString(6, alergia);

            stmt.executeUpdate();

            stmt.close();
            System.out.println("Connection closed!");

            dispose();
            CadastroAcampante set = new CadastroAcampante();
            set.setVisible(true);

            JOptionPane.showMessageDialog(jLExib, "Acampante cadastrado com sucesso!");

        } catch (SQLException ex) {
            System.err.println(ex);
        } catch (Exception ex) {
            Logger.getLogger(CadastroAcampante.class.getName()).log(Level.SEVERE, null, ex);
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
            java.util.logging.Logger.getLogger(CadastroAcampante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroAcampante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroAcampante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroAcampante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroAcampante().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCadastrar;
    private javax.swing.JButton jBLimparCad;
    private javax.swing.JButton jBVoltarCad;
    private javax.swing.JLabel jLAlergia;
    private javax.swing.JLabel jLContato;
    private javax.swing.JLabel jLExib;
    private javax.swing.JLabel jLIdade;
    private javax.swing.JLabel jLNome1;
    private javax.swing.JLabel jLRG;
    private javax.swing.JTextField jTFAlergia;
    private javax.swing.JFormattedTextField jTFContato;
    private javax.swing.JFormattedTextField jTFIdade;
    private javax.swing.JTextField jTFNome;
    private javax.swing.JFormattedTextField jTFRG;
    // End of variables declaration//GEN-END:variables
}
