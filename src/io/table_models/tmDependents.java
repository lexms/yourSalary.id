/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.table_models;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import io.models.modelDependents;

/**
 *
 * @author YRRNLMR
 */
public class tmDependents extends AbstractTableModel {
    private ArrayList<modelDependents> data;
    private String[] columnName = {"dependent_id","first_name","last_name","relationship","employee_id"};
    
    public void setData(ArrayList<modelDependents> dt){
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
        modelDependents mdependents = data.get(rowIndex);
        switch(columnIndex){
            case 0 : return mdependents.get_dependent_id();
            case 1 : return mdependents.get_first_name();
            case 2 : return mdependents.get_last_name();
            case 3 : return mdependents.get_relationship();
            case 4 : return mdependents.get_employee_id();
            default : return null;
        } 
    }  
    public String getColumnName(int column){   
        return columnName[column];  
    }
    
}
