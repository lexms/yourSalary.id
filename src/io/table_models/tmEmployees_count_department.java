/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.table_models;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import io.models.modelEmployees_count_department;


/**
 *
 * @author YRRNLMR
 */
public class tmEmployees_count_department extends AbstractTableModel {
    
    private ArrayList<modelEmployees_count_department> data;
    private String[] columnName = {"department_id","banyak pegawai"};
    
    public void setData(ArrayList<modelEmployees_count_department> dt){
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
        modelEmployees_count_department memployees = data.get(rowIndex);
        switch(columnIndex){
            case 0  : return memployees.get_department_id();
            case 1  : return memployees.get_banyak();
            default : return null;
        } 
    }  
    public String getColumnName(int column){   
        return columnName[column];  
    }
    
}
