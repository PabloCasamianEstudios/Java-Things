/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ejer3;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Alumno
 */
public class Ejer3 {

    //Montando ventanas.
    private static FramePer ventanaPrincipal = new FramePer(200, 200, "CONVERSOR", true);

    //Montando paneles.
    private static PanelPer panelPrincipal = new PanelPer(0);

    private static PanelPer panelSup = new PanelPer(0); //1 decidí que sea BorderLayout()
    private static PanelPer panelMid = new PanelPer(0);
    private static PanelPer panelInf = new PanelPer(0);

    //Montando botones.
    private static JButton bEuros = new JButton("Euros");
    private static JButton bDolares = new JButton("Dólares");

    //Montando etiquetas.
    private static JLabel etiqTotal = new JLabel("Total ");
    private static JLabel etiqCantidad = new JLabel("Cantidad: ");

    private static double total = 0;
    private static double cantidad = 0;

    //Montando área para insertar texto
    private static JTextArea areaCantidad = new JTextArea();

    //Action Listener 
    //montar frame
    public static void montarVentana() {

        montarSup();
        montarMid();
        montarInf();
        panelPrincipal.add(panelSup);
        panelPrincipal.add(panelMid);
        panelPrincipal.add(panelInf);

        ventanaPrincipal.add(panelPrincipal);

    }

    private static void montarSup() {
        panelSup.add(etiqCantidad);
        panelSup.add(areaCantidad);
    }

    private static void montarMid() {
        panelMid.add(bEuros);
        panelMid.add(bDolares);
    }

    private static void montarInf() {
        panelInf.add(etiqTotal);
    }

    //las acciones
    public static void acciones(ActionEvent e) {
        Object obj = e.getSource(); //nos permite saber que objeto generó el evento
        if (obj == bEuros) {
            total = 0;
            
            total = Double.parseDouble((areaCantidad.getText()));
            total = total*0.8;
            etiqTotal.setText("Total: " + total);//poner texto en etiqueta
        }
        if (obj == bDolares) {
            total = Double.parseDouble((areaCantidad.getText()));
            total = total/0.8;
            etiqTotal.setText("Total: " + total);//poner texto en etiqueta

        }
    }
    
   /* public static boolean soloNums(String str){

        
        
        int[] nums = {0,1,2,3,4,5,6,7,8,9};
        for (int i = 0; i < str.length(); i++) {
            
            for (int j = 0; j < 10; j++) {
                
            
            
            }
        }
        return true;
    }*/

    //main
    public static void main(String[] args) {

        montarVentana();
        ventanaPrincipal.setVisible(true);

        //le da una utilidad al botón limpiar
        bEuros.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                acciones(e);
            }
        });
        //le da una utilidad al botón escribir
        bDolares.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                acciones(e);
            }
        });

    }

}
