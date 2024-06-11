package telas;

import javax.swing.JOptionPane;

public class imc extends javax.swing.JFrame {

    public imc() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        alturaLbl = new javax.swing.JLabel();
        pesoLbl = new javax.swing.JLabel();
        calcularBtn = new javax.swing.JButton();
        alturaTf = new javax.swing.JTextField();
        pesoTf = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        resultadoLbl = new javax.swing.JLabel();
        valorLbl = new javax.swing.JLabel();
        interpretacaoLbl = new javax.swing.JLabel();
        vinterpretacaoLbl = new javax.swing.JLabel();
        voltarBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Cálculo de IMC");

        alturaLbl.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        alturaLbl.setForeground(new java.awt.Color(102, 102, 102));
        alturaLbl.setText("Altura (m):");

        pesoLbl.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        pesoLbl.setForeground(new java.awt.Color(102, 102, 102));
        pesoLbl.setText("Peso (kg):");

        calcularBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        calcularBtn.setForeground(new java.awt.Color(102, 102, 102));
        calcularBtn.setText("Calcular");
        calcularBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcularBtnActionPerformed(evt);
            }
        });

        alturaTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alturaTfActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(calcularBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(alturaLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(alturaTf, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(pesoLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pesoTf, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)))
                .addGap(16, 16, 16))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(alturaLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(alturaTf, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pesoLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pesoTf, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(calcularBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        resultadoLbl.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        resultadoLbl.setForeground(new java.awt.Color(102, 102, 102));
        resultadoLbl.setText("Resultado:");

        valorLbl.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N

        interpretacaoLbl.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        interpretacaoLbl.setForeground(new java.awt.Color(102, 102, 102));
        interpretacaoLbl.setText("Interpretação:");

        vinterpretacaoLbl.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(interpretacaoLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(vinterpretacaoLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(resultadoLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(valorLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(resultadoLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valorLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(interpretacaoLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(vinterpretacaoLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        voltarBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        voltarBtn.setForeground(new java.awt.Color(102, 102, 102));
        voltarBtn.setText("Voltar");
        voltarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(voltarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(78, 78, 78)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(voltarBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    private void calcularBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcularBtnActionPerformed
    
    double altura = 0.0;
    int peso = 0;

    if (alturaTf.getText().isEmpty() && !isNumeric(alturaTf.getText())) // Verifica se foi digitado um valor e se ele é númerico.
    {
        JOptionPane.showMessageDialog(null, "O campo 'Altura (m)' precisa ser preenchido com um valor numérico.");
    }
    else 
    {
        try 
        {
            String strAltura = alturaTf.getText();
            altura = Double.parseDouble(strAltura);
        } 
        catch (NumberFormatException nfe) 
        {
            JOptionPane.showMessageDialog(null, "Valor inválido para 'Altura (m)'. Certifique-se de inserir um número válido.");
            return;
        }
    }

    
    if (pesoTf.getText().isEmpty() && !isNumeric(pesoTf.getText())) // Verifica se foi digitado um valor e se ele é númerico.
    {
        JOptionPane.showMessageDialog(null, "O campo 'Peso (Kg)' precisa ser preenchido com um valor numérico.");
    }
    else 
    {
        try 
        {
            String strPeso = pesoTf.getText();
            peso = Integer.parseInt(strPeso);
        } 
        catch (NumberFormatException nfe) 
        {
            JOptionPane.showMessageDialog(null, "Valor inválido para 'Peso (Kg)'. Certifique-se de inserir um número válido.");
            return;
        }
    }
    
    if (altura < 0) // Verifica se o valor digitado é positivo.
    {
        JOptionPane.showMessageDialog(null, "O campo 'Altura (m)' deve ser um valor positivo.");
        return;
    }
    else if (peso < 0) // Verifica se o valor digitado é positivo.
    {
        JOptionPane.showMessageDialog(null, "O campo 'Peso (kg)' deve ser um valor positivo.");
        return;
    }
    
    double calculo = peso / (altura * altura); // Cálcula o IMC do usuário.
     

    String strResultado = String.format("%.2f", calculo); // Imprime o valor calculado com duas casas decimais.
    valorLbl.setText(strResultado);

    if (calculo < 18.5)
    {
    vinterpretacaoLbl.setText("Magreza");
    }
    else if (calculo >= 18.5 && calculo <= 24.9)
    {
    vinterpretacaoLbl.setText("Normal");
    }
    else if (calculo >= 25 && calculo <= 29.9)
    {
    vinterpretacaoLbl.setText("Sobrepeso");
    }
    else if (calculo >= 30 && calculo <= 39.9)
    {
    vinterpretacaoLbl.setText("Obesidade");
    }
    else if(calculo >= 40)
    {
    vinterpretacaoLbl.setText("Obesidade II");
    } 
    

    }//GEN-LAST:event_calcularBtnActionPerformed

    private void alturaTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alturaTfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_alturaTfActionPerformed

    private void voltarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarBtnActionPerformed
    inicial telaInicial = new inicial();
    telaInicial.setVisible(true);
    dispose();
    }//GEN-LAST:event_voltarBtnActionPerformed
    
    private boolean isNumeric(String str) // Método para validação de dados númericos.
    {
        return str.matches("\\d+(\\.\\d+)?");
    }  

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
            java.util.logging.Logger.getLogger(imc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(imc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(imc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(imc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new imc().setVisible(true);
            }
        });
    }



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel alturaLbl;
    private javax.swing.JTextField alturaTf;
    private javax.swing.JButton calcularBtn;
    private javax.swing.JLabel interpretacaoLbl;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel pesoLbl;
    private javax.swing.JTextField pesoTf;
    private javax.swing.JLabel resultadoLbl;
    private javax.swing.JLabel valorLbl;
    private javax.swing.JLabel vinterpretacaoLbl;
    private javax.swing.JButton voltarBtn;
    // End of variables declaration//GEN-END:variables
}
