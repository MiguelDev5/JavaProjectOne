/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.holamundo.clases;

import com.mycompany.holamundo.clases.Perro;
import com.mycompany.holamundo.clases.Gato;
import com.mycompany.holamundo.clases.Delfin;

/**
 *
 * @author MSI
 */
public sealed abstract class Animal permits Perro, Gato, Delfin, Pajaro {
    private String nombre;
    protected String apodo;
    
    public static final String NOMBRE_GENERICO = "Mi Zoologico";
    
    Animal(String n, String a){
        this.nombre = n;
        this.apodo = a;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public abstract void hacerSonido();    
}
