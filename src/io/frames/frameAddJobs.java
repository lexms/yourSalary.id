/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.frames;

import io.databases.databaseJobs;
import io.models.modelJobs;
import javax.swing.JOptionPane;

/**
 *
 * @author AlexanderMS
 */
public class frameAddJobs extends javax.swing.JFrame {
    databaseJobs db = new databaseJobs();
    
    /**
     * Creates new form frameAddData
     */
    public frameAddJobs() {
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
        jLabel_job_id = new javax.swing.JLabel();
        jLabel_job_title = new javax.swing.JLabel();
        jLabel_min_salary = new javax.swing.JLabel();
        jLabel_max_salary = new javax.swing.JLabel();
        jTextField_job_id = new javax.swing.JTextField();
        jTextField_job_title = new javax.swing.JTextField();
        jTextField_min_salary = new javax.swing.JTextField();
        jTextField_max_salary = new javax.swing.JTextField();
        jButton_save = new javax.swing.JButton();
        jButton_abort = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(18, 61, 95));

        jLabel_job_id.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_job_id.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel_job_id.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_job_id.setText("job_id:");

        jLabel_job_title.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_job_title.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel_job_title.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_job_title.setText("job_title:");

        jLabel_min_salary.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_min_salary.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel_min_salary.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_min_salary.setText("min_salary:");

        jLabel_max_salary.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_max_salary.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel_max_salary.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_max_salary.setText("max_salary");

        jTextField_job_id.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jTextField_job_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_job_idActionPerformed(evt);
            }
        });

        jTextField_job_title.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        jTextField_min_salary.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        jTextField_max_salary.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_job_title)
                    .addComponent(jLabel_min_salary)
                    .addComponent(jLabel_max_salary)
                    .addComponent(jLabel_job_id))
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField_job_id)
                    .addComponent(jTextField_max_salary)
                    .addComponent(jTextField_min_salary)
                    .addComponent(jTextField_job_title, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE))
                .addGap(29, 29, 29))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(jButton_save, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jButton_abort, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel_job_id)
                    .addComponent(jTextField_job_id, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_job_title)
                    .addComponent(jTextField_job_title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_min_salary)
                    .addComponent(jTextField_min_salary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_max_salary)
                    .addComponent(jTextField_max_salary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_save)
                    .addComponent(jButton_abort))
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_saveActionPerformed
        
        
        db.add_data_jobs(new modelJobs(
                jTextField_job_id.getText(),
                jTextField_job_title.getText(),
                Double.valueOf(jTextField_min_salary.getText()),
                Double.valueOf(jTextField_max_salary.getText()))
        );
        
        JOptionPane.showMessageDialog(null, "Data Berhasil Ditambah");
        setVisible(false);

    }//GEN-LAST:event_jButton_saveActionPerformed

    private void jButton_abortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_abortActionPerformed
        setVisible(false);
    }//GEN-LAST:event_jButton_abortActionPerformed

    private void jTextField_job_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_job_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_job_idActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_abort;
    public javax.swing.JButton jButton_save;
    private javax.swing.JLabel jLabel_job_id;
    private javax.swing.JLabel jLabel_job_title;
    private javax.swing.JLabel jLabel_max_salary;
    private javax.swing.JLabel jLabel_min_salary;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JTextField jTextField_job_id;
    public javax.swing.JTextField jTextField_job_title;
    public javax.swing.JTextField jTextField_max_salary;
    public javax.swing.JTextField jTextField_min_salary;
    // End of variables declaration//GEN-END:variables
}
