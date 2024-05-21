/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetos;

import java.util.ArrayList;

/**
 *
 * @author Alumno
 */
public class Alquiler extends Coche{
    
    protected ArrayList<String> cliente = new ArrayList();

    public Alquiler(String marca, String matricula, long km) {
        super(marca, matricula, km);
    }

    public ArrayList<String> getCliente() {
        return cliente;
    }

    public void setCliente(ArrayList<String> cliente) {
        this.cliente = cliente;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public long getKm() {
        return km;
    }

    public void setKm(long km) {
        this.km = km;
    }
    
    
}
