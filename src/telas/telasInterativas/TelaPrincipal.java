package telas.telasInterativas;

/**
 * @author : Davidson Teixeira Filho
 * @date : 26/01/2023
 */

import java.util.logging.Level;
import java.util.logging.Logger;
import telas.telasExibicao.VizualizarSaldoAcampantes;
import telas.telasExibicao.VizualizarAcampantes;
import telas.telasExibicao.VizualizarProdutos;

public class TelaPrincipal extends javax.swing.JFrame {

    public TelaPrincipal() {
        setTitle("Tela principal");
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jBCadAcamp = new javax.swing.JButton();
        jBVizuAcamp = new javax.swing.JButton();
        jBCompra = new javax.swing.JButton();
        jBDeposito = new javax.swing.JButton();
        jBCadProduto = new javax.swing.JButton();
        jBAltProduto = new javax.swing.JButton();
        jBVizuSaldo = new javax.swing.JButton();
        jBVizuProd = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jBCadAcamp.setText("Cadastrar acampante");
        jBCadAcamp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCadAcampActionPerformed(evt);
            }
        });

        jBVizuAcamp.setText("Vizualizar acampantes");
        jBVizuAcamp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBVizuAcampActionPerformed(evt);
            }
        });

        jBCompra.setText("Efetuar compra");
        jBCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCompraActionPerformed(evt);
            }
        });

        jBDeposito.setText("Efetuar depósito");
        jBDeposito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBDepositoActionPerformed(evt);
            }
        });

        jBCadProduto.setText("Cadastrar produto");
        jBCadProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCadProdutoActionPerformed(evt);
            }
        });

        jBAltProduto.setText("Alterar produto");
        jBAltProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAltProdutoActionPerformed(evt);
            }
        });

        jBVizuSaldo.setText("Saldo dos acampantes");
        jBVizuSaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBVizuSaldoActionPerformed(evt);
            }
        });

        jBVizuProd.setText("Vizualizar produtos");
        jBVizuProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBVizuProdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(166, 166, 166)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBAltProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBVizuSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBVizuAcamp, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBDeposito, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBVizuProd, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBCadProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBCadAcamp, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(185, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jBCadAcamp, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBCadProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBDeposito, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBAltProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBVizuAcamp, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBVizuSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBVizuProd, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //  BOTÃO QUE REDIRECIONA PARA A TELA DE CADASTRO DOS ACAMPANTES
    private void jBCadAcampActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCadAcampActionPerformed
        dispose();
        CadastroAcampante set = new CadastroAcampante();
        set.setVisible(true);
    }//GEN-LAST:event_jBCadAcampActionPerformed

        //  BOTÃO QUE REDIRECIONA PARA A TELA DE VIZUALIZAÇÃO DOS ACAMPANTES
    private void jBVizuAcampActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBVizuAcampActionPerformed
        try {
            dispose();
            VizualizarAcampantes set = new VizualizarAcampantes();
            set.setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jBVizuAcampActionPerformed

        //  BOTÃO QUE REDIRECIONA PARA A TELA DE COMPRA
    private void jBCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCompraActionPerformed
        dispose();
        TelaCompra set = new TelaCompra();
        set.setVisible(true);
    }//GEN-LAST:event_jBCompraActionPerformed

        //  BOTÃO QUE REDIRECIONA PARA A TELA DE DEPÓSITO
    private void jBDepositoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBDepositoActionPerformed
        dispose();
        DepositoAcampante set = new DepositoAcampante();
        set.setVisible(true);
    }//GEN-LAST:event_jBDepositoActionPerformed

        //  BOTÃO QUE REDIRECIONA PARA A TELA DE CADASTRO DE PRODUTOS
    private void jBCadProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCadProdutoActionPerformed
        dispose();
        CadastroProdutos obj = new CadastroProdutos();
        obj.setVisible(true);
    }//GEN-LAST:event_jBCadProdutoActionPerformed

        //  BOTÃO QUE REDIRECIONA PARA A TELA DE ALTERAÇÃO DE PRODUTOS
    private void jBAltProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAltProdutoActionPerformed
        dispose();
        TelaAlterarProduto obj = new TelaAlterarProduto();
        obj.setVisible(true);
    }//GEN-LAST:event_jBAltProdutoActionPerformed

        //  BOTÃO QUE REDIRECIONA PARA A TELA DE VIZUALIZAÇÃO DE SALDO DOS ACAMPANTES
    private void jBVizuSaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBVizuSaldoActionPerformed
        try {
            dispose();
            VizualizarSaldoAcampantes obj = new VizualizarSaldoAcampantes();
            obj.setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jBVizuSaldoActionPerformed

        //  BOTÃO QUE REDIRECIONA PARA A TELA DE VIZUALIZAÇÃO DOS PRODUTOS
    private void jBVizuProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBVizuProdActionPerformed
        dispose();
        try {
            VizualizarProdutos obt = new VizualizarProdutos();
            obt.setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jBVizuProdActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAltProduto;
    private javax.swing.JButton jBCadAcamp;
    private javax.swing.JButton jBCadProduto;
    private javax.swing.JButton jBCompra;
    private javax.swing.JButton jBDeposito;
    private javax.swing.JButton jBVizuAcamp;
    private javax.swing.JButton jBVizuProd;
    private javax.swing.JButton jBVizuSaldo;
    // End of variables declaration//GEN-END:variables
}
