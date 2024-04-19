/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetos;

import java.util.Comparator;
import java.util.TreeMap;

/**
 *
 * @author Alumno
 */
public class Pokedex {
    //DE MOMENTO, POKEDEX GLOBAL
    
    protected int id;
    protected String nombre;
    
    static Comparator compIdPokemon = new ComparatorPokemonId();
    protected TreeMap <Integer, Pokemon> pokemones = new TreeMap(compIdPokemon);

    public Pokedex(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
    
    
}
