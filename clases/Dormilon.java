/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.holamundo.clases;

/**
 *
 * @author MSI
 */
public interface Dormilon {
    
    String TITULO = "Dormirlones club";
    
    default void dormir() {
        System.out.println("Zzz...");
    }
    
    public static int horasMaximasParaDormir(){
        return 100;
    }
}
