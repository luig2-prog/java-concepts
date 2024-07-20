package b.two.basicconcepts.b.datatypesandoperators;

public class Datos {

    // Tipos de datos primitivos

    // 1 byte
    // Rango de -128 a 127
    byte pruebaByte = -128;

    // 2 byte
    // Rango de -32,768 a 32,767
    short pruebaShort;

    // 4 byte
    // Rango de -2,147,483,648 a 2,147,483,647
    int pruebaInt;

    //    Tamaño: 8 bytes (64 bits)
    //    Rango: de -9,223,372,036,854,775,808 a 9,223,372,036,854,775,807
    long pruebaLong;

    //    Tamaño: 4 bytes (32 bits)
    //    Rango: Aproximadamente de 1.4e-45 a 3.4e+38 (7 cifras significativas)
    float pruebaFloat;

    //    Tamaño: 8 bytes (64 bits)
    //    Rango: Aproximadamente de 4.9e-324 a 1.8e+308 (15 cifras significativas)
    double pruebaDouble;

    //    Tamaño: 2 bytes (16 bits)
    //    Rango: de '\u0000' (0) a '\uffff' (65,535) - Representa un carácter Unicode
    char pruebaChar;

    //    Tamaño: No está estrictamente definido (depende de la implementación de la JVM)
    //    Valores: true o false
    boolean pruebaBoolean;

    String pruebaString;

    public static void main(String[] args) {
        int numeroUno = 4;
        int numeroDos = 2;

        // Operadores

        // Suma
        int suma = numeroUno + numeroDos;

        // Resta
        int resta = numeroUno - numeroDos;

        // Multiplicacion

        int multiplicacion = numeroUno * numeroDos;

        int divicion = numeroUno / numeroDos;

        int residuo = numeroUno % numeroDos;


        System.out.println("La suma de los dos numeros es: " + suma);

        System.out.println("La resta de los dos numeros es: " + resta);

        System.out.println("La multiplicación de los dos numeros es: " + multiplicacion);

        System.out.println("La divicion de los dos numeros es: " + divicion);

        System.out.println("La residuo de los dos numeros es: " + residuo);

        // Operadores relacionales

        // ==
        boolean esIgual = numeroUno == numeroDos;

        // !=
        boolean esDiferente = numeroUno != numeroDos;

        // >

        boolean mayorQue = numeroUno > numeroDos;

        // <
        boolean menorQue = numeroUno < numeroDos;

        // >=

        boolean mayorOigual = numeroUno >= numeroDos;

        // <=

        boolean menorOigual = numeroUno <= numeroDos;

        System.out.println("Los números son iguales? " + esIgual);

        System.out.println("Son diferentes? " + esDiferente);

        System.out.println("Numero uno es mayor a numero dos? " + mayorQue);

        System.out.println("Numero uno es mayor o igual a numero dos? " + mayorOigual);

        System.out.println("Numero uno es menor a numero dos? " + menorQue);

        System.out.println("Numero uno es menor o igual a numero dos? " + menorOigual);

        // Operadores Logicos

        // AND ("&&")
        // condicion1 && condicion2
        //

        boolean resultadoAnd = esIgual && mayorQue;


        boolean resultadoOr = esIgual || mayorQue;

        boolean negacion = !esIgual;

        // Arrays

        int[] numeros = new int[3];
        int[] numerosDefinidos = { 3, 2, 1, 2 };

        numeros[0] = 1;
        numeros[1] = 2;
        numeros[2] = 3;

        System.out.println("Numero uno del array: " + numeros[0]);

        System.out.println("Numero uno del array numerosDefinidos: " + numerosDefinidos[0]);

        System.out.println("Tamaño del array numerosDefinidos: " + numerosDefinidos.length);



    }

}
