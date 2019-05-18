/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.table_models;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import io.models.modelEmployees;


/**
 *
 * @author YRRNLMR
 */
public class tmEmployees extends AbstractTableModel {
    
    private ArrayList<modelEmployees> data;
    private String[] columnName = {"employee_id","first_name","last_name","email","phone_numbe","hire_date","job_id",
                                  "salary","manager_id","department_id"};
    
    public void setData(ArrayList<modelEmployees> dt){
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
        modelEmployees memployees = data.get(rowIndex);
        switch(columnIndex){
            case 0  : return memployees.get_employee_id();
            case 1  : return memployees.get_first_name();
            case 2  : return memployees.get_last_name();
            case 3  : return memployees.get_email();
            case 4  : return memployees.get_phone_number();
            case 5  : return memployees.get_hire_date();
            case 6  : return memployees.get_job_id();
            case 7  : return memployees.get_salary();
            case 8  : return memployees.get_manager_id();
            case 9  : return memployees.get_department_id();
            default : return null;
        } 
    }  
    public String getColumnName(int column){   
        return columnName[column];  
    }
    
}
