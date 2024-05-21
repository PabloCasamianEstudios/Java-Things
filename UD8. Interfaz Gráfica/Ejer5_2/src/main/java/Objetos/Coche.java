/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

/**
 *
 * @author Alumno
 */
public abstract class Coche {
    
    //Atributos del coche.
    protected String marca;
    protected String modelo;
    protected double precioAntesImpuestos; 
    protected boolean enVenta = true; 
    
    //Impuesto
    protected double iva = 0.21;

    //Constructor del coche.
    public Coche(String marca, String modelo, double precioAntesImpuestos) {
        this.marca = marca;
        this.modelo = modelo;
        this.precioAntesImpuestos = precioAntesImpuestos;
    }
    
    //Getters and setters del coche.

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPrecioAntesImpuestos() {
        return precioAntesImpuestos;
    }

    public void setPrecioAntesImpuestos(double precioAntesImpuestos) {
        this.precioAntesImpuestos = precioAntesImpuestos;
    }

    public boolean isEnVenta() {
        return enVenta;
    }

    public void setEnVenta(boolean enVenta) {
        this.enVenta = enVenta;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva / 100;
    }
    
    
    //Métodos del coche:
    
    //Calcular el precio con Iva
    public abstract double calcularPrecioFinal();
    

    @Override
    public String toString() {
        return "Coche{" + "marca=" + marca + ", modelo=" + modelo + ", precioAntesImpuestos=" + precioAntesImpuestos + ", enVenta=" + enVenta + ", iva=" + iva + '}';
    }
    
    
    
    
}
