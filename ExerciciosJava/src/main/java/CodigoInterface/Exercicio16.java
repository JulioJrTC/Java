/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package CodigoInterface;

import javax.swing.JOptionPane;

/**
 *
 * @author julio
 */
public class Exercicio16 extends javax.swing.JFrame {

    /**
     * Creates new form Exercicio16
     */
    public Exercicio16() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        txtNumDouble = new javax.swing.JTextField();
        lblNumDouble = new javax.swing.JLabel();
        txtNumInt = new javax.swing.JTextField();
        lblNumInt = new javax.swing.JLabel();
        lblConverter = new javax.swing.JButton();
        lblLimpar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Conversor Double para Integer");

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblTitulo.setText("Exercicio 16: Conversor Double para Integer");

        lblNumDouble.setText("Numero Double:");

        txtNumInt.setEditable(false);
        txtNumInt.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lblNumInt.setText("Numero Integer:");

        lblConverter.setBackground(new java.awt.Color(0, 153, 102));
        lblConverter.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblConverter.setForeground(new java.awt.Color(255, 255, 255));
        lblConverter.setText("Converter");
        lblConverter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblConverterActionPerformed(evt);
            }
        });

        lblLimpar.setBackground(new java.awt.Color(153, 51, 0));
        lblLimpar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblLimpar.setForeground(new java.awt.Color(255, 255, 255));
        lblLimpar.setText("Limpar");
        lblLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblLimparActionPerformed(evt);
            }
        });

        jLabel1.setText("Digite um valor double (eg: 1.123)");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(lblTitulo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblNumDouble)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNumDouble, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addComponent(lblConverter)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblLimpar))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(lblNumInt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNumInt, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(240, 240, 240)
                        .addComponent(jLabel1)))
                .addContainerGap(88, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(lblTitulo)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNumDouble, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNumDouble))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblConverter)
                    .addComponent(lblLimpar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNumInt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNumInt))
                .addContainerGap(54, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblConverterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblConverterActionPerformed
        // TODO add your handling code here: BOTAO CALCULAR
        
        //Valor digitado em uma caixa de texto inicialmente será armazenado em uma variavel string
        String numeroString = txtNumDouble.getText();
        
        //Caso o usuario não tenha digitado algum valor, iremos exibir um mensagem de erro
        if (numeroString.isEmpty()){
            JOptionPane.showMessageDialog(null, "Erro! Digite um valor double (Exemplo: 1.124)");
        }
        
        //Caso o usuario tenha digitado uma virgula em vez de ponto, iremos substituir essa virgula por um ponto
        if (numeroString.contains(",")){
            numeroString = numeroString.replace(",", ".");
        }
        
        //Convertendo o valor String acima para double (apos o tratamento de erro)
        double numeroDouble = Double.valueOf(numeroString);
        
        //Por fim, convertendo o valor double acima para integer        
        int numeroInt = (int) Math.floor(numeroDouble);
        
        //Imprimindo o resultado acima em uma caixa de texto
        txtNumInt.setText(String.format("O numero %.3f tem a parte inteira %d.",numeroDouble,numeroInt));
        
    }//GEN-LAST:event_lblConverterActionPerformed

    private void lblLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblLimparActionPerformed
        // TODO add your handling code here: BOTAO LIMPAR
        
        //Limpando caixas de texto e solicitando foco a primeira
        txtNumDouble.setText(null);
        txtNumInt.setText(null);        
        txtNumDouble.requestFocus();
        
    }//GEN-LAST:event_lblLimparActionPerformed

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
            java.util.logging.Logger.getLogger(Exercicio16.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Exercicio16.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Exercicio16.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Exercicio16.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Exercicio16().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton lblConverter;
    private javax.swing.JButton lblLimpar;
    private javax.swing.JLabel lblNumDouble;
    private javax.swing.JLabel lblNumInt;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtNumDouble;
    private javax.swing.JTextField txtNumInt;
    // End of variables declaration//GEN-END:variables
}
