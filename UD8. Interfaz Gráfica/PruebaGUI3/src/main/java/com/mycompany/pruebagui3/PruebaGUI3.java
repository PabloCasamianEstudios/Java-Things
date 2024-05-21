/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.pruebagui3;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

/**
 *
 * @author Alumno
 */
public class PruebaGUI3 {
    
    private static JLabel label = new JLabel("--");
    private static JButton btnlimpia = new JButton("Limpia");
    private static JButton btnescribe = new JButton("escribe");
    
    public static void acciones(ActionEvent e) {
        Object obj = e.getSource(); //nos permite saber que objeto generó el evento
        if (obj == btnlimpia) {
            label.setText("");//poner texto en etiqueta
        }
        if (obj == btnescribe) {
            label.setText("Hola Mundo");
        }
    }
    
    //main
    public static void main(String[] args) {
        
        JFrame frame = new JFrame("Controlando eventos");

        //le da una utilidad al botón limpiar
        btnlimpia.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                acciones(e);
            }
        });
        //le da una utilidad al botón escribir
        btnescribe.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                acciones(e);
            }
        });
        
        frame.add(label);
        frame.add(btnlimpia);
        frame.add(btnescribe);
        
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


/*

heredar de JFrame para más custom, crear un constructor -> crear window desde main
CUANDO CREE UNA VENTANA:

public class NOMBRE_VENTANA extends JFrame implements WindowListener{



y this.add(WindowsListener();
}
-----------------------------------------

getContentPane() -> obtiene el panel raiz

setBackground(Color) -> para pintar 

setSize(alto, ancho) -> darle dimensión

add() -> añadir otros objetos al panel

-----------------------------------------
PONIENDO TEXTO: ETIQUETAS:
-----------------------------------------
-Objetos JLabel
-método setText("texto")
-las etiquetas son transparentes -> setOpaque()
-añadir this.pack()

-----------------------------------------
CERRAR PROGRAMA:
-----------------------------------------
-Definir tipo de operación asociada con el evento
-this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

-----------------------------------------
ADMINISTRAR DISEÑO. DESPLIGUES:
-----------------------------------------
Se crea un objeto layout:
-miDespliegue = new ObjetoLayout(param.)
Se asigna un contenedor:
-Contenedor.setLayout(miDespliegue);


-----------------------------------------
JRadio
-----------------------------------------
Definir:
JRadioButton rbtn1 = new JRadioButton)"txt1", true);
JRadioButton rbtn2 = new JRadioButton)"txt2", false);
JRadioButton rbtn3 = new JRadioButton)"txt3", false);

Creación grupo botones:
ButtonGroup grupo1 = new ButtonGroup();
grupo1.add(rbtn1);
grupo1.add(rbtn2);
grupo1.add(rbtn3);

-----------------------------------------

-----------------------------------------
*/