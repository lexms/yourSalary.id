/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.databases;

import io.models.modelJobs;
import io.services.database;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author AlexanderMS
 */
public class databaseJobs {

    public ArrayList<modelJobs> show_database_jobs()
    {
        ArrayList<modelJobs> list = new ArrayList<modelJobs>();
        Connection conn=null;
        Statement stmt=null;
        try
        {
            conn = database.getConnection();
            stmt=conn.createStatement();
            String sql;
            sql="select * from jobs";
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next())
            {
                list.add(new modelJobs(rs.getString("job_id"),rs.getString("job_title")
                        ,rs.getDouble("min_salary"),rs.getDouble("max_salary")));
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
    public void add_data_jobs(modelJobs m)
    {
        Connection conn=null;
        Statement stmt=null;
        try
        {
            conn=database.getConnection();
            stmt=conn.createStatement();
            String sql="insert into jobs values "
                    + "('"+m.get_job_id()
                    +"','"+m.get_job_title()
                    +"','"+m.get_min_salary()
                    +"','"+m.get_max_salary()+"')";
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
    public void delete_row_jobs(String job_id)
    {
        Connection conn=null;
        Statement stmt=null;
        try
        {
            
            conn=database.getConnection();
            stmt=conn.createStatement();
            String sql="delete from jobs where job_id='"+job_id+"'";
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
    public modelJobs select_row_jobs(String job_id){
        modelJobs m=null;
        Connection conn=null;
        Statement stmt=null;
        
        try
        {
            conn = database.getConnection();
            stmt=conn.createStatement();
            String sql;
            sql="select * from jobs where job_id= '"+job_id+"'";
            ResultSet rs = stmt.executeQuery(sql);
            if(rs.next())
            {
                m = new modelJobs(rs.getString("job_id"),rs.getString("job_title"),rs.getDouble("min_salary"),rs.getDouble("max_salary"));
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
    public void update_row_jobs(modelJobs m){
        Connection conn=null;
        Statement stmt=null;
        try
        {
            conn = database.getConnection();
            stmt=conn.createStatement();
            String sql;
            sql="update jobs "
                +"set job_title = '"+m.get_job_title()+"',"
                +" min_salary = '"+m.get_min_salary()+"',"
                +" max_salary = '"+m.get_max_salary()+"'"
                +" where job_id = '"+m.get_job_id()+"'";
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
    public ArrayList<modelJobs> filter_database_jobs(String keyword)
    {
        ArrayList<modelJobs> list = new ArrayList<modelJobs>();
        Connection conn=null;
        Statement stmt=null;
        try
        {
            conn = database.getConnection();
            stmt=conn.createStatement();
            String sql;
            sql="select * from jobs where job_title= '"+keyword+"'";
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next())
            {
                list.add(new modelJobs(rs.getString("job_id"),rs.getString("job_title"),rs.getDouble("min_salary"),rs.getDouble("max_salary")));
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
