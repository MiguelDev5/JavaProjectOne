package com.mycompany.holamundo.exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class MyFile {

    // try-catch-finally
    public String leerArchivo(String ruta) {
        try {
            // Código que puede fallar
            return Files.readString(Path.of(ruta));
        } catch (FileNotFoundException e) {
            System.err.println("Archivo no encontrado: " + e.getMessage());
            return null;
        } catch (IOException e) {
            System.err.println("Error de IO: " + e.getMessage());
            return null;
        } finally {
            // Siempre se ejecuta — útil para cerrar recursos
            System.out.println("Intento de lectura finalizado");
        }
    }

    // CHECKED VS UNCHECKED
    // Checked — el compilador obliga a manejarla (extends Exception)
    // Ejemplos: IOException, SQLException, ParseException

    // Unchecked — NO obliga el compilador (extends RuntimeException)
    // Ejemplos: NullPointerException, IllegalArgumentException, IndexOutOfBoundsException

    public void validarEdad(int edad) {
        if (edad < 0) {
            throw new IllegalArgumentException("La edad no puede ser negativa: " + edad);
            // Unchecked — quien llama decide si la maneja o no
        }
    }
}
