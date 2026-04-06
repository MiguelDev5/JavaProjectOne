/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.holamundo.poo;

import com.mycompany.holamundo.poo.interfaces.Dormilon;
import com.mycompany.holamundo.poo.interfaces.Volador;

/**
 *
 * @author MSI
 */
public final class Pajaro extends Animal implements Dormilon, Volador {
    
    public Pajaro(String n, String a){
        super(n, a);
    }
    
    @Override
    public void hacerSonido() {
       System.out.println(this.getNombre() + " dice: Pío pío");
    }

    @Override
    public void volar() {
        System.out.println(this.getNombre() + " está volando");
    }
    
}
