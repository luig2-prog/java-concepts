package e.five.collections;

import c.three.poo.classesandobjects.Persona;

import java.util.*;

public class Main {



    public static void main(String[] args) {

//        Lista ordenada
//        No permite argumentos de tipos de datos primitivos
//        List<Integer> list = new ArrayList<>();
//        list.add("Elemento 1");
        List<String> list = new ArrayList<>();

        list.add("Elemento 1");
        list.add("Elemento 2");
        list.add("Elemento 2");
        list.add(1, "Elemento nuevo");
//        For each
        System.out.println("For each element");
        int index = 0;
        try {
            for (String frase : list) {//For each genera problema de concurrencia
                    System.out.println(frase);
                    if(frase.equalsIgnoreCase("Elemento 1")) {
                        list.remove(index);
                    }
                    index++;
            }
        } catch (Exception e) {
            System.out.println("Problema de concurrencia: " + e.getMessage());
        }
        for(int i = 0; i < list.size(); i++) {
            if(list.get(i).equals("Elemento 1")) {
                list.remove(index);
            }
        }

        list.add("Elemento 3");

//        For each con una expresión lambda
        System.out.println("For each con lambda");
        list.forEach(elemento -> System.out.println(elemento));
        list.forEach(System.out::println);

        //
        System.out.println("Contiene Elemento 1: " + list.contains("Elemento 1"));

        System.out.println("Está vacía la lista?: " + list.isEmpty());

        System.out.println("Tamaño de la lista: " + list.size());

        System.out.println("Datos posición 0: " + list.get(0));

        list.forEach(System.out::println);

        System.out.println("Remover posición 0: " + list.remove(0));

        list.forEach(System.out::println);

        List<Persona> listPersons = new ArrayList<>();
        listPersons.add(new Persona("Luis", 20));

        for (Persona listPerson : listPersons) {
            System.out.println("Nombre: " + listPerson.getName() + " - Edad: " + listPerson.getAge());
        }


        // Set

        System.out.println("\n\n ********** Set **********");

        Set<String> conjunto = new HashSet<>();


        conjunto.add("Elemento 2");
        conjunto.add("Elemento 1");
        conjunto.add("Elemento 1"); // Este dato no se agrega porque no permite datos repetidos


        conjunto.forEach(elemento -> System.out.println(elemento));

        System.out.println("Imprimimos la lista como un Array: " + Arrays.toString(conjunto.toArray()));

        System.out.println("Tamaño: " + conjunto.size());

        System.out.println("Vacio?: " + conjunto.isEmpty());

        System.out.println("Contiene: " + conjunto.contains("Elemento 1"));

        System.out.println("Remover: " + conjunto.remove("Elemento 1"));

        System.out.println("Imprimimos la lista como un Array: " + Arrays.toString(conjunto.toArray()));


        // Es una colección asociada por claves y valires. No permite claves duplicadas

        System.out.println("\n\n ****** Map ******");

        Map<String, String> map = new HashMap<>();

        map.put("nombre", "Luis");
        map.put("apellido", "Hernandez");

        System.out.println(map);

        map.forEach((clave, valor) -> {
            System.out.println(clave + ": " + valor);
            System.out.println("-----");
        });

        Map<String, Persona> personaMap = new HashMap<>();

        personaMap.put("persona 1", new Persona("Luis", 20));

        personaMap.forEach((clave, valor) -> System.out.println(clave + ": " + valor.getName()));


        List<Map<String, String>> json = new ArrayList<>();

        Map<String, String> map1 = new HashMap<>();
        map1.put("name", "Luis");
        map1.put("apellido", "Hernandez");

        Map<String, String> map2 = new HashMap<>();
        map2.put("name", "Luis");
        map2.put("apellido", "Hernandez");

        json.add(map1);
        json.add(map2);

        System.out.println(json);


    }
}
