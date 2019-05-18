/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.databases;

import io.models.modelLocations;
import io.services.database;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.lang.String;


/**
 *
 * @author AlexanderMS
 */
public class databaseLocations {

    public ArrayList<modelLocations> show_database_locations()
    {
        ArrayList<modelLocations> list = new ArrayList<modelLocations>();
        Connection conn=null;
        Statement stmt=null;
        try
        {
            conn = database.getConnection();
            stmt=conn.createStatement();
            String sql;
            sql="select * from locations";
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next())
            {
                list.add(new modelLocations(rs.getInt("location_id"),rs.getString("street_address")
                        ,rs.getString("postal_code"),rs.getString("city"),rs.getString("state_province"),rs.getString("country_id")));
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
    public void add_data_locations(modelLocations m)
    {
        Connection conn=null;
        Statement stmt=null;
        try
        {
            conn=database.getConnection();
            stmt=conn.createStatement();
            String sql="insert into locations values "
                    + "('"+m.get_location_id()
                    +"','"+m.get_street_address()
                    +"','"+m.get_postal_code()
                    +"','"+m.get_city()
                    +"','"+m.get_state_province()
                    +"','"+m.get_country_id()+"')";
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
    public void delete_row_locations(int location_id)
    {
        Connection conn=null;
        Statement stmt=null;
        try
        {
            
            conn=database.getConnection();
            stmt=conn.createStatement();
            String sql="delete from locations where location_id='"+location_id+"'";
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
    public modelLocations select_row_locations(int location_id){
        modelLocations m=null;
        Connection conn=null;
        Statement stmt=null;
        
        try
        {
            conn = database.getConnection();
            stmt=conn.createStatement();
            String sql;
            sql="select * from locations where location_id= '"+location_id+"'";
            ResultSet rs = stmt.executeQuery(sql);
            if(rs.next())
            {
                m = new modelLocations(rs.getInt("location_id"),rs.getString("street_address"),rs.getString("postal_code"),
                rs.getString("city"),rs.getString("state_province"),rs.getString("country_id"));
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
    public void update_row_locations(modelLocations m){
        Connection conn=null;
        Statement stmt=null;
        try
        {
            conn = database.getConnection();
            stmt=conn.createStatement();
            String sql;
            sql="update locations "
                +"set street_address = '"+m.get_street_address()+"',"
                +" postal_code = '"+m.get_postal_code()+"',"
                +" city = '"+m.get_city()+"',"
                +" state_province = '"+m.get_state_province()+"',"
                +" country_id = '"+m.get_country_id()+"'"
                +" where location_id = '"+m.get_location_id()+"'";
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
    public ArrayList<modelLocations> filter_database_locations(String keyword)
    {
        ArrayList<modelLocations> list = new ArrayList<modelLocations>();
        Connection conn=null;
        Statement stmt=null;
        try
        {
            conn = database.getConnection();
            stmt=conn.createStatement();
            String sql;
            sql="select * from locations where street_address= '"+keyword+"'";
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next())
            {
                list.add(new modelLocations(rs.getInt("location_id"),rs.getString("street_address"),rs.getString("postal_code"),
                rs.getString("city"),rs.getString("state_province"),rs.getString("country_id")));
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
