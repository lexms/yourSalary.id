/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.databases;

import io.models.modelDependents;
import io.services.database;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author AlexanderMS
 */
public class databaseDependents {

    public ArrayList<modelDependents> show_database_dependents()
    {
        ArrayList<modelDependents> list = new ArrayList<modelDependents>();
        Connection conn=null;
        Statement stmt=null;
        try
        {
            conn = database.getConnection();
            stmt=conn.createStatement();
            String sql;
            sql="select * from dependents";
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next())
            {
                list.add(new modelDependents(rs.getInt("dependent_id"),rs.getString("first_name")
                        ,rs.getString("last_name"),rs.getString("relationship"),rs.getInt("employee_id")));
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
    public void add_data_dependents(modelDependents m)
    {
        Connection conn=null;
        Statement stmt=null;
        try
        {
            conn=database.getConnection();
            stmt=conn.createStatement();
            String sql="insert into dependents values ('"+m.get_dependent_id()
                    +"','"+m.get_first_name()
                    +"','"+m.get_last_name()
                    +"','"+m.get_relationship()
                    +"','"+m.get_employee_id()
                    +"')";
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
    public void delete_row_dependents(int dependent_id)
    {
        Connection conn=null;
        Statement stmt=null;
        try
        {
            
            conn=database.getConnection();
            stmt=conn.createStatement();
            String sql="delete from dependents where dependent_id='"+dependent_id+"'";
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
    public modelDependents select_row_dependents(int dependent_id){
        modelDependents m=null;
        Connection conn=null;
        Statement stmt=null;
        
        try
        {
            conn = database.getConnection();
            stmt=conn.createStatement();
            String sql;
            sql="select * from dependents where dependent_id= '"+dependent_id+"'";
            ResultSet rs = stmt.executeQuery(sql);
            if(rs.next())
            {
                m = new modelDependents(rs.getInt("dependent_id"),rs.getString("first_name"),rs.getString("last_name"),
                rs.getString("relationship"),rs.getInt("employee_id"));
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
    public void update_row_dependents(modelDependents m){
        Connection conn=null;
        Statement stmt=null;
        try
        {
            conn = database.getConnection();
            stmt=conn.createStatement();
            String sql;
            sql="update dependents "
                +"set first_name = '"+m.get_first_name()+"',"
                +" last_name = '"+m.get_last_name()+"',"
                +" relationship = '"+m.get_relationship()+"'"
                +" where dependent_id = '"+m.get_dependent_id()+"'";
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
    public ArrayList<modelDependents> filter_database_dependents(String keyword)
    {
        ArrayList<modelDependents> list = new ArrayList<modelDependents>();
        Connection conn=null;
        Statement stmt=null;
        try
        {
            conn = database.getConnection();
            stmt=conn.createStatement();
            String sql;
            sql="select * from dependents where first_name= '"+keyword+"'";
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next())
            {
                list.add(new modelDependents(rs.getInt("dependent_id"),rs.getString("first_name"),rs.getString("last_name")
                ,rs.getString("relationship"),rs.getInt("employee_id")));
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
