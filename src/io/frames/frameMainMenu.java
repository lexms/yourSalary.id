/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.frames;

import io.table_models.tmDependents;
import io.table_models.tmLocations;
import io.table_models.tmJobs;
import io.table_models.tmRegions;
import io.table_models.tmCountries;
import io.table_models.tmDepartments;
import io.table_models.tmEmployees;
import io.models.modelEmployees;
import io.models.modelCountries;
import io.models.modelRegions;
import io.models.modelLocations;
import io.models.modelJobs;
import io.models.modelDepartments;
import io.models.modelDependents;
import io.databases.databaseEmployees;
import io.databases.databaseJobs;
import io.databases.databaseDependents;
import io.databases.databaseLocations;
import io.databases.databaseCountries;
import io.databases.databaseRegions;
import io.databases.databaseDepartments;
import io.services.exportPDF;
import io.services.navigation;
import java.sql.Date;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author AlexanderMS
 */
public class frameMainMenu extends javax.swing.JFrame {
    public int Option = 1;
    public databaseJobs dbJobs = new databaseJobs();
    public tmJobs tableJobs = new tmJobs();
    
    public databaseEmployees dbEmployees = new databaseEmployees();
    public tmEmployees tableEmployees = new tmEmployees();
    
    public databaseDepartments dbDepartments = new databaseDepartments();
    public tmDepartments tableDepartments = new tmDepartments();
    
    public databaseDependents dbDependents = new databaseDependents();
    public tmDependents tableDependents = new tmDependents();
    
    public databaseCountries dbCountries = new databaseCountries();
    public tmCountries tableCountries = new tmCountries();
    
    public databaseRegions dbRegions = new databaseRegions();
    public tmRegions tableRegions = new tmRegions();
    
    public databaseLocations dbLocations = new databaseLocations();
    public tmLocations tableLocations = new tmLocations();

            
    
    /**
     * Creates new form mainmenuFrame
     */
    public frameMainMenu() {
        initComponents();
        showTableJobs();
      
    }
    
//  <editor-fold defaultstate="collapsed" desc="Countries Management"> 
    public void showTableCountries()
    {
        Option = 1;
        tableCountries.setData(dbCountries.show_database_countries());
        jTable.setModel(tableCountries);
    }
    public void refreshdataCountries()
    {
        tableCountries.setData(dbCountries.show_database_countries());
        tableCountries.fireTableDataChanged();
        jTable.changeSelection(0,0,false,false);
    }
    public void call_addrowCountries(){
        frameAddCountries fadd = new frameAddCountries();
        fadd.setVisible(true);
        fadd.jTextField_country_id.setText("");
        fadd.jTextField_country_name.setText("");
        fadd.jTextField_region_id.setText("");
        refreshdataRegions();
    }
   
    public void call_deleterowCountries(){
        try
        {
            int row = jTable.getSelectedRow();
            String country_id = (String)tableCountries.getValueAt(row,0);
            String country_name = (String)tableCountries.getValueAt(row, 1);
            Object[] pilihan={"Ya","Tidak"};
            int answer = JOptionPane.showOptionDialog(
                    null,"Anda yakin data country dengan country_id \""+country_id+"\" dengan nama \""+country_name+"\" akan dihapus ?",
                    "Peringatan",JOptionPane.DEFAULT_OPTION,
                    JOptionPane.WARNING_MESSAGE,null,pilihan,pilihan[0]);
            if(answer==0)
            {
                dbCountries.delete_row_countries(country_id);
                refreshdataCountries();
            }
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            JOptionPane.showMessageDialog(null,"Pilih data yang akan dihapus !!!");        
        }
    }
    public void call_updaterowCountries(){
        frameUpdateCountries fupdate = new frameUpdateCountries();
        
        int row = jTable.getSelectedRow();
        String country_id = (String)tableCountries.getValueAt(row, 0);
        String country_name = (String)tableCountries.getValueAt(row, 1);
        String region_id = (String)tableCountries.getValueAt(row, 2);
        modelCountries m = dbCountries.select_row_countries(country_id);
        
        if (m!=null){
            fupdate.jTextField_country_id.setText(country_id);
            fupdate.jTextField_country_name.setText(country_name);
            fupdate.jTextField_region_id.setText(region_id);
            fupdate.setVisible(true);
            refreshdataCountries();
        }
        else{
            JOptionPane.showMessageDialog(null, "Country dengan country_id"+country_id+"tidak ditemukan");
        }
    }

