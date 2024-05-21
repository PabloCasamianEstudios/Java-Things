/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejer5_2;

import Interfaz.*;
import Objetos.*;

/**
 *
 * @author Alumno
 */
public class Ejer5_2 {

    public static void main(String[] args) {
        
       
        VentanaPrincipal v = new VentanaPrincipal();
         GestionTaller g = new GestionTaller(10, v);
         
         Coche c1 = new CocheNacional("Seat Panda","Seat Panda", 15000);
         Coche c2 = new CocheImportado("Ferrari T-R","Ferrari T-R",65000, 8000);
         Coche c3 = new CocheNacional("Seat Toledo","Seat Toledo", 21000);
         Coche c4 = new CocheImportado("Jaguar XK","Jaguar XK", 41000, 6000);
         Coche c5 = new CocheImportado("Porche GT3","Porche GT3", 44000, 7000);
         g.comprarCoche(c1);
         g.comprarCoche(c2);
         g.comprarCoche(c3);
         g.comprarCoche(c4);
         g.comprarCoche(c5);

        
    }
}
