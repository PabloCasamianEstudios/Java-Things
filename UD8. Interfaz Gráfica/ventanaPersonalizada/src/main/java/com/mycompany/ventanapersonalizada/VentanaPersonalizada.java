/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ventanapersonalizada;

import javax.swing.JButton;

/**
 *
 * @author pablo
 */
public class VentanaPersonalizada {

    public static void main(String[] args) {

        FramePer marco = new FramePer(1280, 720, "Prueba ventana", true);

        PanelPer panel = new PanelPer(PanelPer.FLOWLAYOUT);

        JButton boton = new JButton("Esto es un botón");

        panel.add(boton);

        marco.add(panel);

        marco.setVisible(true);

    }
}
