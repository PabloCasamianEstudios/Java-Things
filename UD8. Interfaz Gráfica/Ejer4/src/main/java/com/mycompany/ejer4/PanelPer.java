/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejer4;

import java.awt.*;
import javax.swing.JPanel;

/**
 *
 * @author pablo
 */
public class PanelPer extends JPanel {
    
    public static final int FLOWLAYOUT = 0; //es el predefinido de JPanel
    public static final int BORDERLAYOUT = 1;
    public static final int GRIDLAYOUT = 2;
    
    public PanelPer(int layoutPorDefecto){
       
        if(layoutPorDefecto == 1) setLayout(new BorderLayout());
        if(layoutPorDefecto == 2) setLayout(new GridLayout());
    }
    
    
}
