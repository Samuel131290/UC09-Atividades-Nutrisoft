package telas;

import javax.swing.JOptionPane;

public class gastocalorico extends javax.swing.JFrame {

    public gastocalorico() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        mulherRbtn = new javax.swing.JRadioButton();
        homemRbtn = new javax.swing.JRadioButton();
        pesoLbl = new javax.swing.JLabel();
        alturaLbl = new javax.swing.JLabel();
        idadeLbl = new javax.swing.JLabel();
        nAtividadeLbl = new javax.swing.JLabel();
        pesoTf = new javax.swing.JTextField();
        alturaTf = new javax.swing.JTextField();
        idadeTf = new javax.swing.JTextField();
        nAtividadeDbx = new javax.swing.JComboBox<>();
        calcularBtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        gastoBasalLbl = new javax.swing.JLabel();
        gastoTotalLbl = new javax.swing.JLabel();
        vGastoBasal = new javax.swing.JLabel();
        vGastoTotal = new javax.swing.JLabel();
        voltarBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Cálculo de Gasto Calórico");

        mulherRbtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        mulherRbtn.setForeground(new java.awt.Color(102, 102, 102));
        mulherRbtn.setText("Mulher");
        mulherRbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mulherRbtnActionPerformed(evt);
            }
        });

        homemRbtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        homemRbtn.setForeground(new java.awt.Color(102, 102, 102));
        homemRbtn.setText("Homem");
        homemRbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homemRbtnActionPerformed(evt);
            }
        });

        pesoLbl.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        pesoLbl.setForeground(new java.awt.Color(102, 102, 102));
        pesoLbl.setText("Peso (kg):");

        alturaLbl.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        alturaLbl.setForeground(new java.awt.Color(102, 102, 102));
        alturaLbl.setText("Altura (cm):");

        idadeLbl.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        idadeLbl.setForeground(new java.awt.Color(102, 102, 102));
        idadeLbl.setText("Idade:");

        nAtividadeLbl.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        nAtividadeLbl.setForeground(new java.awt.Color(102, 102, 102));
        nAtividadeLbl.setText("Nível de Atividade:");

        alturaTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alturaTfActionPerformed(evt);
            }
        });

        idadeTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idadeTfActionPerformed(evt);
            }
        });

        nAtividadeDbx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sedentário", "Leve", "Moderado", "Ativo", "Extremamente ativo" }));
        nAtividadeDbx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nAtividadeDbxActionPerformed(evt);
            }
        });

        calcularBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        calcularBtn.setForeground(new java.awt.Color(102, 102, 102));
        calcularBtn.setText("Calcular");
        calcularBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcularBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(calcularBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(pesoLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pesoTf))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(mulherRbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(homemRbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(alturaLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(alturaTf))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(idadeLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nAtividadeLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nAtividadeDbx, 0, 320, Short.MAX_VALUE)
                            .addComponent(idadeTf))))
                .addGap(16, 16, 16))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(homemRbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mulherRbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pesoLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pesoTf, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(alturaLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(alturaTf, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idadeLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idadeTf, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nAtividadeDbx, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nAtividadeLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addComponent(calcularBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        gastoBasalLbl.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        gastoBasalLbl.setForeground(new java.awt.Color(102, 102, 102));
        gastoBasalLbl.setText("Gasto Basal:");

        gastoTotalLbl.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        gastoTotalLbl.setForeground(new java.awt.Color(102, 102, 102));
        gastoTotalLbl.setText("Gasto Total:");

        vGastoBasal.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N

        vGastoTotal.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(gastoTotalLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(vGastoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(gastoBasalLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(vGastoBasal, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(vGastoBasal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(gastoBasalLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(gastoTotalLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(vGastoTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 439, Short.MAX_VALUE)
                        .addGap(78, 78, 78)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(voltarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void calcularBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcularBtnActionPerformed
    
    int altura = 0;
    int peso = 0;
    int idade = 0;
    double calBasal = 0;
    
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
    
    if (alturaTf.getText().isEmpty() && !isNumeric(alturaTf.getText())) // Verifica se foi digitado um valor e se ele é númerico.
    {
        JOptionPane.showMessageDialog(null, "O campo 'Altura (m)' precisa ser preenchido com um valor numérico.");
    }
    else 
    {
        try 
        {
            String strAltura = alturaTf.getText();
            altura = Integer.parseInt(strAltura);
        } 
        catch (NumberFormatException nfe) 
        {
            JOptionPane.showMessageDialog(null, "Valor inválido para 'Altura (m)'. Certifique-se de inserir um número válido.");
            return;
        }
    }
        
    
    if (idadeTf.getText().isEmpty() && !isNumeric(idadeTf.getText())) // Verifica se foi digitado um valor e se ele é númerico.
    {
        JOptionPane.showMessageDialog(null, "O campo 'Idade' precisa ser preenchido com um valor numérico.");
    }
    else 
    {
        try 
        {
            String strIdade = idadeTf.getText();
            idade = Integer.parseInt(strIdade);
        } 
        catch (NumberFormatException nfe) 
        {
            JOptionPane.showMessageDialog(null, "Valor inválido para 'Idade'. Certifique-se de inserir um número válido.");
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
    else if (idade < 0) // Verifica se o valor digitado é positivo.
    {
        JOptionPane.showMessageDialog(null, "O campo 'Idade' deve ser um valor positivo.");
        return;
    }      
        
    if (homemRbtn.isSelected()) 
    {
       calBasal = 66 + (13.8 * peso) + (5 * altura) - (6.8 * idade);
       String strResultado = String.format("%.2f", calBasal);
       vGastoBasal.setText(strResultado);  
    }
    else if (mulherRbtn.isSelected()) 
    {
        calBasal = 655 + (9.6 * peso) + (1.9 * altura) - (4.7 * idade);
        String strResultado = String.valueOf(calBasal);
        vGastoBasal.setText(strResultado);
    } 
    else 
    {
        JOptionPane.showMessageDialog(null, "Selecione o gênero para calcular o Gasto Calórico Basal.");
    }   

    double calTotal;
    String nivelAtividade = nAtividadeDbx.getSelectedItem().toString();
    switch (nivelAtividade) 
    {
        case "Sedentário":
            calTotal = calBasal * 1.2;
            break;
        case "Leve":
            calTotal = calBasal * 1.375;
            break;
        case "Moderado":
            calTotal = calBasal * 1.55;
            break;
        case "Ativo":
            calTotal = calBasal * 1.725;
            break;
        case "Extremamente ativo":
            calTotal = calBasal * 1.9;
            break;
        default:
            JOptionPane.showMessageDialog(null, "Selecione o nível de atividade para calcular o Gasto Calórico Total.");
            return;
    }

    // Exibir gasto calórico total
    vGastoTotal.setText(String.format("%.2f", calTotal));
    }//GEN-LAST:event_calcularBtnActionPerformed

    private void idadeTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idadeTfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idadeTfActionPerformed

    private void voltarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarBtnActionPerformed
    inicial telaInicial = new inicial();
    telaInicial.setVisible(true);
    dispose();
    }//GEN-LAST:event_voltarBtnActionPerformed

    private void homemRbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homemRbtnActionPerformed
   
    }//GEN-LAST:event_homemRbtnActionPerformed

    private void mulherRbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mulherRbtnActionPerformed
   
 
    }//GEN-LAST:event_mulherRbtnActionPerformed

    private void alturaTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alturaTfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_alturaTfActionPerformed

    private void nAtividadeDbxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nAtividadeDbxActionPerformed
 
    }//GEN-LAST:event_nAtividadeDbxActionPerformed
    
    private boolean isNumeric(String str) // Método para validação de dados númericos.
    {
        return str.matches("\\d+(\\.\\d+)?");
    }
    
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
    private javax.swing.JLabel gastoBasalLbl;
    private javax.swing.JLabel gastoTotalLbl;
    private javax.swing.JRadioButton homemRbtn;
    private javax.swing.JLabel idadeLbl;
    private javax.swing.JTextField idadeTf;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton mulherRbtn;
    private javax.swing.JComboBox<String> nAtividadeDbx;
    private javax.swing.JLabel nAtividadeLbl;
    private javax.swing.JLabel pesoLbl;
    private javax.swing.JTextField pesoTf;
    private javax.swing.JLabel vGastoBasal;
    private javax.swing.JLabel vGastoTotal;
    private javax.swing.JButton voltarBtn;
    // End of variables declaration//GEN-END:variables
}
