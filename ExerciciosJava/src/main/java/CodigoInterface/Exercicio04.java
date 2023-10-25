/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package CodigoInterface;
//import java.lang.Class;

/**
 *
 * @author julio
 */
public class Exercicio04 extends javax.swing.JFrame {

    /**
     * Creates new form Exercicio04
     */
    public Exercicio04() {
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

        lbl_Titulo = new javax.swing.JLabel();
        lbl_Texto = new javax.swing.JLabel();
        txt_Texto = new javax.swing.JTextField();
        btn_Ok = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_Resumo = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbl_Titulo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lbl_Titulo.setText("Exercicio 04: Tipos Primitivos");

        lbl_Texto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_Texto.setText("Insira um valor:");

        btn_Ok.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_Ok.setText("OK");
        btn_Ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_OkActionPerformed(evt);
            }
        });

        jScrollPane2.setBorder(javax.swing.BorderFactory.createTitledBorder("Resumo"));

        txt_Resumo.setEditable(false);
        txt_Resumo.setColumns(20);
        txt_Resumo.setRows(5);
        jScrollPane2.setViewportView(txt_Resumo);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_Texto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_Texto))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_Titulo)
                        .addGap(31, 31, 31)))
                .addContainerGap(30, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addComponent(btn_Ok)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(lbl_Titulo)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Texto)
                    .addComponent(txt_Texto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_Ok)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_OkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_OkActionPerformed
        // TODO add your handling code here: BOTAO OK
        
        //Limpar a caixa de texto resumo apos cada click no botao
        txt_Resumo.setText(null);

        //Variavel string que irá receber o valor digitado na caixa de texto
        String texto;         
        
        //Recebendo o valor digitado na caixa de texto
        texto=txt_Texto.getText();        
        
        //Sabemos o tipo do valor inserido na caixa de texto
        Class tipo=texto.getClass();
        
        //Verificando se foi digitado algum valor na caixa de texto, se sim, iremos exibir os tipos primitivos deste valor
        if(texto.isBlank()){ //Está vazio:
            txt_Resumo.append("Contem somente espaços ou a caixa de texto está vazia.");
        }
        else{ //Não está vazio: 
            txt_Resumo.append("Palavra: "+texto+"\n"+"Tipo: "+tipo.getName()+"\n");
        }        
    }//GEN-LAST:event_btn_OkActionPerformed

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
            java.util.logging.Logger.getLogger(Exercicio04.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Exercicio04.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Exercicio04.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Exercicio04.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Exercicio04().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Ok;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbl_Texto;
    private javax.swing.JLabel lbl_Titulo;
    private javax.swing.JTextArea txt_Resumo;
    private javax.swing.JTextField txt_Texto;
    // End of variables declaration//GEN-END:variables
}
