/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.models;

/**
 *
 * @author user
 */
public class modelDepartments {
    private String department_id;
    private String department_name;
    private String location_id;
    
    public void set_department_id(String m_department_id){
        department_id = m_department_id;
    }
   
    public void set_department_name(String m_department_name){
        department_name = m_department_name;
    }
    public void set_location_id(String m_location_id){
        location_id = m_location_id;
    }
    
    public String get_department_id(){
        return department_id;
    }

    public String get_department_name(){
        return department_name;
    }
    public String get_location_id(){
        return location_id;
    }
    
    public modelDepartments(String department_id, String department_name, String location_id){
        set_department_id(department_id);
        set_department_name(department_name);
        set_location_id(location_id);
    }
}
