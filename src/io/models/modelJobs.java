/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.models;

/**
 *
 * @author User
 */
public class modelJobs {
    private String job_id;
    private String job_title;
    private double min_salary;
    private double max_salary;
    
    public void set_job_id(String m_job_id){
        job_id = m_job_id;
    }
    public void set_job_title(String m_job_title){
        job_title = m_job_title;
    }    
    public void set_min_salary(double m_min_salary){
        min_salary = m_min_salary;
    }
    public void set_max_salary(double m_max_salary){
        max_salary = m_max_salary;
    }
    
    public String get_job_id(){
        return job_id;
    }
    public String get_job_title(){
        return job_title;
    }
    public double get_min_salary(){
        return min_salary;
    }
    public double get_max_salary(){
        return max_salary;
    }
    
    public modelJobs(String job_id, String job_title, double min_salary, double max_salary){
        set_job_id(job_id);
        set_job_title(job_title);
        set_min_salary(min_salary);
        set_max_salary(max_salary);
    }
    
    
    
    

    
}
