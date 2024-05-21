/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pruebacambiocolor;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Alumno
 */
public class PruebaCambioColor {

    
    private static JLabel label = new JLabel("--");
    private static JButton red = new JButton("Red");

    
    private static JButton blue = new JButton("Blue");
    private static JButton green = new JButton("Green");
    private static JButton yellow = new JButton("Yellow");
    
    
      public static void acciones(ActionEvent e) {
        Object obj = e.getSource(); //nos permite saber que objeto generó el evento
        
        
        if (obj == red) {
            
            label.setText("Red");
        }
        if (obj == blue) {
            label.setText("Blue");
        }
        if (obj == green) {
            label.setText("Green");
        }
        if (obj == yellow) {
            label.setText("Yellow");
        }
    }
    
    
    public static void main(String[] args) {
        
        
         JFrame frame = new JFrame("Cambiar color fondo");
         
        
        red.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.getContentPane().setBackground(Color.RED);
                acciones(e);
            }
        });
        
        blue.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.getContentPane().setBackground(Color.BLUE);
                acciones(e);
            }
        });
        green.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.getContentPane().setBackground(Color.GREEN);
                acciones(e);
            }
        });
        
        yellow.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.getContentPane().setBackground(Color.YELLOW);
                acciones(e);
            }
        });
        
        
         //JPanel panel1 = new JPanel(new FlowLayout());
         JPanel panel2 = new JPanel(new FlowLayout());
         JPanel panel3 = new JPanel(new FlowLayout());
         
         //panel1.add(label);
         
         panel2.add(red);
         panel2.add(yellow);
         
         panel3.add(blue);
         panel3.add(green);
         
        //frame.add(panel1);
          frame.add(label);
        frame.add(panel2);
        frame.add(panel3);
        
      
        /*frame.add(red);
        frame.add(blue);
        frame.add(green);
        frame.add(yellow);*/
        
           //indicar que acemos al cerrar la ventana (en este caso se cierra con código 0, todo correcto)
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        
        frame.setLayout(new GridLayout(0, 1));
        
        frame.pack();      
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
