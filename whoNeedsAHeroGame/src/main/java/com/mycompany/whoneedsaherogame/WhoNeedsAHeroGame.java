/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.whoneedsaherogame;

/**
 *
 * @author Ying
 */
import Objects.CharacterGame;
import Objects.Player;
import Objects.Enemy;
import java.util.Scanner;

public class WhoNeedsAHeroGame {

    public static Scanner teclado = new Scanner(System.in);

    public static void bar() {
        System.out.println("----------------------------------------");
    }

    public static int menu() {
        bar();
        System.out.println("Seleccione una opción:");
        bar();
        System.out.println("0) Salir del juego");
        System.out.println("1) Comenzar partida");
        bar();
        int opcion = teclado.nextInt();
        return opcion;
    }

    public static void main(String[] args) {

        do {
            switch (menu()) {
                case 0:
                    System.out.println("Fin.");
                    break;
                case 1:
                    System.out.println("Para comenzar con tu aventura\n ingrese el nombre de su personaje");
                    bar();
                    String name = teclado.next();
                    Player p = new Player(name, 10, 100);
                    
                    
                    Enemy rata = new Enemy("rata",10,10);
                    
                    p.golpe(rata);
                    System.out.println("Reventaste a la rata1");
                    
                    break;
                default:
                    System.out.println("Ingrese otro caracter");
            }
        } while (menu() != 0);

    }
}
