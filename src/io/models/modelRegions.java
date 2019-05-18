/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.models;

/**
 *
 * @author AlexanderMS
 */
public class modelRegions {
    private int region_id;
    private String region_name;
    
    
   
    public void set_region_name(String m_region_name){
        region_name = m_region_name;
    }
    public void set_region_id(int m_region_id){
        region_id = m_region_id;
    }
    

    public String get_region_name(){
        return region_name;
    }
    public int get_region_id(){
        return region_id;
    }
    
    public modelRegions(int region_id, String region_name ){
        set_region_name(region_name);
        set_region_id(region_id);
    }  
}
