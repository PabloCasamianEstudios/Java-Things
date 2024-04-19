/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetos;

import java.util.Comparator;

/**
 *
 * @author Alumno
 */
public class ComparatorPokemonId implements Comparator<Integer>{

    @Override
    public int compare(Integer num1, Integer num2) {
        if(num1 < num2){
            return 1;
        }else if(num1 > num2){
            return -1;
        } else{
            return 0;
        }
        
    }
    
}
