package e.five.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iteradores {

    // hasNext(): Devuelve true si la iteración tiene más elementos
    // next(): Devuelve el siguiente elemento en la iteración.
    // remove(): Elimina el último elemento devuelto por el iterador

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Elemento 1");
        list.add("Elemento 2");
        list.add("Eliminar");
        list.add("Elemento 2");

        Iterator<String> iterator = list.iterator();

        System.out.println("Lista antes de la eliminación de elemento: " + list);


        // hasNext(): Devuelve true si la iteración tiene más elementos
        while (iterator.hasNext()) {
//            String element = String.valueOf(iterator.next());
            // next(): Devuelve el siguiente elemento en la iteración.
            String element = iterator.next();
            System.out.println(element);
            if(element.equalsIgnoreCase("Eliminar")) {
                // remove(): Elimina el último elemento devuelto por el iterador
                iterator.remove();
            }
        }


        System.out.println("Lista luego de la eliminación de elemento: " + list);




    }

}
