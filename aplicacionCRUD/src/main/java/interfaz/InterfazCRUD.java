/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaz;

import java.awt.*;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author pablo
 */
public class InterfazCRUD extends JFrame {
    
    private JButton create, update, delete;
    private JPanel panelPrincipal, panelBotones;
    private JScrollPane panelTabla;
    
    
    private JTable tabla;
    private DefaultTableModel modeloTabla;
    
    public InterfazCRUD(){
        
        modeloTabla = new DefaultTableModel();
        tabla = new JTable(modeloTabla);
        
        panelTabla = new JScrollPane(tabla);
        panelBotones = new JPanel();
        panelPrincipal = new JPanel(new BorderLayout());
        
        create = new JButton("Agregar");
        update = new JButton("Actualizar");
        delete = new JButton("Borrar");
        
    }
    
    public void abrirCRUD(){
        
        montarInterfaz();
        setVisible(true);
        
    }

    private void montarInterfaz() {

        prepararTabla();
        
        //FALTA Agregar actionListener a los botones. (TAMBIÉN HAY QUE CONECTAR EL PROGRAMA A UNA BD)

        panelBotones.add(create);
        panelBotones.add(update);
        panelBotones.add(delete);
        
        panelPrincipal.add(panelTabla, BorderLayout.CENTER);
        panelPrincipal.add(panelBotones, BorderLayout.SOUTH);
        
        add(panelPrincipal);
        
        setSize(600,500);
        setTitle("Aplicación CRUD videojuegos");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
    }

    private void prepararTabla() {
        
        modeloTabla.addColumn("Nombre");
        modeloTabla.addColumn("Plataforma");
        modeloTabla.addColumn("Género");
        modeloTabla.addColumn("Año salida");
        modeloTabla.addColumn("Desarrollador/Publisher");
        modeloTabla.addColumn("Estado"); //refiriéndome a si lo he jugado, lo tengo pendiente, estoy en ello, o lo dejé a medias.
        modeloTabla.addColumn("Mi puntuación"); // si lo he jugado, le pondré puntuación
       
        
        //MUESTRA DE COMO FUNCIONARÁ CUANDO FUSQUE BIEN
        Object[] registro = {"Nombre del juego ejemplo", "Plataforma ejemplo", "Genero/generos", 2005, "Desarrollador", "COMPLETADO", 5};
        
        modeloTabla.addRow(registro);
        
    }
    
}
