/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.holamundo;

import com.mycompany.holamundo.poo.Animal;
import com.mycompany.holamundo.poo.Delfin;
import com.mycompany.holamundo.poo.interfaces.Dormilon;
import com.mycompany.holamundo.poo.Gato;
import com.mycompany.holamundo.poo.Pajaro;
import com.mycompany.holamundo.poo.Perro;

import java.util.List;

/**
 *
 * @author MSI
 */
public class EjecutarClases {
    
    public static void ejecutar(){

        List<Animal> misAnimales = List.of(
                new Perro("Firulais", "Demoledor"),
                new Gato("Mimi", "Rascadora"),
                new Pajaro("Piolín", "aba"),
                new Delfin("Flipper", "abe")
        );
        
        System.out.println("****************************");
        System.out.println(Animal.NOMBRE_GENERICO);
        System.out.println("****************************");
        
        System.out.println("******* Detalles *******");
        System.out.println(Dormilon.TITULO + " " + Dormilon.horasMaximasParaDormir());
        System.out.println("************************");

        for (Animal a : misAnimales) {
            a.hacerSonido();
        }

        ( (Perro) misAnimales.getFirst() ).dormir();
        ( (Gato) misAnimales.get(1) ).hacerseBolita();
        ( (Pajaro) misAnimales.get(2) ).volar();
        Delfin dolphin = (Delfin) misAnimales.getLast();
        dolphin.nadar();
    }
}