    public void call_filterdatabasecountries(){
        String keyword;
        keyword=JOptionPane.showInputDialog(null,"Nama country yang dicari?","Filter/Pencarian",JOptionPane.QUESTION_MESSAGE);
        if(keyword!=null){
            tableCountries.setData(dbCountries.filter_databasecountries(keyword));
            tableCountries.fireTableDataChanged();
        }
    }
//  </editor-fold>    

    
// <editor-fold defaultstate="collapsed" desc="Departments Management"> 
    public void showTableDepartments()
    {
        Option = 2;
        tableDepartments.setData(dbDepartments.show_database_departments());
        jTable.setModel(tableDepartments);
    }
    public void refreshdataDepartments()
    {
        tableDepartments.setData(dbDepartments.show_database_departments());
        tableDepartments.fireTableDataChanged();
        jTable.changeSelection(0,0,false,false);
    }
    public void call_addrowDepartments(){
        frameAddDepartments fadd = new frameAddDepartments();
        fadd.setVisible(true);
        fadd.jTextField_department_id.setText("");
        fadd.jTextField_department_name.setText("");
        fadd.jTextField_location_id.setText("");
        refreshdataDepartments();
    }
    public void call_deleterowDepartments(){
        try
        {
            int row = jTable.getSelectedRow();
            String department_id = (String)tableDepartments.getValueAt(row,0);
            String department_name = (String)tableDepartments.getValueAt(row, 1);
            Object[] pilihan={"Ya","Tidak"};
            int answer = JOptionPane.showOptionDialog(
                    null,"Anda yakin data department dengan department_id \""+department_id+"\" dengan nama \""+department_name+"\" akan dihapus ?",
                    "Peringatan",JOptionPane.DEFAULT_OPTION,
                    JOptionPane.WARNING_MESSAGE,null,pilihan,pilihan[0]);
            if(answer==0)
            {
                dbDepartments.delete_row_departments(department_id);
                refreshdataDepartments();
            }
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            JOptionPane.showMessageDialog(null,"Pilih data yang akan dihapus !!!");        
        }
    }
    public void call_updaterowDepartments(){
        frameUpdateDepartments fupdate = new frameUpdateDepartments();
        
        int row = jTable.getSelectedRow();
        String department_id = (String)tableDepartments.getValueAt(row, 0);
        String department_name = (String)tableDepartments.getValueAt(row, 1);
        String location_id = (String)tableDepartments.getValueAt(row, 2);
        modelDepartments m = dbDepartments.select_row_departments(department_id);
        
        if (m!=null){
            fupdate.jTextField_department_id.setText(department_id);
            fupdate.jTextField_department_name.setText(department_name);
            fupdate.jTextField_location_id.setText(location_id);
            fupdate.setVisible(true);
            refreshdataDepartments();
        }
        else{
            JOptionPane.showMessageDialog(null, "Department dengan department_id"+department_id+"tidak ditemukan");
        }
    }
    
    public void call_filterdatabasedepartments(){
        String keyword;
        keyword=JOptionPane.showInputDialog(null,"Nama department yang dicari?","Filter/Pencarian",JOptionPane.QUESTION_MESSAGE);
        if(keyword!=null){
            tableDepartments.setData(dbDepartments.filter_database_departments(keyword));
            tableDepartments.fireTableDataChanged();
        }
    }
//  </editor-fold>
    
    
//  <editor-fold defaultstate="collapsed" desc="Dependents Management"> 
    public void showTableDependents()
    {
        Option = 3;
        tableDependents.setData(dbDependents.show_database_dependents());
        jTable.setModel(tableDependents);
    }
    
    public void refreshdataDependents()
    {
        tableDependents.setData(dbDependents.show_database_dependents());
        tableDependents.fireTableDataChanged();
        jTable.changeSelection(0,0,false,false);
    }
    public void call_addrowDependents(){
        frameAddDependents fadd = new frameAddDependents();
        fadd.setVisible(true);
   
        fadd.jTextField_dependent_id.setText("");
        fadd.jTextField_last_name.setText("");
        fadd.jTextField_relationship.setText("");

        refreshdataDependents();
    }
    public void call_deleterowDependents(){
        try
        {
            int row = jTable.getSelectedRow();
            int dependent_id = (int)tableDependents.getValueAt(row,0);
            String first_name = (String)tableDependents.getValueAt(row, 1);
            Object[] pilihan={"Ya","Tidak"};
            int answer = JOptionPane.showOptionDialog(
                    null,"Anda yakin data dependent dengan dependent_id \""+dependent_id+"\" dengan nama \""+first_name+"\" akan dihapus ?",
                    "Peringatan",JOptionPane.DEFAULT_OPTION,
                    JOptionPane.WARNING_MESSAGE,null,pilihan,pilihan[0]);
            if(answer==0)
            {
                dbDependents.delete_row_dependents(dependent_id);
                refreshdataDependents();
            }
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            JOptionPane.showMessageDialog(null,"Pilih data yang akan dihapus !!!");        
        }
    }
        public void call_updaterowDependents(){
        frameUpdateDependents fupdate = new frameUpdateDependents();
        
        int row = jTable.getSelectedRow();
        int dependent_id = (int)tableDependents.getValueAt(row, 0);
        String first_name = (String)tableDependents.getValueAt(row, 1);
        String last_name = (String)tableDependents.getValueAt(row, 2);
        String relationship = (String)tableDependents.getValueAt(row, 3);
        int employee_id = (int)tableDependents.getValueAt(row, 4);
        modelDependents m = dbDependents.select_row_dependents(dependent_id);
        
        if (m!=null){
            fupdate.jTextField_dependent_id.setText(Integer.toString(dependent_id));
            fupdate.jTextField_first_name.setText(first_name);
            fupdate.jTextField_last_name.setText(last_name);
            fupdate.jTextField_relationship.setText(relationship);
            fupdate.jTextField_employee_id.setText(Integer.toString(employee_id));
            fupdate.setVisible(true);
            refreshdataDependents();
        }
        else{
            JOptionPane.showMessageDialog(null, "Dependent dengan dependent_id"+dependent_id+"tidak ditemukan");
        }
    }

