/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.services;

import java.io.FileOutputStream;
import java.io.*;
import java.util.*;
import java.sql.*; 
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.*;



/**
 *
 * @author AlexanderMS
 */
public class exportPDF {
    public static void exportCountries() throws Exception{
        Connection conn=null;
        Statement stmt=null;
        ResultSet query_set=null;
        try
        {   
                conn = database.getConnection();
                stmt = conn.createStatement();
                query_set = stmt.executeQuery("SELECT * FROM countries");
                Document pdf_report = new Document();
                PdfWriter.getInstance(pdf_report, new FileOutputStream("reportCountries.pdf"));
                pdf_report.open();            

                PdfPTable report_table = new PdfPTable(3);

                PdfPCell table_cell;
               
                while (query_set.next()) {                
                                String country_id=query_set.getString("country_id");
                                table_cell=new PdfPCell(new Phrase(country_id));
                                report_table.addCell(table_cell);
                                String country_name=query_set.getString("country_name");
                                table_cell=new PdfPCell(new Phrase(country_name));
                                report_table.addCell(table_cell);
                                String region_id=query_set.getString("region_id");
                                table_cell=new PdfPCell(new Phrase(region_id));
                                report_table.addCell(table_cell);
                                }

                pdf_report.add(report_table);                       
                pdf_report.close();
        }
        catch(Exception e)
        {
            System.out.println("Error : "+e.getMessage());
        }
        finally
        {
            try
            {
                query_set.close();
            }
            catch(Exception e){}
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
    
    public static void exportDepartments() throws Exception{
        Connection conn=null;
        Statement stmt=null;
        ResultSet query_set=null;
        try
        {
                conn = database.getConnection();
                stmt = conn.createStatement();
                query_set = stmt.executeQuery("SELECT * FROM departments");
                Document pdf_report = new Document();
                PdfWriter.getInstance(pdf_report, new FileOutputStream("reportDepartments.pdf"));
                pdf_report.open();            

                PdfPTable report_table = new PdfPTable(3);

                PdfPCell table_cell;
               
                while (query_set.next()) {                
                                String department_id=query_set.getString("department_id");
                                table_cell=new PdfPCell(new Phrase(department_id));
                                report_table.addCell(table_cell);
                                String department_name=query_set.getString("department_name");
                                table_cell=new PdfPCell(new Phrase(department_name));
                                report_table.addCell(table_cell);
                                String location_id=query_set.getString("location_id");
                                table_cell=new PdfPCell(new Phrase(location_id));
                                report_table.addCell(table_cell);
                                }

                pdf_report.add(report_table);                       
                pdf_report.close();
        }
        catch(Exception e)
        {
            System.out.println("Error : "+e.getMessage());
        }
        finally
        {
            try
            {
                query_set.close();
            }
            catch(Exception e){}
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
    
    public static void exportDependents() throws Exception{
        Connection conn=null;
        Statement stmt=null;
        ResultSet query_set=null;
        try
        {   
                conn = database.getConnection();
                stmt = conn.createStatement();
                query_set = stmt.executeQuery("SELECT * FROM dependents");
                Document pdf_report = new Document();
                PdfWriter.getInstance(pdf_report, new FileOutputStream("reportDependents.pdf"));
                pdf_report.open();            

                PdfPTable report_table = new PdfPTable(5);

                PdfPCell table_cell;
               
                while (query_set.next()) {                
                                String dependents_id=query_set.getString("dependent_id");
                                table_cell=new PdfPCell(new Phrase(dependents_id));
                                report_table.addCell(table_cell);
                                String first_name=query_set.getString("first_name");
                                table_cell=new PdfPCell(new Phrase(first_name));
                                report_table.addCell(table_cell);
                                String last_name=query_set.getString("last_name");
                                table_cell=new PdfPCell(new Phrase(last_name));
                                report_table.addCell(table_cell);
                                String relationship=query_set.getString("relationship");
                                table_cell=new PdfPCell(new Phrase(relationship));
                                report_table.addCell(table_cell);
                                String employee_id=query_set.getString("employee_id");
                                table_cell=new PdfPCell(new Phrase(employee_id));
                                report_table.addCell(table_cell);
                                }

                pdf_report.add(report_table);                       
                pdf_report.close();
        }
        catch(Exception e)
        {
            System.out.println("Error : "+e.getMessage());
        }
        finally
        {
            try
            {
                query_set.close();
            }
            catch(Exception e){}
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
    
    public static void exportEmployees() throws Exception{
        Connection conn=null;
        Statement stmt=null;
        ResultSet query_set=null;
        try
        {
                conn = database.getConnection();
                stmt = conn.createStatement();
                query_set = stmt.executeQuery("SELECT * FROM employees");
                Document pdf_report = new Document();
                PdfWriter.getInstance(pdf_report, new FileOutputStream("reportEmployees.pdf"));
                pdf_report.open();            

                PdfPTable report_table = new PdfPTable(10);

                PdfPCell table_cell;
               
                while (query_set.next()) {                
                                String employee_id=query_set.getString("employee_id");
                                table_cell=new PdfPCell(new Phrase(employee_id));
                                report_table.addCell(table_cell);
                                String first_name=query_set.getString("first_name");
                                table_cell=new PdfPCell(new Phrase(first_name));
                                report_table.addCell(table_cell);
                                String last_name=query_set.getString("last_name");
                                table_cell=new PdfPCell(new Phrase(last_name));
                                report_table.addCell(table_cell);
                                String email=query_set.getString("email");
                                table_cell=new PdfPCell(new Phrase(email));
                                report_table.addCell(table_cell);
                                String phone_number=query_set.getString("phone_number");
                                table_cell=new PdfPCell(new Phrase(phone_number));
                                report_table.addCell(table_cell);
                                String hire_date=query_set.getString("hire_date");
                                table_cell=new PdfPCell(new Phrase(hire_date));
                                report_table.addCell(table_cell);
                                String job_id=query_set.getString("job_id");
                                table_cell=new PdfPCell(new Phrase(job_id));
                                report_table.addCell(table_cell);
                                String salary=query_set.getString("salary");
                                table_cell=new PdfPCell(new Phrase(salary));
                                report_table.addCell(table_cell);
                                String manager_id=query_set.getString("manager_id");
                                table_cell=new PdfPCell(new Phrase(manager_id));
                                report_table.addCell(table_cell);
                                String department_id=query_set.getString("department_id");
                                table_cell=new PdfPCell(new Phrase(department_id));
                                report_table.addCell(table_cell);
                                }

                pdf_report.add(report_table);                       
                pdf_report.close();
        }
        catch(Exception e)
        {
            System.out.println("Error : "+e.getMessage());
        }
        finally
        {
            try
            {
                query_set.close();
            }
            catch(Exception e){}
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
    
    public static void exportJobs() throws Exception{
        Connection conn=null;
        Statement stmt=null;
        ResultSet query_set=null;
        try
        {
                conn = database.getConnection();
                stmt = conn.createStatement();
                query_set = stmt.executeQuery("SELECT * FROM jobs");
                Document pdf_report = new Document();
                PdfWriter.getInstance(pdf_report, new FileOutputStream("reportJobs.pdf"));
                pdf_report.open();            

                PdfPTable report_table = new PdfPTable(4);

                PdfPCell table_cell;
               
                while (query_set.next()) {                
                                String job_id=query_set.getString("job_id");
                                table_cell=new PdfPCell(new Phrase(job_id));
                                report_table.addCell(table_cell);
                                String job_title=query_set.getString("job_title");
                                table_cell=new PdfPCell(new Phrase(job_title));
                                report_table.addCell(table_cell);
                                String min_salary=query_set.getString("min_salary");
                                table_cell=new PdfPCell(new Phrase(min_salary));
                                report_table.addCell(table_cell);
                                String max_salary=query_set.getString("max_salary");
                                table_cell=new PdfPCell(new Phrase(max_salary));
                                report_table.addCell(table_cell);
                                }

                pdf_report.add(report_table);                       
                pdf_report.close();
        }
        catch(Exception e)
        {
            System.out.println("Error : "+e.getMessage());
        }
        finally
        {
            try
            {
                query_set.close();
            }
            catch(Exception e){}
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
    
    public static void exportLocations() throws Exception{
        Connection conn=null;
        Statement stmt=null;
        ResultSet query_set=null;
        try
        {
                conn = database.getConnection();
                stmt = conn.createStatement();
                query_set = stmt.executeQuery("SELECT * FROM locations");
                Document pdf_report = new Document();
                PdfWriter.getInstance(pdf_report, new FileOutputStream("reportLocations.pdf"));
                pdf_report.open();            

                PdfPTable report_table = new PdfPTable(5);

                PdfPCell table_cell;
               
                while (query_set.next()) {                
                                String location_id=query_set.getString("location_id");
                                table_cell=new PdfPCell(new Phrase(location_id));
                                report_table.addCell(table_cell);
                                String street_address=query_set.getString("street_address");
                                table_cell=new PdfPCell(new Phrase(street_address));
                                report_table.addCell(table_cell);
                                String postal_code=query_set.getString("postal_code");
                                table_cell=new PdfPCell(new Phrase(postal_code));
                                report_table.addCell(table_cell);
                                String city=query_set.getString("city");
                                table_cell=new PdfPCell(new Phrase(city));
                                report_table.addCell(table_cell);
                                String state_province=query_set.getString("state_province");
                                table_cell=new PdfPCell(new Phrase(state_province));
                                report_table.addCell(table_cell);
                                String country_id=query_set.getString("country_id");
                                table_cell=new PdfPCell(new Phrase(country_id));
                                report_table.addCell(table_cell);
                                }

                pdf_report.add(report_table);                       
                pdf_report.close();
        }
        catch(Exception e)
        {
            System.out.println("Error : "+e.getMessage());
        }
        finally
        {
            try
            {
                query_set.close();
            }
            catch(Exception e){}
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

    public static void exportRegion() throws Exception{
   
                Connection conn = database.getConnection();
                Statement stmt = conn.createStatement();
                ResultSet query_set = stmt.executeQuery("SELECT * FROM regions");
                Document pdf_report = new Document();
                PdfWriter.getInstance(pdf_report, new FileOutputStream("reportRegions.pdf"));
                pdf_report.open();            

                PdfPTable report_table = new PdfPTable(2);

                PdfPCell table_cell;
               
                while (query_set.next()) {                
                                String region_id=query_set.getString("region_id");
                                table_cell=new PdfPCell(new Phrase(region_id));
                                report_table.addCell(table_cell);
                                String region_name=query_set.getString("region_name");
                                table_cell=new PdfPCell(new Phrase(region_name));
                                report_table.addCell(table_cell);
                                }

                pdf_report.add(report_table);                       
                pdf_report.close();
                

                query_set.close();
                stmt.close(); 
                conn.close();               
                
    }
}
