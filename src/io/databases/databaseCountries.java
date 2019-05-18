/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.databases;

import io.models.modelCountries;
import io.services.database;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author AlexanderMS
 */
public class databaseCountries {

    public ArrayList<modelCountries> show_database_countries()
    {
        ArrayList<modelCountries> list = new ArrayList<modelCountries>();
        Connection conn=null;
        Statement stmt=null;
        try
        {
            conn = database.getConnection();
            stmt=conn.createStatement();
            String sql;
            sql="select * from countries";
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next())
            {
                list.add(new modelCountries(rs.getString("country_id"),rs.getString("country_name")
                        ,rs.getString("region_id")));
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
    public void add_data_countries(modelCountries m)
    {
        Connection conn=null;
        Statement stmt=null;
        try
        {
            conn=database.getConnection();
            stmt=conn.createStatement();
            String sql="insert into countries values "
                    + "('"+m.get_country_id()
                    +"','"+m.get_country_name()
                    +"','"+m.get_region_id()
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
    public void delete_row_countries(String country_id)
    {
        Connection conn=null;
        Statement stmt=null;
        try
        {
            
            conn=database.getConnection();
            stmt=conn.createStatement();
            String sql="delete from countries where country_id='"+country_id+"'";
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
    public modelCountries select_row_countries(String country_id){
        modelCountries m=null;
        Connection conn=null;
        Statement stmt=null;
        
        try
        {
            conn = database.getConnection();
            stmt=conn.createStatement();
            String sql;
            sql="select * from countries where country_id= '"+country_id+"'";
            ResultSet rs = stmt.executeQuery(sql);
            if(rs.next())
            {
                m = new modelCountries(rs.getString("country_id"),rs.getString("country_name"),rs.getString("region_id"));
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
    public void update_row_countries(modelCountries m){
        Connection conn=null;
        Statement stmt=null;
        try
        {
            conn = database.getConnection();
            stmt=conn.createStatement();
            String sql;
            sql="update countries "
                +"set country_name = '"+m.get_country_name()+"',"
                +" region_id = '"+m.get_region_id()+"'"
                +" where country_id = '"+m.get_country_id()+"'";
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
    public ArrayList<modelCountries> filter_databasecountries(String keyword)
    {
        ArrayList<modelCountries> list = new ArrayList<modelCountries>();
        Connection conn=null;
        Statement stmt=null;
        try
        {
            conn = database.getConnection();
            stmt=conn.createStatement();
            String sql;
            sql="select * from countries where country_name= '"+keyword+"'";
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next())
            {
                list.add(new modelCountries(rs.getString("country_id"),rs.getString("country_name"),rs.getString("region_id")));
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