    public void call_filterdatabasedependents(){
        String keyword;
        keyword=JOptionPane.showInputDialog(null,"Nama dependent yang dicari?","Filter/Pencarian",JOptionPane.QUESTION_MESSAGE);
        if(keyword!=null){
            tableDependents.setData(dbDependents.filter_database_dependents(keyword));
            tableDependents.fireTableDataChanged();
        }
    }
//  </editor-fold>
    
    
//  <editor-fold defaultstate="collapsed" desc="Employees Management"> 
    public void showTableEmployees()
    {
        Option = 4;
        tableEmployees.setData(dbEmployees.show_database_employees());
        jTable.setModel(tableEmployees);
    }
     public void refreshdataEmployees()
    {
        tableEmployees.setData(dbEmployees.show_database_employees());
        tableEmployees.fireTableDataChanged();
        jTable.changeSelection(0,0,false,false);
    }
    public void call_addrowEmployees(){
        frameAddEmployees fadd = new frameAddEmployees();
        fadd.setVisible(true);
        fadd.jTextField_employee_id.setText("");
        fadd.jTextField_first_name.setText("");
        fadd.jTextField_last_name.setText("");
        fadd.jTextField_email.setText("");
        fadd.jTextField_phone_number.setText("");
        fadd.jTextField_hire_date.setText("");
        fadd.jTextField_job_id.setText("");
        fadd.jTextField_salary.setText("");
        fadd.jTextField_manager_id.setText("");
        fadd.jTextField_department_id.setText("");
        refreshdataRegions();
    }
   
    public void call_deleterowEmployees(){
        try
        {
            int row = jTable.getSelectedRow();
            int employee_id = (int)tableEmployees.getValueAt(row,0);
            String first_name = (String)tableEmployees.getValueAt(row, 1);
            Object[] pilihan={"Ya","Tidak"};
            int answer = JOptionPane.showOptionDialog(
                    null,"Anda yakin data employee dengan employee_id \""+employee_id+"\" dengan nama \""+first_name+"\" akan dihapus ?",
                    "Peringatan",JOptionPane.DEFAULT_OPTION,
                    JOptionPane.WARNING_MESSAGE,null,pilihan,pilihan[0]);
            if(answer==0)
            {
                dbEmployees.delete_row_employees(employee_id);
                refreshdataEmployees();
            }
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            JOptionPane.showMessageDialog(null,"Pilih data yang akan dihapus !!!");        
        }
    }
    public void call_updaterowEmployees(){
        frameUpdateEmployees fupdate = new frameUpdateEmployees();
        
        int row = jTable.getSelectedRow();
        int employee_id = (int)tableEmployees.getValueAt(row, 0);
        String first_name = (String)tableEmployees.getValueAt(row, 1);
        String last_name = (String)tableEmployees.getValueAt(row, 2);
        String email = (String)tableEmployees.getValueAt(row, 3);
        String phone_number = (String)tableEmployees.getValueAt(row, 4);
        Date hire_date = (Date)tableEmployees.getValueAt(row, 5);
        int job_id = (int)tableEmployees.getValueAt(row, 6);
        Double salary = (Double)tableEmployees.getValueAt(row, 7);
        int manager_id = (int)tableEmployees.getValueAt(row, 8);
        int department_id = (int)tableEmployees.getValueAt(row, 9);
        modelEmployees m = dbEmployees.select_row_employees(employee_id);
       
        
        if (m!=null){
            fupdate.jTextField_employee_id.setText(Integer.toString(employee_id));
            fupdate.jTextField_first_name.setText(first_name);
            fupdate.jTextField_last_name.setText(last_name);
            fupdate.jTextField_email.setText(email);
            fupdate.jTextField_phone_number.setText(phone_number);
            fupdate.jTextField_hire_date.setText(hire_date.toString());
            fupdate.jTextField_job_id.setText(Integer.toString(employee_id));
            fupdate.jTextField_salary.setText(Double.toString(salary));
            fupdate.jTextField_manager_id.setText(Integer.toString(manager_id));
            fupdate.jTextField_department_id.setText(Integer.toString(department_id));
            fupdate.setVisible(true);
            refreshdataEmployees();
        }
        else{
            JOptionPane.showMessageDialog(null, "Employee dengan employee_id"+employee_id+"tidak ditemukan");
        }
    }

