/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objects;

/**
 *
 * @author pablo
 */
public abstract class Item {

    protected static int incremental = 0;
    protected int cod;
    protected String name;
    protected int usos;

    //constructor
    public Item(String name, int usos) {
        this.name = name;
        incremental++;
        cod = incremental;
        this.usos = usos;
    }

    public static int getIncremental() {
        return incremental;
    }

    public static void setIncremental(int incremental) {
        Item.incremental = incremental;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getUsos() {
        return usos;
    }

    public void setUsos(int usos) {
        this.usos = usos;
    }

    @Override
    public String toString() {
        return "Item{" + "cod=" + cod + ", name=" + name + ", usos=" + usos + '}';
    }

    
    
}
