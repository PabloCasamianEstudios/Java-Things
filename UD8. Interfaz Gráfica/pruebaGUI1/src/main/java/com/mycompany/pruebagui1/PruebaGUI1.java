/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.pruebagui1;

import java.awt.*;
import javax.swing.*;

public class PruebaGUI1 {

    public static void main(String[] args) {

        //JFrame: implementa una ventana. Las ventanas principales de una aplicación. -- Se muestra en la barra de abajo
        //JDialog: Ventana de tipo diálogo. Ventanas secundarias y generalmente llamadas por ventanas padre de tipo JFrame. -- NO se muestra en la barra de abajo
        //JApplet: Es una aplicación Java que se ejecuta dentro de un navegador web en la maquina del cliente.
        JFrame frame = new JFrame("Ventana Hola Mundo"); //nombre de la ventana
        
        JPanel panel = new JPanel(new FlowLayout());
        

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); //al cerra la ventana se cierra la aplicación

        JLabel label1 = new JLabel("Etiqueta 1"); //componente de tipo Label (etiqueta -> no editable)
        
        //sin el flowlayout una revienta a la otra
        JLabel label2 = new JLabel("Etiqueta 2");
        JLabel label3 = new JLabel("Etiqueta 3");
        
        panel.add(label1);
        panel.add(label2);
        panel.add(label3);
        
        panel.add(new JButton("PULSA AQUÍ"));//añadí un botón
        
        frame.add(panel);
        
        //frame.add(label1); //lo añade al frame

        
        
        //frame.pack(); //Se hace del tamaño justo para mostrar lo que hay dentro. TAMBIÉN SE PUEDE HACER "setSize" o "setBounds"
        frame.setSize(1280, 720);
        //frame.setBounds(100, 100, 1280, 720);
        
        frame.setLocationRelativeTo(null); //abre la ventana en el centro de la pantalla (si no se pone se abre en la esquina superior izquierda)
        frame.setVisible(true); //que sea visible !!!!  --> otra forma -> frame.show(true)
        //frame.show(true);
        
        
        /*
        -----------------------------------
        COMPONENTES MÁS HABITUALES:
        -----------------------------------
        JButton: botón
        
        JLabel: etiqueta texto estandar
        
        JTextField: cuadro texto
        
        JTextArea: cuadro texto multilínea
        
        JCheckBox: casilla verificación
        
        JRadioButton: botón de opción
        
        JComboBox: lista desplegable
        
        JScrollBar: barra desplazamiento
        
        -----------------------------------
        CONTENEDORES INTERMEDIOS: (SI ALGO NO ESTÁ DENTRO DE UN PANEL SE PONE ENCIMA DEL RESTO)
        -----------------------------------
        JPanel: es un contenedor intermedio (para meter dentro de un JFrame y luego meter dentro cosas)
        
        -----------------------------------
        ORGANIZAR COMPONENTES:
        -----------------------------------
        *Layout Manager*
        
        FlowLayout: valor por defecto (de izqui a dere)
        BorderLayout: norte, sur, este, oeste y centro
        CardLayout:
        GridLayout: divide en filas y columnas
        GridBagLayout:
        BoxLayout:
        
        
        
        PARA CAMBIAR EL LAYOUT MANAGER:
        
        (1)
        JPanel panel = new JPanel(new FlowLayout());
        
        (2)
        panel.setLayout(new FlowLayout());
        */
        
    }
}
