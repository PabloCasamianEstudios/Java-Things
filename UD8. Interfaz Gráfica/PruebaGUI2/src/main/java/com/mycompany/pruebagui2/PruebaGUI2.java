/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.pruebagui2;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

/**
 *
 * @author Alumno
 */
public class PruebaGUI2 {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Ventana Hola Mundo");
        JPanel panel = new JPanel(new BorderLayout());

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); //al cerra la ventana se cierra la aplicación

        JLabel label1 = new JLabel("Etiqueta 1");
        JLabel label2 = new JLabel("Etiqueta 2");
        JLabel label3 = new JLabel("Etiqueta 3");
        JLabel label4 = new JLabel("Etiqueta 4");

        panel.add("South", label1);
        panel.add("North", label2);
        panel.add("East", label3);
        
        frame.add(panel);
        
        frame.add(label4);
        frame.pack();
        
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}

/*
LISTENERS -> EVENTOS EN JAVA  (import java.awt.event)
-----------------------------------------------

-ActionListener (JButton, JTextField, JComboBox...) click, pulsar tecla...  ------>  EL MVP!!!!!
-AdjustmentListener (JScrollBar...) ajustar
-FocusListener(JButton, JTextFueld, JComboBox...) cuando pasa a estar activo, o pasa a estar inactivo
-ItemListener(JCheckBox...) seleccionar o deseleccionar una opcion
-KeyListener(JTextField, JTextArea...) pulsar una tecla cuando el componente tiene el foco
-MouseListener(multiples componentes) Acciones como pulsar botón del ratón
-MouseMotionListener(multiples componentes) Acciones como arrastrar o pasar por encima del objeto
-WindowListener(JFrame) acciones relativas a la ventana, como por ejemplo cerrarla

-----------------------------------------------



*/