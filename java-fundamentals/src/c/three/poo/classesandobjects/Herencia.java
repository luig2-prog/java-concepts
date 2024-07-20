package c.three.poo.classesandobjects;

public class Herencia {

    static EmpleadoSupervisor empleadoSupervisor = new EmpleadoSupervisor();
    static EmpleadoSupervisor personaDos = new EmpleadoSupervisor("Elizabeth", 24, "nnnn");
    public static void main(String[] args) {

        empleadoSupervisor.setName("Luis");
        empleadoSupervisor.setAge(30);

        System.out.println("El nombre de la persona es " + empleadoSupervisor.getName() + " y tiene " + empleadoSupervisor.getAge() + " años");

        System.out.println("El nombre de la persona dos es " + personaDos.getName() + " y tiene " + personaDos.getAge() + " años");

        EmpleadoSupervisor[] personaArray = new EmpleadoSupervisor[2];

        personaArray[0] = empleadoSupervisor;
        personaArray[1] = personaDos;

        System.out.println("Nombres en el array de personas: ");

        for(int i = 0; i < personaArray.length; i++) {
            personaArray[i].saludar();
            System.out.println("El nombre de la persona es " + personaArray[i].getName() + " y tiene " + personaArray[i].getAge() + " años");
        }

//        Polimorfismo

        Persona personaPolimorfica = new EmpleadoSupervisor();

        personaPolimorfica.caminar();

        Persona personaPolimorficaDos = new EmpleadoDocente();

        personaPolimorficaDos.caminar();


    }

}
