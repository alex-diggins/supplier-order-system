package control;

import boundary.AdminMenuUI;
import boundary.LoginUI;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JOptionPane;

public class LoginControl {
    
    public boolean ValidateStaffUser(String userName, String pwd) {
        
              LoginUI login = new LoginUI();
              //AdminMenuUI adminMenu = new AdminMenuUI();
                     
              String query = "SELECT * FROM users_tab WHERE username = ? AND password = ?";
              
              try {
                  String url = "jdbc:oracle:thin:@//192.168.56.101:1521/orcl";                  
                  Connection conn = DriverManager.getConnection(url, "system", "oracle");                  
                  PreparedStatement st = conn.prepareStatement(query);
                  st.setString(1, userName);
                  st.setString(2, pwd);                  
                  ResultSet rs = st.executeQuery();
                  
                  if (rs.next()) {
                          //JOptionPane.showMessageDialog(null, "Welcome " + userName + "!", "Login Successful", JOptionPane.PLAIN_MESSAGE);
                          //login.setVisible(false);
                          return true;
                      }            
                  else {                                                                                                
                          return false;                                                                                 
                      }                                   
                  }
        
              catch (Exception e) {
              System.err.println("Got an exception!");
              System.err.println(e.getMessage());
              return false;
                  }
          }


    public boolean ValidateClient(String userName, String pwd) {
                     
              String query = "SELECT * FROM client_tab WHERE username = ? AND password = ?";
              
              try {
                  String url = "jdbc:oracle:thin:@//192.168.56.101:1521/orcl";                  
                  Connection conn = DriverManager.getConnection(url, "system", "oracle");                  
                  PreparedStatement st = conn.prepareStatement(query);
                  st.setString(1, userName);
                  st.setString(2, pwd);                  
                  ResultSet rs = st.executeQuery();
                  
                  if (rs.next()) {                                                                                      
                          return true;
                      }                  
                  else {                                                                                                
                          return false;                                                                                 
                      }                                   
                  }
        
              catch (Exception e) {
              System.err.println("Got an exception!");
              System.err.println(e.getMessage());
              return false; 
                  }
          }
    
}
