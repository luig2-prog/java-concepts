import b.two.basicconcepts.a.sintaxis.Hola;

// El nombre de la clase debe ser igual al nombre del archivo
// El nombre de la clase es Main -> El nombre del archivo debe ser Main.java
public class Main {
    // Método principal y punto de entrada del programa

    static Hola holaClaase = new Hola();

    public static void main(String[] args) {
        // Impresión por consola
        System.out.println("Hello world!");
        holaClaase.saludar();
    }
}