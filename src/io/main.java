/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io;

import io.services.navigation;
import java.awt.EventQueue;

/**
 *
 * @author AlexanderMS
 */
public class main {
    public static void main(String[] args){ 
        EventQueue.invokeLater(() -> navigation.showLogin(null));
    }
}
