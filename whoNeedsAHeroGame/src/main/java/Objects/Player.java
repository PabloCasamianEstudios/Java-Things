/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objects;

/**
 *
 * @author Ying
 */
public class Player extends CharacterGame {

    Item[] inventory = new Item[5];
    Weapon principal;
    protected int oro = 0;
    
    //constructor
    public Player(String name, int damage, int heal) {
        super(name, damage, heal);
    }
    //getters and setters

    public Item[] getInventory() {
        return inventory;
    }

    public void setInventory(Item[] inventory) {
        this.inventory = inventory;
    }

    public Weapon getPrincipal() {
        return principal;
    }

    public void setPrincipal(Weapon principal) {
        this.principal = principal;
    }

    public int getOro() {
        return oro;
    }

    public void setOro(int oro) {
        this.oro = oro;
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
    
    //métodos
    
    public boolean golpe(Enemy e){//si es true golpeamos al enemigo, si es falso recibimos nosotros.
    if(this.damage >= e.getDamage()){
        return true;
    } else{
        return false;
    }
}
    
    
    
    
}
