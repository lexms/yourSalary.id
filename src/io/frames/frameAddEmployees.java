/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.frames;

import io.databases.databaseEmployees;
import java.sql.Date;
import io.models.modelEmployees;
import javax.swing.JOptionPane;

/**
 *
 * @author YRRNLMR
 */
public class frameAddEmployees extends javax.swing.JFrame {
    databaseEmployees db = new databaseEmployees();
    
    /**
     * Creates new form frameAddEmployees
     */
    public frameAddEmployees() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel_employee_id = new javax.swing.JLabel();
        jLabel_last_name = new javax.swing.JLabel();
        jLabel_email = new javax.swing.JLabel();
        jTextField_employee_id = new javax.swing.JTextField();
        jTextField_last_name = new javax.swing.JTextField();
        jTextField_email = new javax.swing.JTextField();
        jButton_save = new javax.swing.JButton();
        jButton_abort = new javax.swing.JButton();
        jLabel_phone_number = new javax.swing.JLabel();
        jTextField_phone_number = new javax.swing.JTextField();
        jLabel_first_name = new javax.swing.JLabel();
        jTextField_first_name = new javax.swing.JTextField();
        jLabel_hire_date = new javax.swing.JLabel();
        jTextField_hire_date = new javax.swing.JTextField();
        jLabel_job_id = new javax.swing.JLabel();
        jTextField_job_id = new javax.swing.JTextField();
        jLabel_salary = new javax.swing.JLabel();
        jTextField_salary = new javax.swing.JTextField();
        jLabel_manager_id = new javax.swing.JLabel();
        jTextField_manager_id = new javax.swing.JTextField();
        jLabel_department_id = new javax.swing.JLabel();
        jTextField_department_id = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(18, 61, 95));

        jLabel_employee_id.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_employee_id.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel_employee_id.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_employee_id.setText("employee_id");

        jLabel_last_name.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_last_name.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel_last_name.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_last_name.setText("last_name");

        jLabel_email.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_email.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel_email.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_email.setText("email");

        jTextField_employee_id.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        jTextField_last_name.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        jTextField_email.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        jButton_save.setBackground(new java.awt.Color(18, 61, 95));
        jButton_save.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButton_save.setForeground(new java.awt.Color(255, 255, 255));
        jButton_save.setText("Simpan");
        jButton_save.setToolTipText("");
        jButton_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_saveActionPerformed(evt);
            }
        });

        jButton_abort.setBackground(new java.awt.Color(18, 61, 95));
        jButton_abort.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButton_abort.setForeground(new java.awt.Color(255, 255, 255));
        jButton_abort.setText("Batal");
        jButton_abort.setToolTipText("");
        jButton_abort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_abortActionPerformed(evt);
            }
        });

        jLabel_phone_number.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_phone_number.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel_phone_number.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_phone_number.setText("phone_number");

        jTextField_phone_number.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        jLabel_first_name.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_first_name.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel_first_name.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_first_name.setText("first_name");

        jTextField_first_name.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        jLabel_hire_date.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_hire_date.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel_hire_date.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_hire_date.setText("hire_date");

        jTextField_hire_date.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        jLabel_job_id.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_job_id.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel_job_id.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_job_id.setText("job_id");

        jTextField_job_id.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        jLabel_salary.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_salary.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel_salary.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_salary.setText("salary");

        jTextField_salary.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        jLabel_manager_id.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_manager_id.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel_manager_id.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_manager_id.setText("manager_id");

        jTextField_manager_id.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        jLabel_department_id.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_department_id.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel_department_id.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_department_id.setText("department_id");

        jTextField_department_id.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setText("yyyy-mm-dd");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton_save, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jButton_abort, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_employee_id)
                    .addComponent(jLabel_last_name)
                    .addComponent(jLabel_email)
                    .addComponent(jLabel_phone_number)
                    .addComponent(jLabel_first_name)
                    .addComponent(jLabel_hire_date)
                    .addComponent(jLabel_job_id)
                    .addComponent(jLabel_salary)
                    .addComponent(jLabel_manager_id)
                    .addComponent(jLabel_department_id))
                .addGap(63, 63, 63)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField_email, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField_last_name, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField_employee_id, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                            .addComponent(jTextField_phone_number, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField_first_name, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                            .addComponent(jTextField_hire_date, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                            .addComponent(jTextField_job_id, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                            .addComponent(jTextField_salary, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField_manager_id, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField_department_id, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(29, 29, 29))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_employee_id)
                    .addComponent(jTextField_employee_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_first_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_first_name))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_last_name)
                    .addComponent(jTextField_last_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_email)
                    .addComponent(jTextField_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_phone_number, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_phone_number))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_hire_date)
                    .addComponent(jTextField_hire_date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_job_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_job_id))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_salary)
                    .addComponent(jTextField_salary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_manager_id)
                    .addComponent(jTextField_manager_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_department_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_department_id))
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_save)
                    .addComponent(jButton_abort))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_saveActionPerformed
        db.add_data_employees(new modelEmployees(
            Integer.valueOf(jTextField_employee_id.getText()),
            jTextField_first_name.getText(),
            jTextField_last_name.getText(),
            jTextField_email.getText(),
            jTextField_phone_number.getText(),
            Date.valueOf(jTextField_hire_date.getText()),
            Integer.valueOf(jTextField_job_id.getText()),
            Double.valueOf(jTextField_salary.getText()),
            Integer.valueOf(jTextField_manager_id.getText()),
            Integer.valueOf(jTextField_department_id.getText())
        ));

        JOptionPane.showMessageDialog(null, "Data Berhasil Ditambah");
        setVisible(false);
    }//GEN-LAST:event_jButton_saveActionPerformed

    private void jButton_abortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_abortActionPerformed
        setVisible(false);
    }//GEN-LAST:event_jButton_abortActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_abort;
    public javax.swing.JButton jButton_save;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel_department_id;
    private javax.swing.JLabel jLabel_email;
    private javax.swing.JLabel jLabel_employee_id;
    private javax.swing.JLabel jLabel_first_name;
    private javax.swing.JLabel jLabel_hire_date;
    private javax.swing.JLabel jLabel_job_id;
    private javax.swing.JLabel jLabel_last_name;
    private javax.swing.JLabel jLabel_manager_id;
    private javax.swing.JLabel jLabel_phone_number;
    private javax.swing.JLabel jLabel_salary;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JTextField jTextField_department_id;
    public javax.swing.JTextField jTextField_email;
    public javax.swing.JTextField jTextField_employee_id;
    public javax.swing.JTextField jTextField_first_name;
    public javax.swing.JTextField jTextField_hire_date;
    public javax.swing.JTextField jTextField_job_id;
    public javax.swing.JTextField jTextField_last_name;
    public javax.swing.JTextField jTextField_manager_id;
    public javax.swing.JTextField jTextField_phone_number;
    public javax.swing.JTextField jTextField_salary;
    // End of variables declaration//GEN-END:variables
}
