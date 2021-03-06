/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.frames;


import io.services.navigation;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Timer;
import io.services.database;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;


/**
 *
 * @author AlexanderMS
 */
public class frameLogin extends javax.swing.JFrame {

    /**
     * Creates new form loginFrame
     */
    public frameLogin() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
        jPasswordField_password.addKeyListener(new KeyAdapter()  {
            @Override
            public void keyPressed(KeyEvent ke) {
                if(ke.getKeyCode() == KeyEvent.VK_ENTER){
                    jButton_login.doClick();
                }
            }
        });
        jTextField_username.addKeyListener(new KeyAdapter()  {
            @Override
            public void keyPressed(KeyEvent ke) {
                if(ke.getKeyCode() == KeyEvent.VK_ENTER){
                    jButton_login.doClick();
                }
            }
        });
    }
   
    //  error message box   
        Timer timer1 = new Timer(30, new ActionListener(){  
            @Override
            public void actionPerformed(ActionEvent e) {
                if(jPanel_message.getHeight() != 45){
                    jPanel_message.setBounds(0,0,frameLogin.this.getSize().width,jPanel_message.getHeight()+5);
                    if(jPanel_message.getHeight() == 45){
                        timer1.stop();
                    }
                }
            }       
        });    
        Timer timer2 = new Timer(30, new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if(jPanel_message.getHeight() != 0){
                    jPanel_message.setBounds(0,0,frameLogin.this.getSize().width,jPanel_message.getHeight()-5);
                    if(jPanel_message.getHeight() == 0){
                        timer2.stop();
                    }
                }
            }       
        });

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel_login = new javax.swing.JPanel();
        jLabel_username = new javax.swing.JLabel();
        jLabel_password = new javax.swing.JLabel();
        jTextField_username = new javax.swing.JTextField();
        jPasswordField_password = new javax.swing.JPasswordField();
        checkboxShowPassword = new javax.swing.JCheckBox();
        jButton_login = new javax.swing.JButton();
        jPanel_message = new javax.swing.JPanel();
        jLabel_message = new javax.swing.JLabel();
        jButton_okmessage = new javax.swing.JButton();
        jLabel_img_logo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel_login.setBackground(new java.awt.Color(18, 61, 95));
        jPanel_login.setName(""); // NOI18N

        jLabel_username.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel_username.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_username.setText("username:");

        jLabel_password.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel_password.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_password.setText("password:");

        jTextField_username.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_username.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        jPasswordField_password.setBackground(new java.awt.Color(255, 255, 255));
        jPasswordField_password.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        checkboxShowPassword.setBackground(new java.awt.Color(18, 61, 95));
        checkboxShowPassword.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        checkboxShowPassword.setForeground(new java.awt.Color(255, 255, 255));
        checkboxShowPassword.setText("Show Password");
        checkboxShowPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkboxShowPasswordActionPerformed(evt);
            }
        });

        jButton_login.setBackground(new java.awt.Color(18, 61, 95));
        jButton_login.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButton_login.setForeground(new java.awt.Color(255, 255, 255));
        jButton_login.setText("LOGIN");
        jButton_login.setToolTipText("");
        jButton_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_loginActionPerformed(evt);
            }
        });

        jPanel_message.setBackground(new java.awt.Color(255, 255, 255));

        jLabel_message.setBackground(new java.awt.Color(18, 61, 95));
        jLabel_message.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel_message.setForeground(new java.awt.Color(18, 61, 95));

        jButton_okmessage.setBackground(new java.awt.Color(18, 61, 95));
        jButton_okmessage.setForeground(new java.awt.Color(255, 255, 255));
        jButton_okmessage.setText("OK");
        jButton_okmessage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_okmessageActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_messageLayout = new javax.swing.GroupLayout(jPanel_message);
        jPanel_message.setLayout(jPanel_messageLayout);
        jPanel_messageLayout.setHorizontalGroup(
            jPanel_messageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_messageLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel_message, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton_okmessage)
                .addGap(28, 28, 28))
        );
        jPanel_messageLayout.setVerticalGroup(
            jPanel_messageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_messageLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_messageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_message, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton_okmessage))
                .addContainerGap())
        );

        jLabel_img_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/images/logo-login.png"))); // NOI18N

        javax.swing.GroupLayout jPanel_loginLayout = new javax.swing.GroupLayout(jPanel_login);
        jPanel_login.setLayout(jPanel_loginLayout);
        jPanel_loginLayout.setHorizontalGroup(
            jPanel_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_loginLayout.createSequentialGroup()
                .addGap(310, 310, 310)
                .addGroup(jPanel_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton_login, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField_username, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPasswordField_password)
                    .addComponent(checkboxShowPassword, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_username, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_password, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(281, 281, 281))
            .addComponent(jPanel_message, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_loginLayout.createSequentialGroup()
                .addContainerGap(539, Short.MAX_VALUE)
                .addComponent(jLabel_img_logo)
                .addGap(520, 520, 520))
        );
        jPanel_loginLayout.setVerticalGroup(
            jPanel_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_loginLayout.createSequentialGroup()
                .addComponent(jPanel_message, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(jLabel_img_logo)
                .addGap(10, 10, 10)
                .addComponent(jLabel_username)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel_password)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPasswordField_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(checkboxShowPassword)
                .addGap(18, 18, 18)
                .addComponent(jButton_login)
                .addGap(151, 151, 151))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_login, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel_login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void checkboxShowPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkboxShowPasswordActionPerformed
        if(checkboxShowPassword.isSelected()){
            jPasswordField_password.setEchoChar((char)0);
        }
        else{
            jPasswordField_password.setEchoChar('*');
        }
    }//GEN-LAST:event_checkboxShowPasswordActionPerformed

    private void jButton_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_loginActionPerformed
        Connection conn;
        PreparedStatement ps;
        try {
            conn = database.getConnection();
            ps = conn.prepareStatement("SELECT `employee_id`, `job_id` FROM employees WHERE `employee_id` =? AND `job_id` =?");
            ps.setString(1, jTextField_username.getText());
            ps.setString(2, String.valueOf(jPasswordField_password.getPassword()));
            ResultSet result = ps.executeQuery();
            if (result.next()){
//                navigation.showMainMenu(this);
                navigation.showWelcome(this);
            }
            else{
                jLabel_message.setText("Invalid Username or Password");
                jLabel_message.setForeground(Color.RED);
                timer1.start();
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(frameLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton_loginActionPerformed

    private void jButton_okmessageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_okmessageActionPerformed
        timer2.start();
    }//GEN-LAST:event_jButton_okmessageActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(frameLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(frameLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(frameLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(frameLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new frameLogin().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox checkboxShowPassword;
    private javax.swing.JButton jButton_login;
    private javax.swing.JButton jButton_okmessage;
    private javax.swing.JLabel jLabel_img_logo;
    private javax.swing.JLabel jLabel_message;
    private javax.swing.JLabel jLabel_password;
    private javax.swing.JLabel jLabel_username;
    private javax.swing.JPanel jPanel_login;
    private javax.swing.JPanel jPanel_message;
    private javax.swing.JPasswordField jPasswordField_password;
    private javax.swing.JTextField jTextField_username;
    // End of variables declaration//GEN-END:variables
}
