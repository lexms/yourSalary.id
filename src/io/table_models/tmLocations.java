/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.table_models;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import io.models.modelLocations;

/**
 *
 * @author YRRNLMR
 */
public class tmLocations extends AbstractTableModel{
    private ArrayList<modelLocations> data;
    private String[] columnName = {"location_id","street_address","postal_code","city","state_province","country_id"};
    
    public void setData(ArrayList<modelLocations> dt){
        this.data= dt;
    }
    
    @Override
    public int getColumnCount(){   
        return columnName.length;  
    }  
    
    @Override
    public int getRowCount(){
        return data.size();  
    }  
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex){
        modelLocations mlocations = data.get(rowIndex);
        switch(columnIndex){
            case 0 : return mlocations.get_location_id();
            case 1 : return mlocations.get_street_address();
            case 2 : return mlocations.get_postal_code();
            case 3 : return mlocations.get_city();
            case 4 : return mlocations.get_state_province();
            case 5 : return mlocations.get_country_id();
            default : return null;
        } 
    }  
    public String getColumnName(int column){   
        return columnName[column];  
    }
    
}
