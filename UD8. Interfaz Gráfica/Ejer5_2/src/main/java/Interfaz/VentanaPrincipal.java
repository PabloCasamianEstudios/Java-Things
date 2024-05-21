/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaz;

import Objetos.*;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Alumno
 */
public class VentanaPrincipal extends JFrame {

    //Creando el marco principal.
    private FramePer ventanaPrincipal = new FramePer(300, 300, "CONCESIONARIO COCHES", true);

    //Creando el panel principal.
    private PanelPer panelPrincipal = new PanelPer(1);

    private PanelPer panelInferior = new PanelPer(0); //donde irá la tabla
    private PanelPer panelSuperior = new PanelPer(0); // botón menú

    //Tabla de coches.
    private JTable tabla;
    private DefaultTableModel modeloTabla;
    private JScrollPane panelTabla; //para Scrollear si hay varios

    //Botón del menú.
    private JButton bMenu = new JButton("Menú");

    //ActionListener
    ActionListener menu = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            /*
            OBJETIVO: que solo puedas tener una abierta.
            */
            VentanaMenu vM = new VentanaMenu();
            
        }

    };
    
    //Constructor de la ventana.
    public VentanaPrincipal() {
        modeloTabla = new DefaultTableModel();
        tabla = new JTable(modeloTabla);
        panelTabla = new JScrollPane();
        
        bMenu.addActionListener(menu);
        
        montarVentana();

        ventanaPrincipal.setVisible(true);

    }

    //Montar la ventana.
    private void montarVentana() {
        montarTabla();
        panelSuperior.add(tabla);
        panelInferior.add(bMenu);

        panelPrincipal.add(panelSuperior, BorderLayout.CENTER);
        panelPrincipal.add(panelInferior, BorderLayout.SOUTH);

        ventanaPrincipal.add(panelPrincipal);
    }

    //Montar Tabla.
    private void montarTabla() {
        modeloTabla.addColumn("Modelo");
        modeloTabla.addColumn("Precio");
        modeloTabla.addColumn("Impuesto Homologación");

        /*Object[] registro = {"Seat Panda", 15000};
        modeloTabla.addRow(registro);*/
    }

    //Añadir a la tabla.
    public void añadirATabla(Coche c) {

        if (c instanceof CocheImportado) {
            Object[] registro = {c.getModelo(), c.calcularPrecioFinal(), ((CocheImportado) c).getImpuestoHomologacion()};
            modeloTabla.addRow(registro);
        } else {
            Object[] registro = {c.getModelo(), c.calcularPrecioFinal()};
            modeloTabla.addRow(registro);
        }
        
    }
    
    //Salir.
    public void salir(){
        ventanaPrincipal.dispose();
    }
    
}

