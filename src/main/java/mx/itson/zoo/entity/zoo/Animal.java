/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.zoo.entity.zoo;

import mx.itson.zoo.enumerador.Tamanio;

/**
 *
 * @author lenovo
 */
public class Animal {

    /**
     * @return the tamanio
     */
    public Tamanio getTamanio() {
        return tamanio;
    }

    /**
     * @param tamanio the tamanio to set
     */
    public void setTamanio(Tamanio tamanio) {
        this.tamanio = tamanio;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the peso
     */
    public double getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(double peso) {
        this.peso = peso;
    }
    private String nombre;
    private double peso;
    private Tamanio tamanio;
    public String emitirSonido(){
        return "Sonido default";
    }
}
