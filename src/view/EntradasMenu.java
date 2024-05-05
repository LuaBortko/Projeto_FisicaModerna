/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import control.EntradasController;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import model.FuncaoDeOnda;

/**
 *
 * @author luana
 */
public class EntradasMenu extends javax.swing.JFrame {

    /**
     * Creates new form EntradasMenu
     */
    public EntradasMenu() {
        initComponents();
        control = new EntradasController(this);
    }

    public JButton getBtcalcular() {
        return btcalcular;
    }

    public void setBtcalcular(JButton btcalcular) {
        this.btcalcular = btcalcular;
    }

    public ButtonGroup getBtgMassa() {
        return btgMassa;
    }

    public void setBtgMassa(ButtonGroup btgMassa) {
        this.btgMassa = btgMassa;
    }

    public JRadioButton getBtjEletron() {
        return btjEletron;
    }

    public void setBtjEletron(JRadioButton btjEletron) {
        this.btjEletron = btjEletron;
    }

    public JRadioButton getBtjProton() {
        return btjProton;
    }

    public void setBtjProton(JRadioButton btjProton) {
        this.btjProton = btjProton;
    }

    public JButton getjButton1() {
        return jButton1;
    }

    public void setjButton1(JButton jButton1) {
        this.jButton1 = jButton1;
    }

    public JLabel getjLabel1() {
        return jLabel1;
    }

    public void setjLabel1(JLabel jLabel1) {
        this.jLabel1 = jLabel1;
    }

    public JLabel getjLabel2() {
        return jLabel2;
    }

    public void setjLabel2(JLabel jLabel2) {
        this.jLabel2 = jLabel2;
    }

    public JPanel getjPanel1() {
        return jPanel1;
    }

    public void setjPanel1(JPanel jPanel1) {
        this.jPanel1 = jPanel1;
    }

    public JLabel getLblA() {
        return lblA;
    }

    public void setLblA(JLabel lblA) {
        this.lblA = lblA;
    }

    public JLabel getLblB() {
        return lblB;
    }

    public void setLblB(JLabel lblB) {
        this.lblB = lblB;
    }

    public JLabel getLblLargura() {
        return lblLargura;
    }

    public void setLblLargura(JLabel lblLargura) {
        this.lblLargura = lblLargura;
    }

    public JLabel getLblNF1() {
        return lblNF1;
    }

    public void setLblNF1(JLabel lblNF1) {
        this.lblNF1 = lblNF1;
    }

    public JLabel getLblNI() {
        return lblNI;
    }

    public void setLblNI(JLabel lblNI) {
        this.lblNI = lblNI;
    }

    public JLabel getLblPropriedades() {
        return lblPropriedades;
    }

    public void setLblPropriedades(JLabel lblPropriedades) {
        this.lblPropriedades = lblPropriedades;
    }

    public JLabel getLblPropriedades2() {
        return lblPropriedades2;
    }

    public void setLblPropriedades2(JLabel lblPropriedades2) {
        this.lblPropriedades2 = lblPropriedades2;
    }

    public JLabel getLblUnidadeM() {
        return lblUnidadeM;
    }

    public void setLblUnidadeM(JLabel lblUnidadeM) {
        this.lblUnidadeM = lblUnidadeM;
    }

    public JTextField getTxtEntradaLargura() {
        return txtEntradaLargura;
    }

    public void setTxtEntradaLargura(JTextField txtEntradaLargura) {
        this.txtEntradaLargura = txtEntradaLargura;
    }

    public JTextField getTxtEntradaNF() {
        return txtEntradaNF;
    }

    public void setTxtEntradaNF(JTextField txtEntradaNF) {
        this.txtEntradaNF = txtEntradaNF;
    }

    public JTextField getTxtEntradaNI() {
        return txtEntradaNI;
    }

    public void setTxtEntradaNI(JTextField txtEntradaNI) {
        this.txtEntradaNI = txtEntradaNI;
    }

    public JTextField getTxtEntradaProbA() {
        return txtEntradaProbA;
    }

    public void setTxtEntradaProbA(JTextField txtEntradaProbA) {
        this.txtEntradaProbA = txtEntradaProbA;
    }

    public JTextField getTxtEntradaProbB() {
        return txtEntradaProbB;
    }

