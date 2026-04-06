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
public non-sealed class Perro extends Animal implements Dormilon {
    
    public Perro(String nombre, String apodo) {
        super(nombre, apodo);
    }
    
    @Override
    public void hacerSonido() {
        System.out.println(this.getNombre() +"("+apodo+")" + " dice: Guau guau");
    }
}
