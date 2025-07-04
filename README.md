# JavaProjectOne
# @Autor: Miguel Medina – @MiguelDev5

# 📦 Proyecto Java: Conceptos de Programación Orientada a Objetos

Este proyecto implementa conceptos fundamentales de **Programación Orientada a Objetos (POO)** en Java, incluyendo **clases**, **herencia**, **interfaces** y **encapsulamiento**.

---

## 📂 Estructura de Clases e Interfaces


└── holamundo/
    ├── EjecutarClases.java
    ├── HolaMundo.java
    └── clases/
        ├── Animal.java
        ├── ConstantesApp.java
        ├── Delfin.java
        ├── Dormilon.java
        ├── Gato.java
        ├── Nadador.java
        ├── Pajaro.java
        ├── Perro.java
        └── Volador.java


---

## 📖 Descripción de las Clases e Interfaces

| Archivo               | Descripción                                                                 |
|:---------------------|:----------------------------------------------------------------------------|
| `EjecutarClases.java`  | Clase con el método `main()` donde se crean e invocan instancias de las clases. |
| `HolaMundo.java`       | Clase simple de prueba para mostrar un mensaje de saludo por consola.       |
| `clases/Animal.java`   | Clase abstracta base que define atributos comunes como `nombre` y métodos como `hacerSonido()`. |
| `clases/ConstantesApp.java` | Clase que contiene constantes globales utilizadas en la aplicación.              |
| `clases/Delfin.java`   | Subclase de `Animal` que implementa la interfaz `Nadador`.                   |
| `clases/Dormilon.java` | Interfaz que define el método `dormir()`.                                   |
| `clases/Gato.java`     | Subclase de `Animal` que implementa las interfaces `Dormilon` y `Volador`.   |
| `clases/Nadador.java`  | Interfaz que define el método `nadar()`.                                     |
| `clases/Pajaro.java`   | Subclase de `Animal` que implementa `Volador`.                               |
| `clases/Perro.java`    | Subclase de `Animal` que implementa `Dormilon`.                              |
| `clases/Volador.java`  | Interfaz que define el método `volar()`.                                     |

---

## 📝 Conceptos aplicados

- ✅ Clases abstractas  
- ✅ Herencia  
- ✅ Interfaces  
- ✅ Encapsulamiento  
- ✅ Polimorfismo mediante métodos sobrescritos  

---

## 📦 Ejecución

Para compilar y ejecutar el proyecto desde consola:

```bash
javac EjecutarClases.java
java EjecutarClases

