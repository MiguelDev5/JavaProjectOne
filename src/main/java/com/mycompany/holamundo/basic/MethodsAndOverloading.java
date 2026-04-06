package com.mycompany.holamundo.basic;

public class MethodsAndOverloading {

    // Método básico
    public int sumar(int a, int b) {
        return a + b;
    }

    // Sobrecarga — mismo nombre, diferente firma
    public double sumar(double a, double b) {
        return a + b;
    }

    public int sumar(int a, int b, int c) {
        return a + b + c;
    }

    // Varargs — número variable de argumentos
    public int sumarTodos(int... numeros) {
        int total = 0;
        for (int n : numeros) total += n;
        return total;
    }

    // Método estático — no necesita instancia
    public static int multiplicar(int a, int b) {
        return a * b;
    }
}
