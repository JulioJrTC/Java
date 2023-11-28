/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package CodigoPOO;

import javax.swing.JOptionPane;

/**
 *
 * @author julio
 */
public class Exercicio06_INTERFACE extends javax.swing.JFrame {

    /**
     * Creates new form Exercicio06_INTERFACE
     */
    public Exercicio06_INTERFACE() {
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

        btnGrupo = new javax.swing.ButtonGroup();
        txtNumero = new javax.swing.JTextField();
        rbDobro = new javax.swing.JRadioButton();
        rbTriplo = new javax.swing.JRadioButton();
        rbraizQuadrada = new javax.swing.JRadioButton();
        lblMetodo = new javax.swing.JLabel();
        lblResultado = new javax.swing.JLabel();
        txtResultado = new javax.swing.JTextField();
        btnConfirmar = new javax.swing.JButton();
        lblTitulo = new javax.swing.JLabel();
        btnLimpar = new javax.swing.JButton();
        lblNumero = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Dobro, Triplo e Raiz Quadrada");

        txtNumero.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btnGrupo.add(rbDobro);
        rbDobro.setText("Dobro");

        btnGrupo.add(rbTriplo);
        rbTriplo.setText("Triplo");

        btnGrupo.add(rbraizQuadrada);
        rbraizQuadrada.setText("Raiz Quadrada");

        lblMetodo.setText("Escolha o metodo matematico:");

        lblResultado.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblResultado.setText("Resultado:");

        txtResultado.setEditable(false);
        txtResultado.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btnConfirmar.setBackground(new java.awt.Color(102, 153, 0));
        btnConfirmar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnConfirmar.setForeground(new java.awt.Color(0, 0, 0));
        btnConfirmar.setText("Confirmar");
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblTitulo.setText("Exercicio 06: Dobro, Triplo e Raiz Quadrada ");

        btnLimpar.setBackground(new java.awt.Color(255, 102, 102));
        btnLimpar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnLimpar.setForeground(new java.awt.Color(0, 0, 0));
        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        lblNumero.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblNumero.setText("Insira um numero:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(72, Short.MAX_VALUE)
                .addComponent(lblTitulo)
                .addGap(69, 69, 69))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(245, 245, 245)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbDobro)
                            .addComponent(rbraizQuadrada)
                            .addComponent(rbTriplo)
                            .addComponent(lblMetodo)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblResultado)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblNumero)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnConfirmar)
                        .addGap(18, 18, 18)
                        .addComponent(btnLimpar)
                        .addGap(16, 16, 16)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(lblTitulo)
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumero)
                    .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(lblMetodo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbDobro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbTriplo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbraizQuadrada)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblResultado)
                    .addComponent(txtResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConfirmar)
                    .addComponent(btnLimpar))
                .addContainerGap(114, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
        // TODO add your handling code here: BOTAO CONFIRMAR
        
        //Criando um novo objeto a partir de uma classe
        Exercicio06_CLASSE obj = new Exercicio06_CLASSE();
        
        //Mecanica de erro
        try{
            //Anexando o valor de uma caixa de texto (convertido) a um atributo criado na classe referente ao objeto criado anteriormente
            obj.setNumero(Double.parseDouble(txtNumero.getText()));
        }
        catch(NumberFormatException ERRO){
            JOptionPane.showMessageDialog(null, "Digite um numero!");
            return;
        }      
        
        //Chamando o metodo criado na classe
        obj.calcularNumeros();
        
        //Criando condições para os Radio Buttons e imprimindo os valores referentes ao atributos do objeto
        if (rbDobro.isSelected()){
            txtResultado.setText(String.valueOf(obj.getDobro()));
        }
        else if (rbTriplo.isSelected()){
            txtResultado.setText(String.valueOf(obj.getTriplo()));
        }
        else if (rbraizQuadrada.isSelected()){
            txtResultado.setText(String.valueOf(obj.getRaizQuadrada()));
        }
        else{ //Mecanica de Erro
            JOptionPane.showMessageDialog(null, "Selecione o metodo matematico!");
        }
        
    }//GEN-LAST:event_btnConfirmarActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        // TODO add your handling code here: BOTAO LIMPAR

        //Limpando caixas de texto
        txtNumero.setText(null);
        txtResultado.setText(null);

        //Requisitando foco
        txtNumero.requestFocus();

    }//GEN-LAST:event_btnLimparActionPerformed

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
            java.util.logging.Logger.getLogger(Exercicio06_INTERFACE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Exercicio06_INTERFACE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Exercicio06_INTERFACE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Exercicio06_INTERFACE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Exercicio06_INTERFACE().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConfirmar;
    private javax.swing.ButtonGroup btnGrupo;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JLabel lblMetodo;
    private javax.swing.JLabel lblNumero;
    private javax.swing.JLabel lblResultado;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JRadioButton rbDobro;
    private javax.swing.JRadioButton rbTriplo;
    private javax.swing.JRadioButton rbraizQuadrada;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtResultado;
    // End of variables declaration//GEN-END:variables
}
