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
public class modelDependents {
    private int dependent_id;
    private String first_name;
    private String last_name;
    private String relationship;
    private int employee_id;
    
    public void set_dependent_id(int m_dependent_id){
        dependent_id = m_dependent_id;
    }
    public void set_first_name(String m_first_name){
        first_name = m_first_name;
    }    
    public void set_last_name(String m_last_name){
        last_name = m_last_name;
    }
    public void set_relationship(String m_relationship){
        relationship = m_relationship;
    }
    public void set_employee_id(int m_employee_id){
        employee_id = m_employee_id;
    }
    
    public int get_dependent_id(){
        return dependent_id;
    }
    public String get_first_name(){
        return first_name;
    }
    public String get_last_name(){
        return last_name;
    }
    public String get_relationship(){
        return relationship;
    }
    public int get_employee_id(){
        return employee_id;
    }
    public modelDependents(int dependent_id, String first_name, String last_name, String relationship, int employee_id ){
        set_dependent_id(dependent_id);
        set_first_name(first_name);
        set_last_name(last_name);
        set_relationship(relationship);
        set_employee_id(employee_id);
    }
    public modelDependents(String first_name, String last_name, String relationship ){
        set_first_name(first_name);
        set_last_name(last_name);
        set_relationship(relationship);
    }
}
