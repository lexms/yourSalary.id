/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.databases;

import io.models.modelEmployees;
import io.models.modelEmployees_count_department;
import io.services.database;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author AlexanderMS
 */
public class databaseEmployees {

    
    public ArrayList<modelEmployees_count_department> show_count_department(int n_employee){
        ArrayList<modelEmployees_count_department> list = new ArrayList<modelEmployees_count_department>();
        Connection conn=null;
        Statement stmt=null;
        
//        int n_employee = 3;
        try
        {
            conn = database.getConnection();
            stmt=conn.createStatement();

            
            PreparedStatement ps = conn.prepareStatement("SELECT `department_id`,COUNT(`department_id`) AS banyak FROM employees\n" +
                "GROUP BY `department_id`\n" +
                "HAVING banyak >= ? \n" +
                "ORDER BY banyak DESC");
            ps.setObject(1, n_employee);
            
            ResultSet rs = ps.executeQuery();
            while(rs.next())
            {
                list.add(new modelEmployees_count_department(rs.getInt("department_id"),rs.getInt("banyak")));
            }
            rs.close();
        }
        catch(Exception e)
        {
            System.out.println("Error : "+e.getMessage());
        }
        finally
        {
            try
            {
                stmt.close();
            }
            catch(Exception e){}
            try
            {
                conn.close();
            }
            catch(Exception e)
            {}
        }
        return list;
    }
    
    public ArrayList<modelEmployees> show_database_employees()
    {
        ArrayList<modelEmployees> list = new ArrayList<modelEmployees>();
        Connection conn=null;
        Statement stmt=null;
        try
        {
            conn = database.getConnection();
            stmt=conn.createStatement();
            String sql;
            sql="select * from employees";
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next())
            {
                list.add(new modelEmployees(rs.getInt("employee_id"),rs.getString("first_name")
                        ,rs.getString("last_name"),rs.getString("email"),rs.getString("phone_number"),rs.getDate("hire_date")
                        ,rs.getInt("job_id"),rs.getDouble("salary"),rs.getInt("manager_id"),rs.getInt("department_id")));
            }
            rs.close();
        }
        catch(Exception e)
        {
            System.out.println("Error : "+e.getMessage());
        }
        finally
        {
            try
            {
                stmt.close();
            }
            catch(Exception e){}
            try
            {
                conn.close();
            }
            catch(Exception e)
            {}
        }
        return list;
    }
    public void add_data_employees(modelEmployees m)
    {
        Connection conn=null;
        Statement stmt=null;
        try
        {
            conn=database.getConnection();
            stmt=conn.createStatement();
            String sql="insert into employees values "
                    + "('"+m.get_employee_id()
                    +"','"+m.get_first_name()
                    +"','"+m.get_last_name()
                    +"','"+m.get_email()
                    +"','"+m.get_phone_number()
                    +"','"+m.get_hire_date()
                    +"','"+m.get_job_id()
                    +"','"+m.get_salary()
                    +"','"+m.get_manager_id()
                    +"','"+m.get_department_id()+"')";
            stmt.executeUpdate(sql);
        }
        catch(Exception e)
        {
            System.out.println("Error : "+e.getMessage());
        }
        finally
        {
            try
            {
                stmt.close();
            }
            catch(Exception e)
            {}
            try
            {
                conn.close();
            }
            catch(Exception e)
            {}
        }
    }
    public void delete_row_employees(int employee_id)
    {
        Connection conn=null;
        Statement stmt=null;
        try
        {
            
            conn=database.getConnection();
            stmt=conn.createStatement();
            String sql="delete from employees where employee_id='"+employee_id+"'";
            stmt.executeUpdate(sql);
        }
        catch(Exception e)
        {
            System.out.println("Error : "+e.getMessage());
        }
        finally
        {
            try
            {
                stmt.close();
            }
            catch(Exception e)
            {}
            try
            {
                conn.close();
            }
            catch(Exception e)
            {}
        }
    }
    public modelEmployees select_row_employees(int employee_id){
        modelEmployees m=null;
        Connection conn=null;
        Statement stmt=null;
        
        try
        {
            conn = database.getConnection();
            stmt=conn.createStatement();
            String sql;
            sql="select * from employees where employee_id= '"+employee_id+"'";
            ResultSet rs = stmt.executeQuery(sql);
            if(rs.next())
            {
                m = new modelEmployees(rs.getInt("employee_id"),rs.getString("first_name"),rs.getString("last_name"),
                rs.getString("email"),rs.getString("phone_number"),rs.getDate("hire_date"),rs.getInt("job_id"),
                rs.getDouble("salary"),rs.getInt("manager_id"),rs.getInt("department_id"));
            }
            else
                m = null;
                
            rs.close();
        }
        catch(Exception e)
        {
            System.out.println("Error : "+e.getMessage());
        }
        finally
        {
            try
            {
                stmt.close();
            }
            catch(Exception e){}
            try
            {
                conn.close();
            }
            catch(Exception e)
            {}
        }
        
        return m;
    }
    public void update_row_employees(modelEmployees m){
        Connection conn=null;
        Statement stmt=null;
        try
        {
            conn = database.getConnection();
            stmt=conn.createStatement();
            String sql;
            sql="update employees " 
                 +"set first_name = '"+m.get_first_name()+"',"
                 +" last_name = '"+m.get_last_name()+"',"
                 +" email = '"+m.get_email()+"',"
                 +" phone_number = '"+m.get_phone_number()+"',"
                 +" hire_date = '"+m.get_hire_date()+"',"
                 +" job_id = '"+m.get_job_id()+"',"
                 +" salary = '"+m.get_salary()+"',"
                 +" manager_id = '"+m.get_manager_id()+"',"
                 +" department_id = '"+m.get_department_id()+"'"
                 +" where employee_id = '"+m.get_employee_id()+"'";
            stmt.executeUpdate(sql);
            
        }
        catch(Exception e)
        {
            System.out.println("Error : "+e.getMessage());
        }
        finally
        {
            try
            {
                stmt.close();
            }
            catch(Exception e){}
            try
            {
                conn.close();
            }
            catch(Exception e)
            {}
        }
    }
    public ArrayList<modelEmployees> filter_database_employees(String keyword)
    {
        ArrayList<modelEmployees> list = new ArrayList<modelEmployees>();
        Connection conn=null;
        Statement stmt=null;
        try
        {
            conn = database.getConnection();
            stmt=conn.createStatement();
            String sql;
            sql="select * from employees where first_name= '"+keyword+"'";
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next())
            {
                list.add(new modelEmployees(rs.getInt("employee_id"),rs.getString("first_name"),rs.getString("last_name"),
                rs.getString("email"),rs.getString("phone_number"),rs.getDate("hire_date"),rs.getInt("job_id"),
                rs.getDouble("salary"),rs.getInt("manager_id"),rs.getInt("department_id")));
            }
            rs.close();
        }
        catch(Exception e)
        {
            System.out.println("Error : "+e.getMessage());
        }
        finally
        {
            try
            {
                stmt.close();
            }
            catch(Exception e){}
            try
            {
                conn.close();
            }
            catch(Exception e)
            {}
        }
        return list;
    }  
}
