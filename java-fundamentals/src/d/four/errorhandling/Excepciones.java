package d.four.errorhandling;

import javax.swing.*;
import java.util.Scanner;

public class Excepciones {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Ingresa su nombre: ");
        String name = scanner.next(); // Obtener lo que ingresó el usuario y transformarlo a un String


        System.out.println("Ingresa su edad: ");
        int edad = scanner.nextInt(); // Obtener lo que ingresó el usuario y transformarlo a un entero



        System.out.println("Ingresa su salario: ");
        float salario = scanner.nextFloat(); // Obtener lo que ingresó el usuario y transformarlo a un flotante

        System.out.println("Tu nombre es: " + name);
        System.out.println("Tienes : " + edad + " años");


        String nameUser = JOptionPane.showInputDialog(null, "Ingresa tu nombre");

        int opcion = 1;

        do {
            try {
                opcion = Integer.parseInt(
                    JOptionPane.showInputDialog(null, "Ingrese la opcion " +
                    "\n 1. Agregar nombre " +
                    "\n 2. Agregar edad " +
                    "\n 0. Salir")
                );
                if (opcion == 1) {
                    System.out.println("Elegiste la opcion 1");
                } else if (opcion == 2) {
                    System.out.println("Elegiste la opcion 2");
                } else if (opcion == 0) {
                    System.out.println("Chaooo!");
                }
            } catch (Exception e) {
                System.out.println("No haz seleccionado una opción valida");
            }
        } while (opcion != 0);


        System.out.println("Tu nombre es: " + nameUser);


        try {
            String text = null;
            text.length();
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Excepcion aritmetica");
        } catch (Exception e) {
            System.out.println("Excepción general");
        }

        /*
        IOException: Indica un error en una operación de entrada o salida (E/S).
        FileNotFoundException: Se lanza cuando se intenta acceder a un archivo que no se encuentra en el sistema.
        ParseException: Ocurre al intentar analizar una cadena para convertirla en un formato específico.
        SQLException: Representa una excepción específica de la base de datos que ocurre durante la interacción con una base de datos.
        Unchecked Exceptions:

        RuntimeException: Clase base para excepciones no comprobadas.
        NullPointerException: Ocurre cuando intentas acceder a un objeto que es null.
        ArrayIndexOutOfBoundsException: Se lanza cuando intentas acceder a un índice fuera del rango válido de un arreglo.
        ArithmeticException: Indica un error aritmético, como la división por cero.
        Además de estas, existen muchas otras excepciones específicas para situaciones particulares. Es importante conocerlas y entender cuándo y cómo manejarlas para escribir un código robusto y confiable.
         */
        try {
            String text = null;
            text.length();
            int result = 10 / 0;
        } catch (ArithmeticException | NullPointerException e) {
            System.out.println("Excepcion aritmetica");
        } catch (Exception e) {
            System.out.println("Excepción general");
        }


        try {
            throw new MiExcepcionPersonalizada("Excepcion personalizada");
        } catch (MiExcepcionPersonalizada e) {
            System.out.println("Excepcion personalizada catch: " + e.getMessage());
        }

    }

}
