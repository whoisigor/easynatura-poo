/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package easyNatura.view;

import easyNatura.controller.RemoverProdutoController;
import easyNatura.model.DAO.ProdutoDAO;
import easyNatura.model.Produto;
import java.util.ArrayList;
import javax.swing.JComboBox;

/**
 *
 * @author pedro
 */
public class RemoverProduto extends javax.swing.JFrame {

    /**
     * Creates new form RemoverProduto
     */
    private final RemoverProdutoController controller;
    
    public RemoverProduto() {
        initComponents();
        controller = new RemoverProdutoController(this);
        iniciar();
    }

    public JComboBox<String> getjComboBoxProdutos() {
        return jComboBoxProdutos;
    }

    public void setjComboBoxProdutos(JComboBox<String> jComboBoxProdutos) {
        this.jComboBoxProdutos = jComboBoxProdutos;
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBoxProdutos = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jComboBoxProdutos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxProdutosItemStateChanged(evt);
            }
        });
        getContentPane().add(jComboBoxProdutos, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, -1, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, -1, -1));

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 320, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/easyNatura/view/imagens/fundo.jpeg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxProdutosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxProdutosItemStateChanged
       ProdutoDAO produtoDAO = new ProdutoDAO();
       ArrayList <Produto> produtos = produtoDAO.retornaTodos();
       String textarea = new String();
       Produto produtoJcBox = (Produto) this.getjComboBoxProdutos().getModel().getSelectedItem();
       if(produtos != null){
           for (int i = 0; i < produtos.size(); i++){
               if(produtos.get(i).getId() == produtoJcBox.getId()){
                  textarea += "====== Dados do Produto ======\n\n";
                  textarea += "Nome do Produto: "+ produtos.get(i).getNome() + "\n";
                  textarea += "Valor: "+ produtos.get(i).getValor()+ "\n";
                  textarea += "Quantidade: "+ produtos.get(i).getQuantidade()+ "\n";
                  jTextArea1.setText(textarea);
                  break;
               }
           }
           
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxProdutosItemStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        controller.removerProduto();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(RemoverProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RemoverProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RemoverProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RemoverProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RemoverProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBoxProdutos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
    private void iniciar(){
        controller.listarProdutos();
    }
}
