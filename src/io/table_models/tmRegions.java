/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.table_models;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import io.models.modelRegions;

/**
 *
 * @author AlexanderMS
 */
public class tmRegions extends AbstractTableModel{
    private ArrayList<modelRegions> data;
    private String[] columnName = {"region_id","region_name"};
    
    public void setData(ArrayList<modelRegions> dt){
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
        modelRegions mregions = data.get(rowIndex);
        switch(columnIndex){
            case 0 : return mregions.get_region_id();
            case 1 : return mregions.get_region_name();
            default : return null;
        } 
    }  
    public String getColumnName(int column){   
        return columnName[column];  
    }
    
}
