/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.models;

import java.sql.Date;


/**
 *
 * @author user
 */
public class modelEmployees {
    private int employee_id;
    private String first_name;
    private String last_name;
    private String email;
    private String phone_number;
    private Date hire_date;
    private int job_id;
    private double salary;
    private int manager_id;
    private int department_id;
    
    
    public void set_employee_id(int m_employee_id){
        employee_id = m_employee_id;
    }
    public void set_first_name(String m_first_name){
        first_name = m_first_name;
    }    
    public void set_last_name(String m_last_name){
        last_name = m_last_name;
    }
    public void set_email(String m_email){
        email = m_email;
    }
    public void set_phone_number(String m_phone_number){
        phone_number = m_phone_number;
    }
    public void set_hire_date(Date m_hire_date){
        hire_date = m_hire_date;
    }
    public void set_job_id(int m_job_id){
        job_id = m_job_id;
    }
    public void set_salary(double m_salary){
        salary = m_salary;
    }
    public void set_manager_id(int m_manager_id){
        manager_id = m_manager_id;
    }
    public void set_department_id(int m_department_id){
        department_id = m_department_id;
    }
    
    public int get_employee_id(){
        return employee_id;
    }
    public String get_first_name(){
        return first_name;
    }
    public String get_last_name(){
        return last_name;
    }
    public String get_email(){
        return email;
    }
    public String get_phone_number(){
        return phone_number;
    }
    public Date get_hire_date(){
        return hire_date;
    }
    public int get_job_id(){
        return job_id;
    }
    public double get_salary(){
        return salary;
    }
    public int get_manager_id(){
        return manager_id;
    }
    public int get_department_id(){
        return department_id;
    }
    
    
    public modelEmployees(int employee_id, String first_name, String last_name, 
            String email, String phone_number, Date hire_date, int job_id, 
            double salary, int manager_id, int department_id)
    {
        set_employee_id(employee_id);
        set_first_name(first_name);
        set_last_name(last_name);
        set_email(email);
        set_phone_number(phone_number);
        set_hire_date(hire_date);
        set_job_id(job_id);
        set_salary(salary);
        set_manager_id(manager_id);
        set_department_id(department_id);
    }
}
