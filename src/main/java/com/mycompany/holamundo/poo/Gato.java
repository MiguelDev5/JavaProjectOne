/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.holamundo.poo;

import com.mycompany.holamundo.poo.interfaces.Dormilon;

/**
 *
 * @author MSI
 */
public non-sealed class Gato extends Animal implements Dormilon {

    public Gato(String n, String a){
        super(n, a);
    }
    
    @Override
    public void hacerSonido() {
        System.out.println(getNombre() +"("+apodo+")" + " está maullando.");
    }

    public void hacerseBolita(){
        System.out.println("Haciendose bolita...");
    }
}
