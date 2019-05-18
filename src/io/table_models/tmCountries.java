/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.table_models;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import io.models.modelCountries;

/**
 *
 * @author AlexanderMS
 */
public class tmCountries extends AbstractTableModel {
    private ArrayList<modelCountries> data;
    private String[] columnName = {"country_id","country_name","region_id"};
    
    public void setData(ArrayList<modelCountries> dt){
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
        modelCountries mcountries = data.get(rowIndex);
        switch(columnIndex){
            case 0 : return mcountries.get_country_id();
            case 1 : return mcountries.get_country_name();
            case 2 : return mcountries.get_region_id();
            default : return null;
        } 
    }  
    public String getColumnName(int column){   
        return columnName[column];  
    }
    
}
