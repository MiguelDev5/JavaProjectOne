/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.holamundo;

import com.mycompany.holamundo.clases.Animal;
import com.mycompany.holamundo.clases.Delfin;
import com.mycompany.holamundo.clases.Dormilon;
import com.mycompany.holamundo.clases.Gato;
import com.mycompany.holamundo.clases.Pajaro;
import com.mycompany.holamundo.clases.Perro;

/**
 *
 * @author MSI
 */
public class EjecutarClases {
    
    public static void ejecutar(){
        Perro dog = new Perro("Firulais", "Demoledor");
        Pajaro bird = new Pajaro("Piolín", "aba");
        Delfin dolphin = new Delfin("Flipper", "abe");
        Gato cat = new Gato("Mimi", "Rascadora");
        
        System.out.println("****************************");
        System.out.println(Animal.NOMBRE_GENERICO);
        System.out.println("****************************");
        
        System.out.println("******* Detalles *******");
        System.out.println(Dormilon.TITULO + " " + Dormilon.horasMaximasParaDormir());
        System.out.println("************************");
        
        dog.hacerSonido();
        dog.dormir();

        bird.hacerSonido();
        bird.volar();
        bird.dormir();

        dolphin.hacerSonido();
        dolphin.nadar();
        
        cat.hacerSonido();
        cat.dormir();
    }
    
}
