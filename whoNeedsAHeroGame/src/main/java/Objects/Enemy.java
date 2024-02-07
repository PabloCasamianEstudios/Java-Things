/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objects;

import java.util.ArrayList;

/**
 *
 * @author pablo
 */
public class Enemy extends NPC{

    //constructor
    public Enemy(String name, int damage, int heal) {
        super(name, damage, heal);
    }
    //getters and setters

    public ArrayList<String> getDialogos() {
        return dialogos;
    }

    public void setDialogos(ArrayList<String> dialogos) {
        this.dialogos = dialogos;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHeal() {
        return heal;
    }

    public void setHeal(int heal) {
        this.heal = heal;
    }
    
    
    
}