    public void setTxtEntradaProbB(JTextField txtEntradaProbB) {
        this.txtEntradaProbB = txtEntradaProbB;
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        btgMassa = new javax.swing.ButtonGroup();
        lblLargura = new javax.swing.JLabel();
        lblUnidadeM = new javax.swing.JLabel();
        txtEntradaLargura = new javax.swing.JTextField();
        lblNI = new javax.swing.JLabel();
        txtEntradaNI = new javax.swing.JTextField();
        lblA = new javax.swing.JLabel();
        txtEntradaProbA = new javax.swing.JTextField();
        lblPropriedades = new javax.swing.JLabel();
        lblPropriedades2 = new javax.swing.JLabel();
        txtEntradaNF = new javax.swing.JTextField();
        lblNF1 = new javax.swing.JLabel();
        lblB = new javax.swing.JLabel();
        txtEntradaProbB = new javax.swing.JTextField();
        btcalcular = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btjProton = new javax.swing.JRadioButton();
        btjEletron = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Entradas");

        lblLargura.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblLargura.setText("Largura da Caixa (L):");

        lblUnidadeM.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblUnidadeM.setText("m");

        txtEntradaLargura.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        lblNI.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblNI.setText("N inicial da particula(ni):");

        txtEntradaNI.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        lblA.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblA.setText("- a:");

        txtEntradaProbA.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        lblPropriedades.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblPropriedades.setText("Dados de Probabilidade");

        lblPropriedades2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblPropriedades2.setText("P( a <=x<= b )    ");

        txtEntradaNF.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        lblNF1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblNF1.setText("N final da particula(nf):");

        lblB.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblB.setText("- b:");

        txtEntradaProbB.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        btcalcular.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btcalcular.setText("CALCULAR");
        btcalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btcalcularActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btgMassa.add(btjProton);
        btjProton.setText("Proton");

        btjEletron.setText("Eletron");

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setText("Particula");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btjProton)
                    .addComponent(btjEletron)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(btjEletron)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btjProton)
                .addGap(16, 16, 16))
        );

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setText("ENTRADAS");

        jMenu1.setText("função de onda");
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblPropriedades2)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(lblB)
                                        .addGap(4, 4, 4)
                                        .addComponent(txtEntradaProbB))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblA)
                                        .addGap(4, 4, 4)
                                        .addComponent(txtEntradaProbA, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(72, 72, 72)
                                .addComponent(btcalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(61, 61, 61))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPropriedades)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(lblNF1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtEntradaNF, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblNI)
                                    .addGap(3, 3, 3)
                                    .addComponent(txtEntradaNI, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel2)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblLargura)
                                    .addGap(111, 111, 111)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(195, 195, 195)
                                .addComponent(txtEntradaLargura, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblUnidadeM)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLargura)
                    .addComponent(txtEntradaLargura, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUnidadeM))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNI)
                            .addComponent(txtEntradaNI, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNF1)
                            .addComponent(txtEntradaNF, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addComponent(lblPropriedades))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPropriedades2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblA)
                            .addComponent(txtEntradaProbA, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblB)
                            .addComponent(txtEntradaProbB, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btcalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btcalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btcalcularActionPerformed
        dados = control.guarda();
    }//GEN-LAST:event_btcalcularActionPerformed

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
//            java.util.logging.Logger.getLogger(EntradasMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(EntradasMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(EntradasMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(EntradasMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new EntradasMenu().setVisible(true);
//            }
//        });
//    }
    private EntradasController control;
    private FuncaoDeOnda dados;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btcalcular;
    private javax.swing.ButtonGroup btgMassa;
    private javax.swing.JRadioButton btjEletron;
    private javax.swing.JRadioButton btjProton;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblA;
    private javax.swing.JLabel lblB;
    private javax.swing.JLabel lblLargura;
    private javax.swing.JLabel lblNF1;
    private javax.swing.JLabel lblNI;
    private javax.swing.JLabel lblPropriedades;
    private javax.swing.JLabel lblPropriedades2;
    private javax.swing.JLabel lblUnidadeM;
    private javax.swing.JTextField txtEntradaLargura;
    private javax.swing.JTextField txtEntradaNF;
    private javax.swing.JTextField txtEntradaNI;
    private javax.swing.JTextField txtEntradaProbA;
    private javax.swing.JTextField txtEntradaProbB;
    // End of variables declaration//GEN-END:variables
}
