/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

/**
 *
 * @author Alumno
 */
public class CocheNacional extends Coche{

    //constructor
    public CocheNacional(String marca, String modelo, double precioAntesImpuestos) {
        super(marca, modelo, precioAntesImpuestos);
    }

    //getters and setters
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
    
    //Método ABTRACTO
    
     public double calcularPrecioFinal() {
        return precioAntesImpuestos + precioAntesImpuestos*iva;
    }
    
    
}
