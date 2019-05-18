/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.services;

import io.databases.databaseJobs;
import io.frames.frameLogin;
import io.frames.frameMainMenu;
import io.frames.frameWelcome;
import io.table_models.tmJobs;
import javax.swing.JFrame;


/**
 *
 * @author AlexanderMS
 */
public class navigation {
   
    
    public static void showLogin(JFrame frame){
        if(frame != null){
            frame.dispose();
        }
        new frameLogin().setVisible(true);
    }
    public static void showMainMenu(JFrame frame){
        frame.dispose();
        new frameMainMenu().setVisible(true);
    }
    public static void showWelcome(JFrame frame){
        frame.dispose();
        new frameWelcome().setVisible(true);
    }
    
    
   
    
    
}
