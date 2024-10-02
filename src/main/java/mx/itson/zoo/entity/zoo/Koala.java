/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.zoo.entity.zoo;

/**
 *
 * @author lenovo
 */
public class Koala extends Animal{

    @Override
    public String emitirSonido(){
        return "ronquidos Zzz";
    }
    /**
     * @return the tiempoDormido
     */
    public double getTiempoDormido() {
        return tiempoDormido;
    }

    /**
     * @param tiempoDormido the tiempoDormido to set
     */
    public void setTiempoDormido(int tiempoDormido) {
        this.tiempoDormido = tiempoDormido;
    }

    /**
     * @return the tipoComida
     */
    public String getTipoComida() {
        return tipoComida;
    }

    /**
     * @param tipoComida the tipoComida to set
     */
    public void setTipoComida(String tipoComida) {
        this.tipoComida = tipoComida;
    }
    
    private int tiempoDormido;
    private String tipoComida;
    
}
