/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaz;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JRadioButton;

/**
 *
 * @author Alumno
 */
public class VentanaPrincipal {
   
    //Montar ventanas.
    private FramePer ventanaPrincipal = new FramePer(300,300,"Coches",true);
    
    //Montar paneles.
    private PanelPer panelPrincipal = new PanelPer(0);
    
    private PanelPer panelInf = new PanelPer(0);
    private PanelPer panelMid = new PanelPer(0);
    private PanelPer panelSup = new PanelPer(0);
    
    //Botón JRadioButton
    private JRadioButton rBoton = new JRadioButton("a");
    private JRadioButton rBoton2 = new JRadioButton("b");
    
    //ActionListener
    
   
    //crear constructor
    public VentanaPrincipal(){
        
        panelPrincipal.add(rBoton);
        panelPrincipal.add(rBoton2);
        
        ventanaPrincipal.add(panelPrincipal);
        
        ventanaPrincipal.setVisible(true);           
    }
            
    
    
    
}
