
package boundary;

import java.awt.CardLayout;

/**
 *
 * @author alexdiggins
 */
public class AdminMenuUI extends javax.swing.JFrame {
    
    CardLayout cl = new CardLayout();

    /** Creates new form AdminMenuUI */
    public AdminMenuUI() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    private void initComponents() {//GEN-BEGIN:initComponents

        cards = new javax.swing.JPanel();
        adminMenu = new javax.swing.JPanel();
        findProduct = new javax.swing.JButton();
        addProduct = new javax.swing.JButton();
        deleteProduct = new javax.swing.JButton();
        jPanel1 = new AdminSearchUI();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Administrator Menu");
        setPreferredSize(new java.awt.Dimension(350, 350));
        setResizable(false);
        setSize(new java.awt.Dimension(350, 350));

        cards.setLayout(new java.awt.CardLayout());

        findProduct.setText("Find Product");
        findProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findProductActionPerformed(evt);
            }
        });

        addProduct.setText("Add Product");

        deleteProduct.setText("Delete Product");

        javax.swing.GroupLayout adminMenuLayout = new javax.swing.GroupLayout(adminMenu);
        adminMenu.setLayout(adminMenuLayout);
        adminMenuLayout.setHorizontalGroup(
            adminMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminMenuLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(adminMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(findProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        adminMenuLayout.setVerticalGroup(
            adminMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminMenuLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(findProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(addProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(deleteProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(143, Short.MAX_VALUE))
        );

        cards.add(adminMenu, "card3");
        cards.add(jPanel1, "card3");

        getContentPane().add(cards, java.awt.BorderLayout.CENTER);

        getAccessibleContext().setAccessibleParent(this);

        pack();
        setLocationRelativeTo(null);
    }//GEN-END:initComponents

    private void findProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findProductActionPerformed
        
        adminMenu.setVisible(false);
        jPanel1.setVisible(true);
        
    }//GEN-LAST:event_findProductActionPerformed

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
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing
                                                                   .UIManager
                                                                   .getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing
                         .UIManager
                         .setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util
                .logging
                .Logger
                .getLogger(AdminMenuUI.class.getName())
                .log(java.util
                         .logging
                         .Level
                         .SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util
                .logging
                .Logger
                .getLogger(AdminMenuUI.class.getName())
                .log(java.util
                         .logging
                         .Level
                         .SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util
                .logging
                .Logger
                .getLogger(AdminMenuUI.class.getName())
                .log(java.util
                         .logging
                         .Level
                         .SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util
                .logging
                .Logger
                .getLogger(AdminMenuUI.class.getName())
                .log(java.util
                         .logging
                         .Level
                         .SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt
            .EventQueue
            .invokeLater(new Runnable() {
                public void run() {
                    new AdminMenuUI().setVisible(true);
                }
            });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addProduct;
    private javax.swing.JPanel adminMenu;
    private javax.swing.JPanel cards;
    private javax.swing.JButton deleteProduct;
    private javax.swing.JButton findProduct;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

}