    public void call_filterdatabaseemployees(){
        String keyword;
        keyword=JOptionPane.showInputDialog(null,"Nama employee yang dicari?","Filter/Pencarian",JOptionPane.QUESTION_MESSAGE);
        if(keyword!=null){
            tableEmployees.setData(dbEmployees.filter_database_employees(keyword));
            tableEmployees.fireTableDataChanged();
        }
    }
//  </editor-fold>
    

// <editor-fold defaultstate="collapsed" desc="Jobs Management"> 
    public void showTableJobs()
    {
        Option = 5;
        tableJobs.setData(dbJobs.show_database_jobs());
        jTable.setModel(tableJobs);
    }
    public void refreshdataJobs()
    {
        tableJobs.setData(dbJobs.show_database_jobs());
        tableJobs.fireTableDataChanged();
        jTable.changeSelection(0,0,false,false);
    }
    public void call_addrowJobs(){
        frameAddJobs fadd = new frameAddJobs();
        fadd.setVisible(true);
        fadd.jTextField_job_id.setText("");
        fadd.jTextField_job_title.setText("");
        fadd.jTextField_min_salary.setText("");
        fadd.jTextField_max_salary.setText("");
        refreshdataJobs();
    }
    public void call_deleterowJobs(){
        try
        {
            int row = jTable.getSelectedRow();
            String job_id = (String)tableJobs.getValueAt(row,0);
            String job_title = (String)tableJobs.getValueAt(row, 1);
            Double min_salary = (Double)tableJobs.getValueAt(row, 2);
            Double max_salary = (Double)tableJobs.getValueAt(row, 3);
            Object[] pilihan={"Ya","Tidak"};
            int answer = JOptionPane.showOptionDialog(
                    null,"Anda yakin data pekerjaan dengan job_id \""+job_id+"\" dengan nama pekerjaan\""+job_title+"\" akan dihapus ?",
                    "Peringatan",JOptionPane.DEFAULT_OPTION,
                    JOptionPane.WARNING_MESSAGE,null,pilihan,pilihan[0]);
            if(answer==0)
            {
                dbJobs.delete_row_jobs(job_id);
                refreshdataJobs();
            }
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            JOptionPane.showMessageDialog(null,"Pilih data yang akan dihapus !!!");        
        }
    }
        public void call_updaterowJobs(){
        frameUpdateJobs fupdate = new frameUpdateJobs();
        
        int row = jTable.getSelectedRow();
        String job_id = (String)tableJobs.getValueAt(row, 0);
        String job_title = (String)tableJobs.getValueAt(row, 1);
        Double min_salary = (Double)tableJobs.getValueAt(row, 2);
        Double max_salary = (Double)tableJobs.getValueAt(row, 3);
        modelJobs m = dbJobs.select_row_jobs(job_id);
        
        if (m!=null){
            fupdate.jTextField_job_id.setText(job_id);
            fupdate.jTextField_job_title.setText(job_title);
            fupdate.jTextField_min_salary.setText(Double.toString(min_salary));
            fupdate.jTextField_max_salary.setText(Double.toString(max_salary));
            fupdate.setVisible(true);
            refreshdataJobs();
        }
        else{
            JOptionPane.showMessageDialog(null, "Job dengan job_id"+job_id+"tidak ditemukan");
        }
    }
    
