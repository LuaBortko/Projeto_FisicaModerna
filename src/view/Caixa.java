/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import control.ControllerCaixa;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author luana
 */
public class Caixa extends javax.swing.JFrame {

    /**
     * Creates new form Caixa
     */
    public Caixa() {
        initComponents();
         controller = new ControllerCaixa(this);
         this.getLblExplicacao().setText("<html>A função de onda (no SI) de uma"
                 + " partícula confinada em um poço de potencial infinito"
                 + " unidimensional é dada por 𝜓(𝑥)=𝐴 sin(K . Xp)");
    }

    public JLabel getLblExplicacao() {
        return lblExplicacao;
    }

    public void setLblExplicacao(JLabel lblExplicacao) {
        this.lblExplicacao = lblExplicacao;
    }
    
    

    public ControllerCaixa getController() {
        return controller;
    }

    public void setController(ControllerCaixa controller) {
        this.controller = controller;
    }

    public JButton getBtEnviar() {
        return btEnviar;
    }

    public void setBtEnviar(JButton btEnviar) {
        this.btEnviar = btEnviar;
    }


    public JLabel getLblA() {
        return lblA;
    }

    public void setLblA(JLabel lblA) {
        this.lblA = lblA;
    }

    public JLabel getLblK() {
        return lblK;
    }

    public void setLblK(JLabel lblK) {
        this.lblK = lblK;
    }

    public JLabel getLblL() {
        return lblL;
    }

    public void setLblL(JLabel lblL) {
        this.lblL = lblL;
    }

    public JLabel getLblMenos2() {
        return lblMenos2;
    }

    public void setLblMenos2(JLabel lblMenos2) {
        this.lblMenos2 = lblMenos2;
    }

    public JLabel getLblObs() {
        return lblObs;
    }

    public void setLblObs(JLabel lblObs) {
        this.lblObs = lblObs;
    }

    public JLabel getLblRadM() {
        return lblRadM;
    }

    public void setLblRadM(JLabel lblRadM) {
        this.lblRadM = lblRadM;
    }


    public JLabel getLblTitulo() {
        return lblTitulo;
    }

    public void setLblTitulo(JLabel lblTitulo) {
        this.lblTitulo = lblTitulo;
    }

    public JLabel getLblXp() {
        return lblXp;
    }

    public void setLblXp(JLabel lblXp) {
        this.lblXp = lblXp;
    }

    public JLabel getLblm() {
        return lblm;
    }

    public void setLblm(JLabel lblm) {
        this.lblm = lblm;
    }

    public JTextField getTxtA() {
        return txtA;
    }

    public void setTxtA(JTextField txtA) {
        this.txtA = txtA;
    }

    public JTextField getTxtK() {
        return txtK;
    }

    public void setTxtK(JTextField txtK) {
        this.txtK = txtK;
    }

    public JTextField getTxtXp() {
        return txtXp;
    }

    public void setTxtXp(JTextField txtXp) {
        this.txtXp = txtXp;
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btEnviar = new javax.swing.JButton();
        txtA = new javax.swing.JTextField();
        txtK = new javax.swing.JTextField();
        txtXp = new javax.swing.JTextField();
        lblm = new javax.swing.JLabel();
        lblMenos2 = new javax.swing.JLabel();
        lblRadM = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        lblL = new javax.swing.JLabel();
        lblA = new javax.swing.JLabel();
        lblObs = new javax.swing.JLabel();
        lblK = new javax.swing.JLabel();
        lblXp = new javax.swing.JLabel();
        lblExplicacao = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btEnviar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btEnviar.setText("ENVIAR");
        btEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEnviarActionPerformed(evt);
            }
        });

        txtA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAActionPerformed(evt);
            }
        });

        lblm.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblm.setText("m");

        lblMenos2.setText("-1/2");

        lblRadM.setText("rad/m");

        lblTitulo.setFont(new java.awt.Font("Goudy Old Style", 1, 24)); // NOI18N
        lblTitulo.setText("Entradas pelo Teclado");

        lblL.setText("L");

        lblA.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblA.setText("A:");

        lblObs.setText("*Xp entre 0 e 1");

        lblK.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblK.setText("K:");

        lblXp.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblXp.setText("Xp:");

        jMenu1.setText("Menu");

        jMenuItem1.setText("menu");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(163, 163, 163)
                .addComponent(btEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblExplicacao, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(74, 74, 74)
                            .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(149, 149, 149)
                            .addComponent(lblObs, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblK, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblA, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblXp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtA)
                                .addComponent(txtK)
                                .addComponent(txtXp, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(28, 28, 28)
                                    .addComponent(lblL, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(22, 22, 22)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblRadM, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(lblm, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(lblMenos2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))))))))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblExplicacao, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTitulo)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblA)
                            .addComponent(lblm))
                        .addGap(57, 57, 57))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblMenos2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblK)
                            .addComponent(txtK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblRadM))
                        .addGap(1, 1, 1)))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblXp)
                        .addComponent(lblL))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtXp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(lblObs)))
                .addGap(18, 18, 18)
                .addComponent(btEnviar)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEnviarActionPerformed
        controller.valores();
    }//GEN-LAST:event_btEnviarActionPerformed

    private void txtAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        Menu m = new Menu();
        m.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Caixa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Caixa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Caixa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Caixa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Caixa().setVisible(true);
//            }
//        });
//    }
    
    private ControllerCaixa controller;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btEnviar;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JLabel lblA;
    private javax.swing.JLabel lblExplicacao;
    private javax.swing.JLabel lblK;
    private javax.swing.JLabel lblL;
    private javax.swing.JLabel lblMenos2;
    private javax.swing.JLabel lblObs;
    private javax.swing.JLabel lblRadM;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblXp;
    private javax.swing.JLabel lblm;
    private javax.swing.JTextField txtA;
    private javax.swing.JTextField txtK;
    private javax.swing.JTextField txtXp;
    // End of variables declaration//GEN-END:variables
}