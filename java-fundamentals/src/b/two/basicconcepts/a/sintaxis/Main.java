package b.two.basicconcepts.a.sintaxis;

import b.two.basicconcepts.a.sintaxis.Hola;

// El nombre de la clase debe ser igual al nombre del archivo
// El nombre de la clase es b.two.basicconcepts.a.sintaxis.Main -> El nombre del archivo debe ser b.two.basicconcepts.a.sintaxis.Main.java
public class Main {
    // Método principal y punto de entrada del programa

    static Hola holaClaase = new Hola();

    public static void main(String[] args) {
        // Impresión por consola
        System.out.println("Hello world!");
        holaClaase.saludar();
    }
}