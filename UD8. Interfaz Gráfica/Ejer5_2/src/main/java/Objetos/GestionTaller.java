/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

import Interfaz.VentanaPrincipal;
import java.util.ArrayList;
import java.util.*;

/**
 *
 * @author Alumno
 */
public class GestionTaller {

    //Atributos del taller.
    //Coches. Todos los que pueda haber.
    protected ArrayList<Coche> coches = new ArrayList();

    //Los coches que se encuentran dentro del confesionario, con un espacio finito.
    protected Coche[] confesionario;

    protected TreeMap<Coche, Venta> ventas = new TreeMap();

    //Ventana en la que interactua.
    VentanaPrincipal ven;
    
    //Constructor.
    public GestionTaller(int huecos, VentanaPrincipal ven) {
        this.confesionario = new Coche[huecos];
        this.ven = ven;

    }

    //getters and setters.
    public ArrayList<Coche> getCoches() {
        return coches;
    }

    public void setCoches(ArrayList<Coche> coches) {
        this.coches = coches;
    }

    public TreeMap<Coche, Venta> getVentas() {
        return ventas;
    }

    public void setVentas(TreeMap<Coche, Venta> ventas) {
        this.ventas = ventas;
    }

    //Métodos del gestor del taller
    //Vender coche. (A)
    public boolean venderCoche(Coche c) {
        
        for (Coche coche : confesionario) {
            if (coche.equals(c) && c.isEnVenta() == true) {

                Venta v = new Venta(c, c.getIva(), c.calcularPrecioFinal());
                ventas.put(c, v);
                return true;
            }
        }
        return false;
    }

    //Dar de baja un coche. (B)
    public boolean darBajaCoche(Coche c) {
        int cochesDeEsaMarca = 0;

        for (Coche coche : confesionario) {
            if (coche.equals(c)) {
                coche.setEnVenta(false);
                cochesDeEsaMarca++;
            }
        }
        if (cochesDeEsaMarca > 0) {
            return true;
        }
        return false;
    }

    //Comprar coche. (C)
    public boolean comprarCoche(Coche c) {
        System.out.println(confesionario.length);
        for (int i = 0; i < confesionario.length; i++) {
            if (confesionario[i] == null) {
                confesionario[i] = c;
                coches.add(c);
                ven.añadirATabla(c);
                
                return true;
            }
        }
        return false;
    }

    //Mostrar coches no importados. (D)
    public boolean mostrarCochesNoImportados(){
        ArrayList<Coche> noImportados = new ArrayList();

        for (Coche coche : confesionario ) {
            if(coche instanceof CocheNacional && coche.isEnVenta()){
                noImportados.add(coche);                
            }
        }       
        if(noImportados.size() > 0){
           return true; 
        }
        return false;
    }
    
    //Mostrar coches importados. (E)
    public boolean mostrarCochesImportados(){
        ArrayList<Coche> Importados = new ArrayList();

        for (Coche coche : confesionario) {
            if(coche instanceof CocheImportado && coche.isEnVenta()){
                Importados.add(coche);                
            }
        }       
        if(Importados.size() > 0){
           return true; 
        }
        return false;
    }
    
    //Mostrar ventas. (F) --> Al ser en interfaz no hace falta que salgan en consola(?
    public TreeMap mostrarVentas(){
        return ventas;
    }
    
    //Cambiar IVA. (G)  IDEA --> el iva esté en GestionTaller y los coches tengan un atributo "GestionTaleler"
    
    public boolean cambiarIVA(double iva){
        if(iva < 0 || iva > 100){
            return false;       
        }
        
        return true;
    }
    
    //Salir. (H)
    
    public void salir(){
        ven.salir();
    }
    
}