    public void call_filterdatabasejobs(){
        String keyword;
        keyword=JOptionPane.showInputDialog(null,"Nama job yang dicari?","Filter/Pencarian",JOptionPane.QUESTION_MESSAGE);
        if(keyword!=null){
            tableJobs.setData(dbJobs.filter_database_jobs(keyword));
            tableJobs.fireTableDataChanged();
        }
    }
//  </editor-fold>
    
    
//  <editor-fold defaultstate="collapsed" desc="Locations Management"> 
    public void showTableLocations()
    {
        Option = 6;
        tableLocations.setData(dbLocations.show_database_locations());
        jTable.setModel(tableLocations);
    }
     public void refreshdataLocations()
    {
        tableLocations.setData(dbLocations.show_database_locations());
        tableLocations.fireTableDataChanged();
        jTable.changeSelection(0,0,false,false);
    }
    public void call_addrowLocations(){
        frameAddLocations fadd = new frameAddLocations();
        fadd.setVisible(true);
        fadd.jTextField_location_id.setText("");
        fadd.jTextField_street_address.setText("");
        fadd.jTextField_postal_code.setText("");
        fadd.jTextField_city.setText("");
        fadd.jTextField_state_province.setText("");
        fadd.jTextField_country_id.setText("");
        refreshdataRegions();
    }
   
    public void call_deleterowLocations(){
        try
        {
            int row = jTable.getSelectedRow();
            int location_id = (int)tableLocations.getValueAt(row,0);
            String street_address = (String)tableLocations.getValueAt(row, 1);
            Object[] pilihan={"Ya","Tidak"};
            int answer = JOptionPane.showOptionDialog(
                    null,"Anda yakin data location dengan location_id \""+location_id+"\" dengan nama \""+street_address+"\" akan dihapus ?",
                    "Peringatan",JOptionPane.DEFAULT_OPTION,
                    JOptionPane.WARNING_MESSAGE,null,pilihan,pilihan[0]);
            if(answer==0)
            {
                dbLocations.delete_row_locations(location_id);
                refreshdataLocations();
            }
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            JOptionPane.showMessageDialog(null,"Pilih data yang akan dihapus !!!");        
        }
    }
    public void call_updaterowLocations(){
        frameUpdateLocations fupdate = new frameUpdateLocations();
        
        int row = jTable.getSelectedRow();
        int location_id = (int)tableLocations.getValueAt(row, 0);
        String street_address = (String)tableLocations.getValueAt(row, 1);
        String postal_code = (String)tableLocations.getValueAt(row, 2);
        String city = (String)tableLocations.getValueAt(row, 3);
        String state_province = (String)tableLocations.getValueAt(row, 4);
        String country_id = (String)tableLocations.getValueAt(row, 5);
        modelLocations m = dbLocations.select_row_locations(location_id);
        
        if (m!=null){
            fupdate.jTextField_location_id.setText(Integer.toString(location_id));
            fupdate.jTextField_street_address.setText(street_address);
            fupdate.jTextField_postal_code.setText(postal_code);
            fupdate.jTextField_city.setText(city);
            fupdate.jTextField_state_province.setText(state_province);
            fupdate.jTextField_country_id.setText(country_id);
            fupdate.setVisible(true);
            refreshdataLocations();
        }
        else{
            JOptionPane.showMessageDialog(null, "Location dengan location_id"+location_id+"tidak ditemukan");
        }
    }

    public void call_filterdatabaselocations(){
        String keyword;
        keyword=JOptionPane.showInputDialog(null,"Nama location yang dicari?","Filter/Pencarian",JOptionPane.QUESTION_MESSAGE);
        if(keyword!=null){
            tableLocations.setData(dbLocations.filter_database_locations(keyword));
            tableLocations.fireTableDataChanged();
        }
    }
//  </editor-fold>
     
     
// <editor-fold defaultstate="collapsed" desc="Regions Management"> 
    public void showTableRegions()
    {
        Option = 7;
        tableRegions.setData(dbRegions.show_database_regions());
        jTable.setModel(tableRegions);
    }
    public void refreshdataRegions()
    {
        tableRegions.setData(dbRegions.show_database_regions());
        tableRegions.fireTableDataChanged();
        jTable.changeSelection(0,0,false,false);
    }
    public void call_addrowRegions(){
        frameAddRegions fadd = new frameAddRegions();
        fadd.setVisible(true);
        fadd.jTextField_region_id.setText("");
        fadd.jTextField_region_name.setText("");
        refreshdataRegions();
    }
   
