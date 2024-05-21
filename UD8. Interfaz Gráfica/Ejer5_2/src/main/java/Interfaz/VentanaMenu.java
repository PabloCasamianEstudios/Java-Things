/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaz;

import java.awt.GridLayout;
import javax.swing.JButton;

/**
 *
 * @author Alumno
 * @version 1
 */
public class VentanaMenu {
    
    //Creando el marco principal.
    private FramePer ventanaPrincipal = new FramePer(300, 300, "MENÚ DE OPCIONES DEL CONCESIONARIO", true);

    //Creando el panel principal.
    private PanelPer panelPrincipal = new PanelPer(2); //<- 2 = GridLayout
    
    //subpaneles (8)

    //botones del menú. (A,B,C,D,E,F,G,H)
    private JButton botonA = new JButton("a)Vender un coche.");
    private JButton botonB = new JButton("b)Dar de baja un coche.");
    private JButton botonC = new JButton("c)Comprar un coche.");
    private JButton botonD = new JButton("d)Mostrar coches no importados.");
    private JButton botonE = new JButton("e)Mostrar coches importados.");
    private JButton botonF = new JButton("f)Mostrar ventas.");
    private JButton botonG = new JButton("g)Cambiar IVA.");
    private JButton botonH = new JButton("h)Salir.");
       
    //constructor
    public VentanaMenu() {
        
        GridLayout g = new GridLayout(0,1);   
        panelPrincipal.setLayout(g);
        
        montarVentana();
        
        this.ventanaPrincipal.setVisible(true);
    }
    
    //Montar la ventana del menú.
    public void montarVentana(){
        panelPrincipal.add(botonA);
        panelPrincipal.add(botonB);
        panelPrincipal.add(botonC);
        panelPrincipal.add(botonD);
        panelPrincipal.add(botonE);
        panelPrincipal.add(botonF);
        panelPrincipal.add(botonG);
        panelPrincipal.add(botonH);
        
        ventanaPrincipal.add(panelPrincipal);
    }
    

}
