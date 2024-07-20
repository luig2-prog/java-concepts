package c.three.poo.classesandobjects;

public class Main {

    // Instanciar un objeto
    static Persona persona = new Persona();
    static Persona personaDos = new Persona("Elizabeth", 24);

    public static void main(String[] args) {

        persona.setName("Luis");
        persona.setAge(30);

        System.out.println("El nombre de la persona es " + persona.getName() + " y tiene " + persona.getAge() + " años");

        System.out.println("El nombre de la persona dos es " + personaDos.getName() + " y tiene " + personaDos.getAge() + " años");

        Persona[] personaArray = new Persona[2];

        personaArray[0] = persona;
        personaArray[1] = personaDos;

        System.out.println("Nombres en el array de personas: ");

        for(int i = 0; i < personaArray.length; i++) {
            System.out.println("El nombre de la persona dos es " + personaArray[i].getName() + " y tiene " + personaArray[i].getAge() + " años");
        }

    }

}