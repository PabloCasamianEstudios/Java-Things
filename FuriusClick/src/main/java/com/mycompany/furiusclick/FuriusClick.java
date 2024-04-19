/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.furiusclick;

import java.awt.*;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author pablo
 */
public class FuriusClick {

    //Creando el marco principal
    private FramePer ventanaPrincipal = new FramePer(300, 300, "FuriusClick", true);

    //Creando el panel principal
    private PanelPer panelPrincipal = new PanelPer(PanelPer.BORDERLAYOUT);
    private PanelPer panelInferior = new PanelPer(PanelPer.FLOWLAYOUT);
    private PanelPer panelSuperior = new PanelPer(PanelPer.FLOWLAYOUT);

    //Creando etiquetas y botón
    private JButton boton = new JButton("Empezar");
    private JLabel etiqClicks = new JLabel("0");
    private JLabel etiqSegs = new JLabel("10");

    //Crenado contadores de clicks y de segundos
    private int clicks = 0;
    private int segs = 10;

    //Creando un Thread
    private Thread hiloJuego;

    //Creando los actionListener
    ActionListener comienzo = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {

            boton.setText("CLICK!");

            boton.removeActionListener(comienzo);

            hiloJuego = new Thread(new LogicaJuego());
            hiloJuego.start();

            boton.addActionListener(jugando);

        }

    };

    ActionListener jugando = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {

            clicks++;
            etiqClicks.setText(String.valueOf(clicks));

        }

    };

    public FuriusClick() {

        montandoPanelSuperior();
        montandoPanelInferior();
        montandoFrame();

        boton.addActionListener(comienzo);

    }

    private void montandoPanelSuperior() {

        etiqClicks.setFont(new Font("Arial", Font.BOLD, 90));
        panelSuperior.add(etiqClicks);
        panelPrincipal.add(panelSuperior, BorderLayout.NORTH);
    }

    private void montandoPanelInferior() {

        panelInferior.add(boton);
        panelInferior.add(etiqSegs);
        panelPrincipal.add(panelInferior, BorderLayout.SOUTH);

    }

    private void montandoFrame() {

        ventanaPrincipal.add(panelPrincipal);
        ventanaPrincipal.setVisible(true);

    }

    public void finalizarJuego() {

        boton.setEnabled(false);

        hiloJuego.interrupt();

        ventanaPuntuacion();

        boton.removeActionListener(jugando);
        boton.addActionListener(comienzo);

        boton.setText("Comenzar");
        etiqClicks.setText("0");
        etiqSegs.setText("10");

        segs = 10;
        clicks = 0;

        boton.setEnabled(true);

    }

    private void ventanaPuntuacion() {

        JDialog venPuntuacion = new JDialog(ventanaPrincipal, "Puntuación", true);//true -> modal (no se puede clickar en lo que hay detrás)
        venPuntuacion.setSize(400, 100);
        venPuntuacion.setLocationRelativeTo(null);

        JPanel panel = new JPanel(new FlowLayout());

        StringBuilder sb = new StringBuilder("Has conseguido " + clicks + " clicks.");

        if (clicks < 50) {
            sb.append(" Menudo inútil.");
        } else if (clicks < 100) {
            sb.append(" Eres la definición de meh.");
        } else {
            sb.append(" Lo hiciste bien.");
        }

        JLabel etiqueta = new JLabel(sb.toString());

        panel.add(etiqueta);
        venPuntuacion.add(panel);

        venPuntuacion.setVisible(true);
    }

    private class LogicaJuego implements Runnable {

        @Override
        public void run() {

            while (segs > 0) {

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
                segs--;
                etiqSegs.setText(String.valueOf(segs));

            }
            finalizarJuego();

        }

    }

    public static void main(String[] args) {

        FuriusClick juego = new FuriusClick();

    }

}
