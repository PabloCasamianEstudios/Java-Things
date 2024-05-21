/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

/**
 *
 * @author Alumno
 */
public class Venta {
    
    //Atributos de la venta.
    protected Coche cocheVendido;
    protected double iva;
    protected double precioTotal;

    //Constructor de la venta.
    public Venta(Coche cocheVendido, double iva, double precioTotal) {
        this.cocheVendido = cocheVendido;
        this.iva = cocheVendido.getIva();
        this.precioTotal = cocheVendido.calcularPrecioFinal();
    }
    
    
    
}
