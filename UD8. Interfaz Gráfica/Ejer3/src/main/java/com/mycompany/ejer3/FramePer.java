/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejer3;

import javax.swing.JFrame;

/**
 *
 * @author pablo
 */
public class FramePer extends JFrame{
    
    public FramePer(int ancho, int alto, String titulo, boolean esPrincipal){
        
        setSize(ancho,alto);
        setTitle(titulo);
        this.setLocationRelativeTo(null);
        
        if(esPrincipal) this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
}
