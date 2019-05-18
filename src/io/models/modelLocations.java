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
public class modelLocations {
    private int location_id;
    private String street_address;
    private String postal_code;
    private String city;
    private String state_province;
    private String country_id;
    
    public void set_location_id(int m_location_id){
        location_id = m_location_id;
    }
    public void set_street_address(String m_street_address){
        street_address = m_street_address;
    }    
    public void set_postal_code(String m_postal_code){
        postal_code = m_postal_code;
    }
    public void set_city(String m_city){
        city = m_city;
    }
    public void set_state_province(String m_state_province){
        state_province = m_state_province;
    }
    public void set_country_id(String m_country_id){
        country_id = m_country_id;
    }
    
    public int get_location_id(){
        return location_id;
    }
    public String get_street_address(){
        return street_address;
    }
    public String get_postal_code(){
        return postal_code;
    }
    public String get_city(){
        return city;
    }
    public String get_state_province(){
        return state_province;
    }
    public String get_country_id(){
        return country_id;
    }
    
    public modelLocations(int location_id, String street_address, 
            String postal_code, String city, String state_province, String country_id)
    {
        set_location_id(location_id);
        set_street_address(street_address);
        set_postal_code(postal_code);
        set_city(city);
        set_state_province(state_province);
        set_country_id(country_id);

    }
}
