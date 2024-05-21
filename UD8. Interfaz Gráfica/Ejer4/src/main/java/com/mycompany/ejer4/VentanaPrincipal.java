/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejer4;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author Alumno
 */
public class VentanaPrincipal{
    
    
     //Montando ventanas.
    private FramePer ventanaPrincipal = new FramePer(200, 200, "CONVERSOR", true);

    //Montando paneles.
    private PanelPer panelPrincipal = new PanelPer(0);

    private PanelPer panelSup = new PanelPer(0); //1 decidí que sea BorderLayout()
    private PanelPer panelMid = new PanelPer(0);
    private PanelPer panelInf = new PanelPer(0);

     //Montando botones.
    private JButton bRojo = new JButton("Rojo");
    private JButton bAzul = new JButton("Azul");
    private JButton bAmarillo = new JButton("Amarillo");
    private JButton bVerde = new JButton("Verde");

    //Montando etiquetas.
    
    private static JLabel etiqueta = new JLabel("Haz Click en algún botón");
    
    //Contadores.
    
    private int rojo = 0;
    private int azul = 0;
    private int amarillo = 0;
    private int verde = 0;
    
    //Montar ActionListener.
    
     //Creando los actionListener
    ActionListener colorRojo = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {

            //ventanaPrincipal.getContentPane().setBackground(Color.RED);
            
            
            panelPrincipal.setBackground(Color.red);
            panelSup.setBackground(Color.red);
            panelMid.setBackground(Color.red);
            panelInf.setBackground(Color.red);
            rojo++;
            
              if(rojo >= 20){
                ventanaPrincipal.dispose(); //lo cierra
            }
            
            etiqueta.setText("Rojo");
            
        }

    };
    
    ActionListener colorAzul = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {

            //ventanaPrincipal.getContentPane().setBackground(Color.RED);
            
            
            panelPrincipal.setBackground(Color.blue);
            panelSup.setBackground(Color.blue);
            panelMid.setBackground(Color.blue);
            panelInf.setBackground(Color.blue);
            azul++;
            
            
              if(azul >= 20){
                ventanaPrincipal.dispose(); //lo cierra
            }
            
            etiqueta.setText("Azul");
            
        }

    };
    
       ActionListener colorVerde = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {

            //ventanaPrincipal.getContentPane().setBackground(Color.RED);
            
            
            panelPrincipal.setBackground(Color.green);
            panelSup.setBackground(Color.green);
            panelMid.setBackground(Color.green);
            panelInf.setBackground(Color.green);
            verde++;
            
              if(verde >= 20){
                ventanaPrincipal.dispose(); //lo cierra
            }
            
            etiqueta.setText("Verde");
            
        }

    };
    
        ActionListener colorAmarillo = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {

            //ventanaPrincipal.getContentPane().setBackground(Color.RED);
            
            
            panelPrincipal.setBackground(Color.yellow);
            panelSup.setBackground(Color.yellow);
            panelMid.setBackground(Color.yellow);
            panelInf.setBackground(Color.yellow);
            amarillo++;
            
            if(amarillo >= 20){
                ventanaPrincipal.dispose(); //lo cierra
            }
            
            etiqueta.setText("Amarillo");
            
        }

    };  
       
    //constructor de la ventana principal
    public VentanaPrincipal(){
        
        montarVentana();
        ventanaPrincipal.setVisible(true);
        
        
        bRojo.addActionListener(colorRojo);
        bAzul.addActionListener(colorAzul);
        bAmarillo.addActionListener(colorAmarillo);
        bVerde.addActionListener(colorVerde);
        
    }
    
    public void montarVentana(){
        montarSup();
        montarMid();
        montarInf();
        
        panelPrincipal.add(panelSup);
        panelPrincipal.add(panelMid);
        panelPrincipal.add(panelInf);
        
        ventanaPrincipal.add(panelPrincipal);
        
    }
    
    public void montarSup(){
        panelSup.add(etiqueta);
    }
    public void montarMid(){
        panelMid.add(bRojo);
        panelMid.add(bAmarillo);
    }
    public void montarInf(){
        panelInf.add(bAzul);
        panelInf.add(bVerde);
    }
    
    
    
     public void acciones(ActionEvent e) {
        Object obj = e.getSource(); //nos permite saber que objeto generó el evento
        
        
        if (obj == bRojo) {
            
            etiqueta.setText("Rojo");
        }
        if (obj == bAzul) {
            etiqueta.setText("Azul");
        }
        if (obj == bVerde) {
            etiqueta.setText("Verde");
        }
        if (obj == bAmarillo) {
            etiqueta.setText("Amarillo");
        }
    }
    
}