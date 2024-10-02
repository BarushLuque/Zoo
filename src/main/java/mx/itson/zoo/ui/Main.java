/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.zoo.ui;

import mx.itson.zoo.entity.zoo.Aguila;
import mx.itson.zoo.entity.zoo.Koala;

/**
 *
 * @author lenovo
 */
public class Main {
    public static void main(String[] args) {
        Aguila aguila = new Aguila();
        aguila.setNombre("America");
        aguila.setLongitudAla(47);
        aguila.setPeso(30);
        String sonidoAguila = aguila.emitirSonido();
        System.out.println("El Aguila hace " + sonidoAguila);
        Koala koala = new Koala();
        koala.setNombre("Dulce");
        koala.setTiempoDormido(22); //en horas
        koala.setTipoComida("Herviboro");
        
        String sonidoKoala = koala.emitirSonido();
        System.out.println("El koala hace " + sonidoKoala);
        
    }
}
