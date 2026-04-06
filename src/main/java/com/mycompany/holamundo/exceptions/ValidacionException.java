package com.mycompany.holamundo.exceptions;

public class ValidacionException extends Exception {
    public ValidacionException(String mensaje) {
        super(mensaje);
    }

    public void validarEdad(int edad) throws MiErrorPersonalizado {
        if (edad < 18) {
            throw new MiErrorPersonalizado("Acceso denegado: Menor de edad");
        }
    }
}
