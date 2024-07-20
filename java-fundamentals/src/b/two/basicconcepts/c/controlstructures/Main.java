package b.two.basicconcepts.c.controlstructures;

public class Main {

//    if
//    if - else

    static boolean mayor(int num1, int num2) {
        if(num1 > num2) {
            return true;
        } else {
            return false;
        }
//        o
//        return num1 > num2;
    }



//    if - else if

    static void esCero(int num1, int num2) {
        if(num1 > num2) {
            System.out.println("Es mayor");
        } else if (num1 < num2) {
            System.out.println("Es menor");
        } else {
            System.out.println("Es igual a cero");
        }
    }
//    swith

    static void validar(int opciones, String palabra) {
        switch (opciones) {
            case 0:
                System.out.println("Opcion 1");
                break;
            case 1:
                System.out.println("Opcion 2");
                break;
            default:
                System.out.println("No seleccionaste una opción válida");
                break;

        }

        switch (palabra) {
            case "luis":
                System.out.println("Palabra ingresada: " + palabra);
                break;
            case "caminar":
                System.out.println("Palabra ingresada: " + palabra);
                break;
            default:
                System.out.println("No ingresaste una palabra válida");
                break;
        }

        char letra = 'a';
        switch (letra) {
            case 'a' -> {
                System.out.println("Palabra ingresada: " + palabra);
                System.out.println("Palabra ingresada: " + palabra);
            }
            case 'b' -> System.out.println("Palabra ingresada: " + palabra);
            default -> System.out.println("No ingresaste una palabra válida");
        }

    }
//
    public static void main(String[] args) {

    }
}
