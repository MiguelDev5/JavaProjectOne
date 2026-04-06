# JavaProjectOne
# @Autor: Miguel Medina – @MiguelDev5

# 📦 Proyecto Java: Conceptos de Programación Orientada a Objetos

Este proyecto implementa conceptos fundamentales de **Programación Orientada a Objetos (POO)** en Java, incluyendo **clases**, **herencia**, **interfaces** y **encapsulamiento**.

---

## 1 - Tipos de datos, variables y operadores

### Tipos primitivos
| Tipo | Tamaño | Rango / Uso |
| :--- | :--- | :--- |
| **byte** | 8 bits | -128 a 127 |
| **short** | 16 bits | -32,768 a 32,767 |
| **int** | 32 bits | Entero general (más común) |
| **long** | 64 bits | Entero grande — usa sufijo `L` |
| **float** | 32 bits | Decimal simple — usa sufijo `f` |
| **double** | 64 bits | Decimal doble precisión (más común) |
| **char** | 16 bits | Un carácter Unicode (`'A'`, `'\n'`) |
| **boolean** | 1 bit | `true` / `false` |

### Variables
<pre>
int edad = 25;
long poblacion = 8_000_000_000L;  // underscore mejora legibilidad
double precio = 19.99;
float temperatura = 36.5f;
char inicial = 'J';
boolean activo = true;
</pre>

### Tipos de referencia
<pre>
String nombre = "Java";        // Inmutable, vive en el String Pool
Integer numero = 42;           // Wrapper de int (autoboxing)
int[] numeros = {1, 2, 3};     // Array primitivo
String[] palabras = new String[5];
</pre>

### Operadores
<pre>
// Aritméticos
int suma = 5 + 3;       // 8
int modulo = 10 % 3;    // 1

// Relacionales
boolean mayor = 5 > 3;  // true
boolean igual = 5 == 5; // true — NO usar con objetos (usar .equals())

// Lógicos
boolean y = true && false;  // false
boolean o = true || false;  // true
boolean no = !true;         // false

// Asignación compuesta
int x = 10;
x += 5;   // x = 15
x++;      // x = 16 (postincremento)

// Ternario
String estado = edad >= 18 ? "adulto" : "menor";

// instanceof (pattern matching Java 16+)
Object obj = "hola";
if (obj instanceof String s) {
    System.out.println(s.toUpperCase()); // s ya está casteado
}
</pre>

---

## 2 - Control de flujo

### if / else
<pre>
int nota = 85;

if (nota >= 90) {
    System.out.println("A");
} else if (nota >= 80) {
    System.out.println("B");
} else {
    System.out.println("C o menos");
}
</pre>

### switch (clásico vs moderno)
<pre>
// Clásico (Java < 14) — cuidado con el fall-through
String dia = "LUNES";
switch (dia) {
    case "LUNES":
    case "MARTES":
        System.out.println("Inicio de semana");
        break;
    default:
        System.out.println("Otro día");
}

// Moderno (Java 14+) — sin fall-through, más limpio
String resultado = switch (dia) {
    case "LUNES", "MARTES" -> "Inicio de semana";
    case "SABADO", "DOMINGO" -> "Fin de semana";
    default -> "Mitad de semana";
};
</pre>

### Bucles
<pre>
// for clásico
for (int i = 0; i < 5; i++) {
    System.out.println(i);
}

// for-each (enhanced for) — el más usado con colecciones
List<String> nombres = List.of("Ana", "Luis", "Eva");
for (String n : nombres) {
    System.out.println(n);
}

// while
int contador = 0;
while (contador < 3) {
    System.out.println(contador++);
}

// do-while — ejecuta al menos una vez
do {
    System.out.println("Ejecutado");
} while (false);

// break y continue
for (int i = 0; i < 10; i++) {
    if (i == 5) break;     // Sale del bucle
    if (i % 2 == 0) continue; // Salta esta iteración
    System.out.println(i);
}
</pre>

---

## 3 - Programación Orientada a Objetos (POO)
### Encapsulamiento
1 - Ocultar el estado interno y exponer solo lo necesario mediante modificadores de acceso.
2 - Setters y Getters.

| Modificador | Clase | Paquete | Subclase | Mundo |
| :--- | :---: | :---: | :---: | :---: |
| **`public`** | ✅ | ✅ | ✅ | ✅ |
| **`protected`** | ✅ | ✅ | ✅ | ❌ |
| **`(default)`** | ✅ | ✅ | ❌ | ❌ |
| **`private`** | ✅ | ❌ | ❌ | ❌ |

### Abstracción
La Escalera de la Abstracción en Java

| Nivel | Tipo | Concepto (¿Qué es?) | ¿Se puede instanciar? (`new`) | Estado (Atributos) | Ejemplo |
| :--- | :--- | :--- | :---: | :--- | :--- |
| **Máximo** | `interface` | **Un Contrato.** Solo define comportamientos o acciones. | ❌ No | Solo constantes (`static final`). | `Dormilon` |
| **Medio** | `abstract class` | **Un Molde a medias.** Define la esencia y comparte código base. | ❌ No | Sí (campos `private`, `protected`, etc). | `Animal` |
| **Bajo** | `class` (Normal) | **Un Objeto Real.** Implementación total y lista para usarse. | ✅ Sí | Sí (Estado completo). | `Perro` |

