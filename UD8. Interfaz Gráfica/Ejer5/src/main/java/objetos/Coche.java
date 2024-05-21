/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetos;

/**
 *
 * @author Alumno
 */
public abstract class Coche {
    
    //atributos del coche.
    protected String marca;
    protected String matricula;
    protected long km;

    //constructor
    public Coche(String marca, String matricula, long km) {
        this.marca = marca;
        this.matricula = matricula;
        this.km = km;
    }
   
    //getters and setters

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
