package c.three.poo.classesandobjects;

public class EmpleadoSupervisor extends Persona {

    String tarjetaDeAcceso;

    public EmpleadoSupervisor() {

    }

    public EmpleadoSupervisor(String tarjetaDeAcceso) {
        this.tarjetaDeAcceso = tarjetaDeAcceso;
    }

    public EmpleadoSupervisor(String name, int age, String tarjetaDeAcceso) {
        super(name, age);
        this.tarjetaDeAcceso = tarjetaDeAcceso;
    }

    public void saludar() {
        System.out.println("Hola soy un supervisor y me llamo " + this.getName());
    }


}
