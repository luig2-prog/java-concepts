package b.two.basicconcepts.c.controlstructures.ciclos;

public class Ciclos {

    public static void main(String[] args) {

        // for
        for(int i = 0; i < 5; i++) {
            System.out.println("Iteración: " + i);
        }

        // while
        int i = 0;
        while (i < 5) {
            System.out.println("Iteración while: " + i);
            i++; // i = i + 1;
        }

        // do while

        int j = 0;

        do {
            System.out.println("Iteración do while: " + j);
            j++;
        } while (j < 5);

        // Recorrer un array
        int[] numeros = new int[3];
        int[] numerosDefinidos = { 3, 2, 1, 2 };
        String[] nombres = new String[3];
        String[] nombreDefinidos = { "Luis" , "Elizabeth" };


        numeros[0] = 1;
        numeros[1] = 2;
        numeros[2] = 3;

        recorrerArry(numeros);

        System.out.println("*****");

        recorrerArry(numeros);
        recorrerArry(numerosDefinidos);
        System.out.println("*** Nombres ***");
        recorrerArry(nombres);
        recorrerArry(nombreDefinidos);

    }

    public static void recorrerArry(int[] numeros) {
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Numero en la posición " + i + ": " + numeros[i]);
        }
    }

    public static void recorrerArry(String[] numeros) {
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Nombre en la posición " + i + ": " + numeros[i]);
        }
    }

}
