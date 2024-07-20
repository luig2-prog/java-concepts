package e.five.collections.streams;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 2, 2);

        List<Integer> numerosDos = numeros.stream().filter(n -> n > 2.9).toList();

        System.out.println(numerosDos);
        numerosDos.forEach(numero -> System.out.println(numero));


        List<String> palabras = Arrays.asList("Caminar", "Correr", "Saltar", "Caminar");

        List<String> palabrasResult = palabras.stream().filter(p -> p.equalsIgnoreCase("caminar")).toList();

        System.out.println(palabrasResult);



    }

}
