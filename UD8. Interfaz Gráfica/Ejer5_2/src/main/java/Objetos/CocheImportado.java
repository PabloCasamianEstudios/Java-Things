/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

/**
 *
 * @author Alumno
 */
public class CocheImportado extends Coche {

    //Atributos especiales del Coche Importado.
    private double impuestoHomologacion;

    //Constructor:
    public CocheImportado(String marca, String modelo, double precioAntesImpuestos, double impuestoHomologacion) {
        super(marca, modelo, precioAntesImpuestos);
        this.impuestoHomologacion = impuestoHomologacion;
    }

    //Getters and setters:
    public double getImpuestoHomologacion() {
        return impuestoHomologacion;
    }

    public void setImpuestoHomologacion(double impuestoHomologacion) {
        this.impuestoHomologacion = impuestoHomologacion/100;
    }

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
    
    //Método ABSTRACTO

    public double calcularPrecioFinal() {
        return precioAntesImpuestos + precioAntesImpuestos*iva + precioAntesImpuestos*impuestoHomologacion; 
    }
    
    
    
}