### Herencia

| Archivo | Declaración | Descripción |
| :--- | :--- | :--- |
| `Animal.java` | `public sealed abstract class Animal permits Perro, Gato, Delfin, Pajaro` | **Clase base abstracta y sellada.** Define la estructura común y restringe qué clases pueden heredar de ella. |
| `Perro.java` | `public non-sealed class Perro extends Animal implements Dormilon` | **Clase abierta.** Al ser `non-sealed`, rompe el sellado y permite que otras clases desconocidas hereden de `Perro`. |
| `Gato.java` | `public final class Gato extends Animal` | **Clase final.** No permite más herencia. Implementa `hacerSonido()` para mostrar un saludo (miau) por consola. |
| `Delfin.java` | `public final class Delfin extends Animal` | **Clase final.** Representa un animal acuático. Implementa el saludo específico por consola. |
| `Pajaro.java` | `public final class Pajaro extends Animal` | **Clase final.** Representa un animal volador. Implementa el saludo específico por consola. |

### Polimorfismo
El término viene del griego poly (muchas) y morfos (formas). En Java, permite que una variable de tipo "Padre" pueda contener cualquier objeto "Hijo".

<pre>
List<Animal> misAnimales = List.of(new Perro(), new Gato(), new Delfin());

for (Animal a : misAnimales) {
    a.hacerSonido(); // <--- Aquí ocurre la magia
}
</pre>
---
## 4 - Excepciones

| Concepto | Tipo / Bloque | Descripción |
| :--- | :--- | :--- |
| **`try`** | Bloque | Contiene el código "peligroso" que podría lanzar una excepción. |
| **`catch`** | Bloque | Captura y maneja la excepción. Puede haber varios para distintos errores. |
| **`finally`** | Bloque | **Siempre** se ejecuta (haya error o no). Ideal para cerrar recursos. |
| **Checked** | Compilación | El compilador te **obliga** a manejarla (ej. `IOException`, `SQLException`). |
| **Unchecked** | Runtime | Errores de lógica. Heredan de `RuntimeException` (ej. `NullPointerException`). |
| **Custom** | Clase | Excepciones creadas por el programador para reglas de negocio específicas. |
| **`throw`** | Palabra clave | Se usa para lanzar manualmente una excepción en el código. |
| **`throws`** | Palabra clave | Se pone en la firma del método para avisar que este puede lanzar un error. |

---

## 5 - Estructura de Clases e Interfaces 📂

<pre>
│   EjecutarClases.java
│   HolaMundo.java
│   README.md
│   
├───basic
│       ConstantesApp.java
│       MethodsAndOverloading.java
│       
└───clases
    │   Animal.java
    │   Delfin.java
    │   Gato.java
    │   Pajaro.java
    │   Perro.java
    │   
    └───interfaces
            Dormilon.java
            Nadador.java
            Volador.java
</pre>

---

## 6 - Básico 📖

| Archivo               | Descripción                                                                 |
|:---------------------|:----------------------------------------------------------------------------|
| `EjecutarClases.java`  | Clase con el método `main()` donde se crean e invocan instancias de las clases. |
| `HolaMundo.java`       | Clase simple de prueba para mostrar un mensaje de saludo por consola.       |

---

## 7 - Descripción de las Clases e Interfaces 📖

| Archivo               | Descripción                                                                 |
|:---------------------|:----------------------------------------------------------------------------|
| `EjecutarClases.java`  | Clase con el método `main()` donde se crean e invocan instancias de las clases. |
| `HolaMundo.java`       | Clase simple de prueba para mostrar un mensaje de saludo por consola.       |
| `clases/Animal.java`   | Clase abstracta base que define atributos comunes como `nombre` y métodos como `hacerSonido()`. |
| `clases/ConstantesApp.java` | Clase que contiene constantes globales utilizadas en la aplicación.              |
| `clases/Delfin.java`   | Subclase de `Animal` que implementa la interfaz `Nadador`.                   |
| `clases/Dormilon.java` | Interfaz que define el método `dormir()`.                                   |
| `clases/Gato.java`     | Subclase de `Animal` que implementa la interface `Dormilon`.   |
| `clases/Nadador.java`  | Interfaz que define el método `nadar()`.                                     |
| `clases/Pajaro.java`   | Subclase de `Animal` que implementa `Volador`.                               |
| `clases/Perro.java`    | Subclase de `Animal` que implementa `Dormilon`.                              |
| `clases/Volador.java`  | Interfaz que define el método `volar()`.                                     |

---

## 8 - Conceptos aplicados 📝

- ✅ Clases abstractas  
- ✅ Herencia  
- ✅ Interfaces  
- ✅ Encapsulamiento  
- ✅ Polimorfismo mediante métodos sobrescritos  

---

## 9 - Ejecución 📦

Para compilar y ejecutar el proyecto desde consola:

```bash
javac HolaMundo.java
java HolaMundo
