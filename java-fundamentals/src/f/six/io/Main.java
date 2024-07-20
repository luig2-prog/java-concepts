package f.six.io;

import java.io.*;

public class Main {

    /*
          BufferedReader: Crear un bufer para leer un archivo
          BufferedWriter: Escribir sobre un archivo
     */

    public static void main(String[] args) {
        // Escribir un archivo

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("file.txt"));
            writer.write("Hola Elizabeth\n");
            writer.write("Hola Luis");
            writer.close();

            // Leer el archivo
            BufferedReader reader = new BufferedReader(new FileReader("file.txt"));
            String line;

            while((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
