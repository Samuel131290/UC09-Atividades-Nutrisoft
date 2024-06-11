package telas;


import telas.imc;
import telas.gastocalorico;

public class inicial extends javax.swing.JFrame {

    public inicial() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        NutriSoft = new javax.swing.JLabel();
        IMC = new javax.swing.JButton();
        GastoCalorico = new javax.swing.JButton();
        Recomendacoes = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        NutriSoft.setBackground(new java.awt.Color(0, 0, 51));
        NutriSoft.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        NutriSoft.setForeground(new java.awt.Color(102, 102, 102));
        NutriSoft.setText("NutriSoft");

        IMC.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        IMC.setText("IMC");
        IMC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IMCActionPerformed(evt);
            }
        });

        GastoCalorico.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        GastoCalorico.setText("Gasto Calórico");
        GastoCalorico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GastoCaloricoActionPerformed(evt);
            }
        });

        Recomendacoes.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Recomendacoes.setText("Recomendações");
        Recomendacoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RecomendacoesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(NutriSoft, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(GastoCalorico, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Recomendacoes, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IMC, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(74, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(NutriSoft, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(IMC, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(GastoCalorico, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(Recomendacoes, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void IMCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IMCActionPerformed
    imc telaIMC = new imc();
    telaIMC.setVisible(true);
    dispose();
    }//GEN-LAST:event_IMCActionPerformed

    private void RecomendacoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RecomendacoesActionPerformed
    recomendacoes telaRecomendacoes = new recomendacoes();
    telaRecomendacoes.setVisible(true);
    dispose();
    }//GEN-LAST:event_RecomendacoesActionPerformed

    private void GastoCaloricoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GastoCaloricoActionPerformed
    gastocalorico telaGastoCalorico = new gastocalorico();
    telaGastoCalorico.setVisible(true);
    dispose();
    }//GEN-LAST:event_GastoCaloricoActionPerformed

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
            java.util.logging.Logger.getLogger(inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new inicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton GastoCalorico;
    private javax.swing.JButton IMC;
    private javax.swing.JLabel NutriSoft;
    private javax.swing.JButton Recomendacoes;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
