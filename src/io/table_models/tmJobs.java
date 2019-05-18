/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.table_models;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import io.models.modelJobs;


/**
 *
 * @author User
 */
public class tmJobs extends AbstractTableModel{

    private ArrayList<modelJobs> data;
    private String[] columnName = {"job_id","job_title","min_salary","max_salary"};
    
    public void setData(ArrayList<modelJobs> dt){
        this.data= dt;
    }
    
    @Override
    public int getRowCount() {
        return data.size();  
    }

    @Override
    public int getColumnCount() {
        return columnName.length; 
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        modelJobs mjobs = data.get(rowIndex);
        switch(columnIndex){
            case 0 : return mjobs.get_job_id();
            case 1 : return mjobs.get_job_title();
            case 2 : return mjobs.get_min_salary();
            case 3 : return mjobs.get_max_salary();
            default : return null;
        } 
    }
    
    public String getColumnName(int column){   
        return columnName[column];  
    }
    
}
