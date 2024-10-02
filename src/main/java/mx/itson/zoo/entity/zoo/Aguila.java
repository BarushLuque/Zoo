/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.zoo.entity.zoo;

/**
 *
 * @author lenovo
 */
public class Aguila extends Animal{
public String emitirSonido(){
    return "un chillido";
}
    /**
     * @return the longitudAla
     */
    public double getLongitudAla() {
        return longitudAla;
    }

    /**
     * @param longitudAla the longitudAla to set
     */
    public void setLongitudAla(double longitudAla) {
        this.longitudAla = longitudAla;
    }
    
    private double longitudAla;
    
}
