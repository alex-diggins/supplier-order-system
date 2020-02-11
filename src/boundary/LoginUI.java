
package boundary;

import control.LoginControl;

import javax.swing.JOptionPane;

import entity.Customer;
import entity.StaffUser;

import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author alexdiggins
 */
public class LoginUI extends javax.swing.JFrame {
    

    public void setStaffPwd(JPasswordField staffPwd) {
        this.staffPwd = staffPwd;
    }

    public JPasswordField getStaffPwd() {
        return staffPwd;
    }

    public void setStaffUsername(JTextField staffUsername) {
        this.staffUsername = staffUsername;
    }

    public JTextField getStaffUsername() {
        return staffUsername;
    }

    public LoginUI() {
        initComponents();
    }

    private void initComponents() {//GEN-BEGIN:initComponents

        container = new javax.swing.JPanel();
        clientLogin = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        clientPwd = new javax.swing.JPasswordField();
        clientUsername = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        staffLogin = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        staffPwd = new javax.swing.JPasswordField();
        staffUsername = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        container.setLayout(new java.awt.CardLayout());

        jButton5.setText("Login");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Clear");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel5.setText("Username: ");

        jLabel6.setText("Password: ");

        jButton1.setText("Staff Login");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout clientLoginLayout = new javax.swing.GroupLayout(clientLogin);
        clientLogin.setLayout(clientLoginLayout);
        clientLoginLayout.setHorizontalGroup(
            clientLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(clientLoginLayout.createSequentialGroup()
                .addContainerGap(193, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(clientLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(clientLoginLayout.createSequentialGroup()
                    .addGap(55, 55, 55)
                    .addGroup(clientLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(clientLoginLayout.createSequentialGroup()
                            .addGroup(clientLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel5)
                                .addComponent(jLabel6))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(clientLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(clientPwd)
                                .addComponent(clientUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(clientLoginLayout.createSequentialGroup()
                            .addGap(25, 25, 25)
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        clientLoginLayout.setVerticalGroup(
            clientLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, clientLoginLayout.createSequentialGroup()
                .addContainerGap(265, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
            .addGroup(clientLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(clientLoginLayout.createSequentialGroup()
                    .addGap(104, 104, 104)
                    .addGroup(clientLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(clientUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(clientLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(clientPwd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6))
                    .addGap(18, 18, 18)
                    .addGroup(clientLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton5)
                        .addComponent(jButton6))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        container.add(clientLogin, "card9");

        jButton3.setText("Login");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Clear");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel3.setText("Username: ");

        jLabel4.setText("Password: ");

        jButton2.setText("Client Login");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout staffLoginLayout = new javax.swing.GroupLayout(staffLogin);
        staffLogin.setLayout(staffLoginLayout);
        staffLoginLayout.setHorizontalGroup(
            staffLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, staffLoginLayout.createSequentialGroup()
                .addContainerGap(193, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addContainerGap())
            .addGroup(staffLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(staffLoginLayout.createSequentialGroup()
                    .addGap(55, 55, 55)
                    .addGroup(staffLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(staffLoginLayout.createSequentialGroup()
                            .addGroup(staffLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(staffLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(staffPwd)
                                .addComponent(staffUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(staffLoginLayout.createSequentialGroup()
                            .addGap(25, 25, 25)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        staffLoginLayout.setVerticalGroup(
            staffLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, staffLoginLayout.createSequentialGroup()
                .addContainerGap(265, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addContainerGap())
            .addGroup(staffLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(staffLoginLayout.createSequentialGroup()
                    .addGap(104, 104, 104)
                    .addGroup(staffLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(staffUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(staffLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(staffPwd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4))
                    .addGap(18, 18, 18)
                    .addGroup(staffLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton3)
                        .addComponent(jButton4))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        container.add(staffLogin, "card9");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(container, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(container, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        staffLogin.setVisible(false);
        clientLogin.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        staffUsername.setText("");
        staffPwd.setText("");
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        String userName = staffUsername.getText();
        String pwd = new String(staffPwd.getPassword());

        StaffUser staff = new StaffUser();
        staff.setUserName(userName);
        staff.setPwd(pwd);

        LoginControl login = new LoginControl();
        login.ValidateStaffUser(staff.getUserName(), staff.getPwd());

        if (login.ValidateStaffUser(userName, pwd)==true) {
            JOptionPane.showMessageDialog(null, "Welcome " + userName + "!", "Login Successful", JOptionPane.PLAIN_MESSAGE);

            this.setVisible(false);
            staffUsername.setText("");
            staffPwd.setText("");
            new AdminMenuUI().setVisible(true);
        }

        else {
            JOptionPane.showMessageDialog(null, "Oops, invalid username or password.", "Login Failed", JOptionPane.ERROR_MESSAGE);
            staffUsername.setText("");
            staffPwd.setText("");
            //adminMenu.setVisible(false);
            //mainUI.setVisible(false);
            //loginUI.setVisible(true);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        clientLogin.setVisible(false);
        staffLogin.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed

        clientUsername.setText("");
        clientPwd.setText("");
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        String userName = clientUsername.getText();
        String pwd = new String(clientPwd.getPassword());

        Customer client = new Customer();
        client.setUserName(userName);
        client.setPwd(pwd);

        LoginControl login = new LoginControl();
        login.ValidateClient(client.getUserName(), client.getPwd());

        if (login.ValidateClient(userName, pwd)==true) {
            JOptionPane.showMessageDialog(null, "Welcome " + userName + "!", "Login Successful", JOptionPane.PLAIN_MESSAGE);
            this.setVisible(false);
            clientUsername.setText("");
            clientPwd.setText("");
        }

        else {
            JOptionPane.showMessageDialog(null, "Oops, invalid username or password.", "Login Failed", JOptionPane.ERROR_MESSAGE);
            clientUsername.setText("");
            clientPwd.setText("");
            //adminMenu.setVisible(false);
            //mainUI.setVisible(false);
            //loginUI.setVisible(true);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel clientLogin;
    private javax.swing.JPasswordField clientPwd;
    private javax.swing.JTextField clientUsername;
    private javax.swing.JPanel container;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel staffLogin;
    private javax.swing.JPasswordField staffPwd;
    private javax.swing.JTextField staffUsername;
    // End of variables declaration//GEN-END:variables

}
