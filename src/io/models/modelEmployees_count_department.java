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
public class modelEmployees_count_department {
    private int department_id;
    private int banyak;
    
    

    public void set_department_id(int m_department_id){
        department_id = m_department_id;
    }
    public void set_banyak(int m_banyak){
        banyak = m_banyak;
    }
    
    

    public int get_department_id(){
        return department_id;
    }
    public int get_banyak(){
        return banyak;
    }
    
    
    public modelEmployees_count_department(int department_id, int banyak)
    {
        set_department_id(department_id);
        set_banyak(banyak);
    }
}
