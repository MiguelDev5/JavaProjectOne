/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.holamundo.clases;

import com.mycompany.holamundo.clases.Animal;

/**
 *
 * @author MSI
 */
public final class Delfin extends Animal implements Nadador{

    public Delfin(String n, String a){
        super(n, a);
    }
    
    @Override
    public void hacerSonido() {
        System.out.println(this.getNombre() + " hace un sonido agudo.");
    } 

    @Override
    public void nadar() {
        System.out.println(this.getNombre() + " nada rápidamente.");
    }
}
