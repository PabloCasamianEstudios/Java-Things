/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objects;

import java.util.ArrayList;

/**
 *
 * @author Ying
 */
public class NPC  extends CharacterGame{

    protected ArrayList <String> dialogos; // quizá en un futuro lo pase como parámetro cuando estén todos done
    
    public NPC(String name, int damage, int heal) {
        super(name, damage, heal);
    }
    
    
}