    public void call_deleterowRegions(){
        try
        {
            int row = jTable.getSelectedRow();
            int region_id = (int)tableRegions.getValueAt(row,0);
            String region_name = (String)tableRegions.getValueAt(row, 1);
            Object[] pilihan={"Ya","Tidak"};
            int answer = JOptionPane.showOptionDialog(
                    null,"Anda yakin data region dengan region_id \""+region_id+"\" dengan nama \""+region_name+"\" akan dihapus ?",
                    "Peringatan",JOptionPane.DEFAULT_OPTION,
                    JOptionPane.WARNING_MESSAGE,null,pilihan,pilihan[0]);
            if(answer==0)
            {
                dbRegions.delete_row_regions(region_id);
                refreshdataRegions();
            }
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            JOptionPane.showMessageDialog(null,"Pilih data yang akan dihapus !!!");        
        }
    }
    public void call_updaterowRegions(){
        frameUpdateRegions fupdate = new frameUpdateRegions();
        
        int row = jTable.getSelectedRow();
        int regions_id = (int)tableRegions.getValueAt(row, 0);
        String region_name = (String)tableRegions.getValueAt(row, 1);
        modelRegions m = dbRegions.select_row_regions(regions_id);
        
        if (m!=null){
            fupdate.jTextField_region_id.setText(Integer.toString(regions_id));
            fupdate.jTextField_region_name.setText(region_name);
            fupdate.setVisible(true);
            refreshdataRegions();
        }
        else{
            JOptionPane.showMessageDialog(null, "Region dengan region_id"+regions_id+"tidak ditemukan");
        }
    }

    public void call_filterdatabaseregions(){
        String keyword;
        keyword=JOptionPane.showInputDialog(null,"Nama region yang dicari?","Filter/Pencarian",JOptionPane.QUESTION_MESSAGE);
        if(keyword!=null){
            tableRegions.setData(dbRegions.filter_database_regions(keyword));
            tableRegions.fireTableDataChanged();
        }
    }
//  </editor-fold>
    
     
     /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel_content = new javax.swing.JPanel();
        jLabel_img_title = new javax.swing.JLabel();
        jButton_employees = new javax.swing.JButton();
        jButton_dependents = new javax.swing.JButton();
        jButton_jobs = new javax.swing.JButton();
        jButton_departements = new javax.swing.JButton();
        jButton_locations = new javax.swing.JButton();
        jButton_countries = new javax.swing.JButton();
        jButton_regions = new javax.swing.JButton();
        jButton_refreshall = new javax.swing.JButton();
        jPanel_table = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jButton_add = new javax.swing.JButton();
        jButton_delete = new javax.swing.JButton();
        jButton_edit = new javax.swing.JButton();
        jButton_search = new javax.swing.JButton();
        jButton_export = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel_content.setBackground(new java.awt.Color(18, 61, 95));

        jLabel_img_title.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/images/logo-content.png"))); // NOI18N

