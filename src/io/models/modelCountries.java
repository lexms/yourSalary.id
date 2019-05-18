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
public class modelCountries {
    private String country_id;
    private String country_name;
    private String region_id;
    
    public void set_country_id(String m_country_id){
        country_id = m_country_id;
    }
   
    public void set_country_name(String m_country_name){
        country_name = m_country_name;
    }
    public void set_region_id(String m_region_id){
        region_id = m_region_id;
    }
    
    public String get_country_id(){
        return country_id;
    }

    public String get_country_name(){
        return country_name;
    }
    public String get_region_id(){
        return region_id;
    }
    
    public modelCountries(String country_id, String country_name, String region_id){
        set_country_id(country_id);
        set_country_name(country_name);
        set_region_id(region_id);
    }
}
