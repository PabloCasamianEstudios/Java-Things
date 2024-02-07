/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objects;

/**
 *
 * @author pablo
 */
public abstract class Weapon{
    
    protected String name;
    protected int damage;
    
    //constructor
    public Weapon(String name, int damage) {
        this.name = name;
        this.damage = damage;
    }
    
    
    
}
