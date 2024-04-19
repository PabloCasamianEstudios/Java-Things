/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.mypokedex;

import java.util.Scanner;
import objetos.User;

/**
 *
 * @author Alumno
 */
public class MyPokedex {

    private static Scanner teclado = new Scanner(System.in);

   

    public static int menu() {

        System.out.println("-------------------------");
        System.out.println("-Seleccione una opción: -");
        System.out.println("                        -");
        System.out.println("-0) Cerrar Pokedex      -");
        System.out.println("-1) Añadir Pokemon      -");
        System.out.println("-2) Modificar Pokemo    -");
        System.out.println("-3) Consultar 1 Pokemon -");
        System.out.println("-4) Consultar todos     -");
        System.out.println("-------------------------");

        return teclado.nextInt();
    }

    public static void main(String[] args) {

        
        boolean terminar = false;
        do{
           switch(menu()){
               case 0:
                   break;
               case 1:
                   break;
               case 2:
                   break;
               case 3:
                   break;
               case 4:
                   break;
                   
               default:
           }
            
        }while(terminar == false);
        
        
    }
}
