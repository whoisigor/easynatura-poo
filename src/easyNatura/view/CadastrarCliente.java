/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package easyNatura.view;

import easyNatura.controller.CadastrarClienteController;
import javax.swing.JFormattedTextField;
import javax.swing.JTextField;

/**
 *
 * @author pedro
 */
public class CadastrarCliente extends javax.swing.JFrame {

    /**
     * Creates new form CadastrarCliente
     */
    private final CadastrarClienteController controller;
    
    public CadastrarCliente() {
        initComponents();
        controller = new CadastrarClienteController(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextFieldNome = new javax.swing.JTextField();
        jTextFieldEmail = new javax.swing.JTextField();
        jTextFieldEndereco = new javax.swing.JTextField();
        jButtonCadastrarCliente = new javax.swing.JButton();
        jButtonCancelarCliente = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldTelefone = new javax.swing.JFormattedTextField();
        jTextFieldCep = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastrar Cliente - EasyNatura");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextFieldNome.setFont(new java.awt.Font("Liberation Sans", 0, 15)); // NOI18N
        jTextFieldNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, 370, -1));

        jTextFieldEmail.setFont(new java.awt.Font("Liberation Sans", 0, 15)); // NOI18N
        getContentPane().add(jTextFieldEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, 370, -1));

        jTextFieldEndereco.setFont(new java.awt.Font("Liberation Sans", 0, 15)); // NOI18N
        getContentPane().add(jTextFieldEndereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 230, 370, -1));

        jButtonCadastrarCliente.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jButtonCadastrarCliente.setForeground(new java.awt.Color(10, 169, 0));
        jButtonCadastrarCliente.setText("Cadastrar");
        jButtonCadastrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrarClienteActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCadastrarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 330, 110, 40));

        jButtonCancelarCliente.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jButtonCancelarCliente.setForeground(new java.awt.Color(169, 0, 4));
        jButtonCancelarCliente.setText("Cancelar");
        jButtonCancelarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarClienteActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCancelarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 330, 110, 40));

        jLabel2.setFont(new java.awt.Font("Liberation Sans", 0, 15)); // NOI18N
        jLabel2.setForeground(java.awt.Color.white);
        jLabel2.setText("Nome:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, -1, -1));

        jLabel3.setFont(new java.awt.Font("Liberation Sans", 0, 15)); // NOI18N
        jLabel3.setForeground(java.awt.Color.white);
        jLabel3.setText("Telefone:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, -1, 50));

        jLabel4.setFont(new java.awt.Font("Liberation Sans", 0, 15)); // NOI18N
        jLabel4.setForeground(java.awt.Color.white);
        jLabel4.setText("Email:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, -1, 50));

        jLabel5.setFont(new java.awt.Font("Liberation Sans", 0, 15)); // NOI18N
        jLabel5.setForeground(java.awt.Color.white);
        jLabel5.setText("Endereço:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, -1, 50));

        try {
            jTextFieldTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jTextFieldTelefone.setFont(new java.awt.Font("Liberation Sans", 0, 15)); // NOI18N
        jTextFieldTelefone.setName(""); // NOI18N
        jTextFieldTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTelefoneActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, 130, -1));

        try {
            jTextFieldCep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jTextFieldCep.setFont(new java.awt.Font("Liberation Sans", 0, 15)); // NOI18N
        getContentPane().add(jTextFieldCep, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 270, 100, -1));

        jLabel6.setFont(new java.awt.Font("Liberation Sans", 0, 15)); // NOI18N
        jLabel6.setForeground(java.awt.Color.white);
        jLabel6.setText("CEP:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 250, -1, 70));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/easyNatura/view/imagens/fundo.jpeg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNomeActionPerformed

    private void jButtonCadastrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarClienteActionPerformed
        controller.cadastrar();
        //tem que ter mensagem de confirmação
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCadastrarClienteActionPerformed

    private void jButtonCancelarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarClienteActionPerformed
        // TODO add your handling code here:
        dispose();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
        
    }//GEN-LAST:event_jButtonCancelarClienteActionPerformed

    private void jTextFieldTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTelefoneActionPerformed

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
            java.util.logging.Logger.getLogger(CadastrarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastrarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastrarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastrarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastrarCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCadastrarCliente;
    private javax.swing.JButton jButtonCancelarCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JFormattedTextField jTextFieldCep;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldEndereco;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JFormattedTextField jTextFieldTelefone;
    // End of variables declaration//GEN-END:variables

    public JTextField getjTextFieldCep() {
        return jTextFieldCep;
    }

    public void setjTextFieldCep(JTextField jTextFieldCep) {
        this.jTextFieldCep = (JFormattedTextField) jTextFieldCep;
    }

    public JTextField getjTextFieldEmail() {
        return jTextFieldEmail;
    }

    public void setjTextFieldEmail(JTextField jTextFieldEmail) {
        this.jTextFieldEmail = jTextFieldEmail;
    }

    public JTextField getjTextFieldEndereco() {
        return jTextFieldEndereco;
    }

    public void setjTextFieldEndereco(JTextField jTextFieldEndereco) {
        this.jTextFieldEndereco = jTextFieldEndereco;
    }

    public JTextField getjTextFieldNome() {
        return jTextFieldNome;
    }

    public void setjTextFieldNome(JTextField jTextFieldNome) {
        this.jTextFieldNome = jTextFieldNome;
    }

    public JTextField getjTextFieldTelefone() {
        return jTextFieldTelefone;
    }

    public void setjTextFieldTelefone(JTextField jTextFieldTelefone) {
        this.jTextFieldTelefone = (JFormattedTextField) jTextFieldTelefone;
    }
    
    
}