        jButton_employees.setBackground(new java.awt.Color(18, 61, 95));
        jButton_employees.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButton_employees.setForeground(new java.awt.Color(255, 255, 255));
        jButton_employees.setText("EMPLOYEES");
        jButton_employees.setToolTipText("");
        jButton_employees.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_employeesActionPerformed(evt);
            }
        });

        jButton_dependents.setBackground(new java.awt.Color(18, 61, 95));
        jButton_dependents.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButton_dependents.setForeground(new java.awt.Color(255, 255, 255));
        jButton_dependents.setText("DEPENDENTS");
        jButton_dependents.setToolTipText("");
        jButton_dependents.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_dependentsActionPerformed(evt);
            }
        });

        jButton_jobs.setBackground(new java.awt.Color(18, 61, 95));
        jButton_jobs.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButton_jobs.setForeground(new java.awt.Color(255, 255, 255));
        jButton_jobs.setText("JOBS");
        jButton_jobs.setToolTipText("");
        jButton_jobs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_jobsActionPerformed(evt);
            }
        });

        jButton_departements.setBackground(new java.awt.Color(18, 61, 95));
        jButton_departements.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButton_departements.setForeground(new java.awt.Color(255, 255, 255));
        jButton_departements.setText("DEPARTEMENTS");
        jButton_departements.setToolTipText("");
        jButton_departements.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_departementsActionPerformed(evt);
            }
        });

        jButton_locations.setBackground(new java.awt.Color(18, 61, 95));
        jButton_locations.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButton_locations.setForeground(new java.awt.Color(255, 255, 255));
        jButton_locations.setText("LOCATIONS");
        jButton_locations.setToolTipText("");
        jButton_locations.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_locationsActionPerformed(evt);
            }
        });

        jButton_countries.setBackground(new java.awt.Color(18, 61, 95));
        jButton_countries.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButton_countries.setForeground(new java.awt.Color(255, 255, 255));
        jButton_countries.setText("COUNTRIES");
        jButton_countries.setToolTipText("");
        jButton_countries.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_countriesActionPerformed(evt);
            }
        });

        jButton_regions.setBackground(new java.awt.Color(18, 61, 95));
        jButton_regions.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButton_regions.setForeground(new java.awt.Color(255, 255, 255));
        jButton_regions.setText("REGIONS");
        jButton_regions.setToolTipText("");
        jButton_regions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_regionsActionPerformed(evt);
            }
        });

        jButton_refreshall.setBackground(new java.awt.Color(18, 61, 95));
        jButton_refreshall.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton_refreshall.setForeground(new java.awt.Color(255, 255, 255));
        jButton_refreshall.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/images/refresh.png"))); // NOI18N
        jButton_refreshall.setText("  REFRESH ALL");
        jButton_refreshall.setToolTipText("");
        jButton_refreshall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_refreshallActionPerformed(evt);
            }
        });

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable);

        jButton_add.setBackground(new java.awt.Color(255, 255, 255));
        jButton_add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/images/plus.png"))); // NOI18N
        jButton_add.setText(" ADD");
        jButton_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_addActionPerformed(evt);
            }
        });

        jButton_delete.setBackground(new java.awt.Color(255, 255, 255));
        jButton_delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/images/delete.png"))); // NOI18N
        jButton_delete.setText(" DELETE");
        jButton_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_deleteActionPerformed(evt);
            }
        });

        jButton_edit.setBackground(new java.awt.Color(255, 255, 255));
        jButton_edit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/images/pencil.png"))); // NOI18N
        jButton_edit.setText(" EDIT");
        jButton_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_editActionPerformed(evt);
            }
        });

        jButton_search.setBackground(new java.awt.Color(255, 255, 255));
        jButton_search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/images/search.png"))); // NOI18N
        jButton_search.setText("SEARCH");
        jButton_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_searchActionPerformed(evt);
            }
        });

        jButton_export.setBackground(new java.awt.Color(255, 255, 255));
        jButton_export.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/images/export-file.png"))); // NOI18N
        jButton_export.setText(" EXPORT TO PDF");
        jButton_export.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_exportActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_tableLayout = new javax.swing.GroupLayout(jPanel_table);
        jPanel_table.setLayout(jPanel_tableLayout);
        jPanel_tableLayout.setHorizontalGroup(
            jPanel_tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_tableLayout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(jPanel_tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_tableLayout.createSequentialGroup()
                        .addComponent(jButton_add)
                        .addGap(18, 18, 18)
                        .addComponent(jButton_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton_search)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton_export)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_tableLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16))))
        );
        jPanel_tableLayout.setVerticalGroup(
            jPanel_tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_tableLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_edit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton_export, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel_tableLayout.createSequentialGroup()
                        .addGroup(jPanel_tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton_add, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jButton_search, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        jButton1.setBackground(new java.awt.Color(18, 61, 95));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_contentLayout = new javax.swing.GroupLayout(jPanel_content);
        jPanel_content.setLayout(jPanel_contentLayout);
        jPanel_contentLayout.setHorizontalGroup(
            jPanel_contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_contentLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel_contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel_contentLayout.createSequentialGroup()
                        .addComponent(jLabel_img_title)
                        .addGap(315, 315, 315)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel_contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel_table, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel_contentLayout.createSequentialGroup()
                            .addGroup(jPanel_contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jButton_jobs, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton_locations, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel_contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel_contentLayout.createSequentialGroup()
                                    .addComponent(jButton_employees, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jButton_dependents, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jButton_departements, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(jPanel_contentLayout.createSequentialGroup()
                                    .addComponent(jButton_countries, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jButton_regions, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jButton_refreshall, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel_contentLayout.setVerticalGroup(
            jPanel_contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_contentLayout.createSequentialGroup()
                .addGroup(jPanel_contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_contentLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel_img_title))
                    .addGroup(jPanel_contentLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jButton1)))
                .addGap(24, 24, 24)
                .addGroup(jPanel_contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_jobs)
                    .addComponent(jButton_employees)
                    .addComponent(jButton_dependents)
                    .addComponent(jButton_departements))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_locations)
                    .addComponent(jButton_countries)
                    .addComponent(jButton_regions)
                    .addComponent(jButton_refreshall))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel_table, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(76, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_employeesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_employeesActionPerformed
        // TODO add your handling code here:
        showTableEmployees();
        refreshdataEmployees();
    }//GEN-LAST:event_jButton_employeesActionPerformed

    private void jButton_dependentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_dependentsActionPerformed
        showTableDependents();
        refreshdataDependents();
    }//GEN-LAST:event_jButton_dependentsActionPerformed

    private void jButton_jobsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_jobsActionPerformed
        showTableJobs();
        refreshdataJobs();
    }//GEN-LAST:event_jButton_jobsActionPerformed

    private void jButton_departementsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_departementsActionPerformed
        // TODO add your handling code here:
        showTableDepartments();
        refreshdataDepartments();
    }//GEN-LAST:event_jButton_departementsActionPerformed

    private void jButton_locationsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_locationsActionPerformed
        // TODO add your handling code here:
        showTableLocations();
        refreshdataLocations();
    }//GEN-LAST:event_jButton_locationsActionPerformed

    private void jButton_countriesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_countriesActionPerformed
        showTableCountries();
        refreshdataCountries();
    }//GEN-LAST:event_jButton_countriesActionPerformed

    private void jButton_regionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_regionsActionPerformed
        showTableRegions();
        refreshdataRegions();
    }//GEN-LAST:event_jButton_regionsActionPerformed

    private void jButton_refreshallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_refreshallActionPerformed
        refreshdataCountries();
        refreshdataDepartments();
        refreshdataDependents();
        refreshdataEmployees();
        refreshdataJobs();
        refreshdataLocations();
        refreshdataRegions();
    }//GEN-LAST:event_jButton_refreshallActionPerformed

    private void jButton_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_addActionPerformed
        
        switch (Option){
            case 1: call_addrowCountries();
                    break; 
            case 2: call_addrowDepartments();
                    break;
            case 3: call_addrowDependents();
                    break;
            case 4: call_addrowEmployees();
                    break; 
            case 5: call_addrowJobs();
                    break;
            case 6 : call_addrowLocations();
                    break; 
            case 7: call_addrowRegions();
                    break;
        }
        
    }//GEN-LAST:event_jButton_addActionPerformed

    private void jButton_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_deleteActionPerformed
        switch (Option){
            case 1: call_deleterowCountries();
                    break; 
            case 2: call_deleterowDepartments();
                    break;
            case 3: call_deleterowDependents();
                    break;
            case 4: call_deleterowEmployees();
                    break; 
            case 5: call_deleterowJobs();
                    break;
            case 6: call_deleterowLocations();
                    break; 
            case 7: call_deleterowRegions();
                    break;
        }
    }//GEN-LAST:event_jButton_deleteActionPerformed

    private void jButton_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_editActionPerformed
        switch (Option){
            case 1: call_updaterowCountries();
                    refreshdataCountries();
                    showTableCountries();
                    break; 
            case 2: call_updaterowDepartments();
                    refreshdataDepartments();
                    showTableDepartments();
                    break;
            case 3: call_updaterowDependents();
                    refreshdataDependents();
                    showTableDependents();
                    break;
            case 4: call_updaterowEmployees();
                    refreshdataEmployees();
                    showTableEmployees();
                    break; 
            case 5: call_updaterowJobs();
                    refreshdataJobs();
                    showTableJobs(); 
                    break;
            case 6: call_updaterowLocations();
                    refreshdataLocations();
                    showTableLocations();
                    break; 
            case 7: call_updaterowRegions();
                    refreshdataRegions();
                    showTableRegions();
                    break;
        }
    }//GEN-LAST:event_jButton_editActionPerformed

    private void jButton_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_searchActionPerformed
        switch (Option){
            case 1: call_filterdatabasecountries();
                    break;
            case 2: call_filterdatabasedepartments();
                    break;
            case 3: call_filterdatabasedependents();
                    break;
            case 4: call_filterdatabaseemployees();
                    break;
            case 5: call_filterdatabasejobs();
                    break;
            case 6: call_filterdatabaselocations();
                    break;        
            case 7: call_filterdatabaseregions();
                    break;
        }
    }//GEN-LAST:event_jButton_searchActionPerformed

    private void jButton_exportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_exportActionPerformed

        try {
            switch (Option){
            case 1: exportPDF.exportCountries();
                    break;
            case 2: exportPDF.exportDepartments();
                    break;
            case 3: exportPDF.exportDependents();
                    break;
            case 4: exportPDF.exportEmployees();
                    break;
            case 5: exportPDF.exportJobs();
                    break;
            case 6: exportPDF.exportLocations();
                    break;        
            case 7: exportPDF.exportRegion();
                    break;
            }
            JOptionPane.showMessageDialog(null, "Export Berhasil disimpan di folder Penggajian");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,"Export Error"); 
        }
    }//GEN-LAST:event_jButton_exportActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        navigation.showWelcome(this);
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton_add;
    private javax.swing.JButton jButton_countries;
    private javax.swing.JButton jButton_delete;
    private javax.swing.JButton jButton_departements;
    private javax.swing.JButton jButton_dependents;
    private javax.swing.JButton jButton_edit;
    private javax.swing.JButton jButton_employees;
    private javax.swing.JButton jButton_export;
    private javax.swing.JButton jButton_jobs;
    private javax.swing.JButton jButton_locations;
    private javax.swing.JButton jButton_refreshall;
    private javax.swing.JButton jButton_regions;
    private javax.swing.JButton jButton_search;
    private javax.swing.JLabel jLabel_img_title;
    private javax.swing.JPanel jPanel_content;
    private javax.swing.JPanel jPanel_table;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable;
    // End of variables declaration//GEN-END:variables
}
