/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.table_models;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import io.models.modelDepartments;

/**
 *
 * @author YRRNLMR
 */
public class tmDepartments extends AbstractTableModel {
    private ArrayList<modelDepartments> data;
    private String[] columnName = {"department_id","department_name","location_id"};
    
    public void setData(ArrayList<modelDepartments> dt){
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
        modelDepartments mdepartments = data.get(rowIndex);
        switch(columnIndex){
            case 0 : return mdepartments.get_department_id();
            case 1 : return mdepartments.get_department_name();
            case 2 : return mdepartments.get_location_id();
            default : return null;
        } 
    }  
    public String getColumnName(int column){   
        return columnName[column];  
    }
    
}
