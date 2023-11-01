/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package CodigoInterface;

/**
 *
 * @author julio
 */
public class Exercicio06 extends javax.swing.JFrame {

    /**
     * Creates new form Exercicio06
     */
    public Exercicio06() {
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

        lbl_titulo = new javax.swing.JLabel();
        lbl_numero = new javax.swing.JLabel();
        lbl_dobro = new javax.swing.JLabel();
        lbl_triplo = new javax.swing.JLabel();
        lbl_sqrt = new javax.swing.JLabel();
        btn_ok = new javax.swing.JButton();
        btn_limpar = new javax.swing.JButton();
        txt_numero = new javax.swing.JTextField();
        txt_dobro = new javax.swing.JTextField();
        txt_triplo = new javax.swing.JTextField();
        txt_sqrt = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbl_titulo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lbl_titulo.setText("Exercicio 06: Dobro, Triplo e Raiz Quadrada ");

        lbl_numero.setText("Numero:");

        lbl_dobro.setText("Dobro:");

        lbl_triplo.setText("Triplo:");

        lbl_sqrt.setText("Raiz Quadrada:");

        btn_ok.setText("OK");
        btn_ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_okActionPerformed(evt);
            }
        });

        btn_limpar.setText("Limpar");
        btn_limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limparActionPerformed(evt);
            }
        });

        txt_dobro.setEditable(false);

        txt_triplo.setEditable(false);

        txt_sqrt.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addComponent(lbl_titulo)
                .addGap(47, 47, 47))
            .addGroup(layout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_ok)
                        .addGap(36, 36, 36)
                        .addComponent(btn_limpar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbl_sqrt)
                            .addComponent(lbl_dobro)
                            .addComponent(lbl_numero)
                            .addComponent(lbl_triplo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_numero, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                            .addComponent(txt_dobro)
                            .addComponent(txt_triplo)
                            .addComponent(txt_sqrt))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(lbl_titulo)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_numero)
                    .addComponent(txt_numero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_dobro)
                    .addComponent(txt_dobro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_triplo)
                    .addComponent(txt_triplo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_sqrt)
                    .addComponent(txt_sqrt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_ok)
                    .addComponent(btn_limpar))
                .addContainerGap(67, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_okActionPerformed
        // TODO add your handling code here: BOTAO OK
        
        //Declarando variaveis integer
        int numero,dobro,triplo;        
        
        //Declarando variaveis float
        Double sqrt,numeroFloat;
        
        //Iremos converter os valores inseridos na caixa de texto de string para integer
        numero=Integer.parseInt(txt_numero.getText());        
             
        //Definindo que a variavel dobro será o valor da variavel do numero multiplicado por 2
        dobro=numero*2;
        
        //Definindo que a variavel triplo será o valor da variavel do numero multiplicado por 3
        triplo=numero*3;
        
        //Convertendo os valores inseridos na caixa de texto para valor float
        numeroFloat=Double.parseDouble(txt_numero.getText());
        
        //Iremos calcular a raiz quadrada do valor convertido para float acima
        sqrt=Math.sqrt(numeroFloat);        
        
        //Imprimindo os devidos resultados as devidas caixas de texto
        txt_dobro.setText(dobro+"");
        txt_triplo.setText(triplo+"");
        txt_sqrt.setText(sqrt+"");
        
    }//GEN-LAST:event_btn_okActionPerformed

    private void btn_limparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limparActionPerformed
        // TODO add your handling code here: BOTAO LIMPAR
        
        //Limpando as caixas de texto ao acionar o botao limpar
        txt_numero.setText(null);
        txt_dobro.setText(null);
        txt_triplo.setText(null);
        txt_sqrt.setText(null);
        
    }//GEN-LAST:event_btn_limparActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Exercicio06.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Exercicio06.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Exercicio06.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Exercicio06.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Exercicio06().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_limpar;
    private javax.swing.JButton btn_ok;
    private javax.swing.JLabel lbl_dobro;
    private javax.swing.JLabel lbl_numero;
    private javax.swing.JLabel lbl_sqrt;
    private javax.swing.JLabel lbl_titulo;
    private javax.swing.JLabel lbl_triplo;
    private javax.swing.JTextField txt_dobro;
    private javax.swing.JTextField txt_numero;
    private javax.swing.JTextField txt_sqrt;
    private javax.swing.JTextField txt_triplo;
    // End of variables declaration//GEN-END:variables
}