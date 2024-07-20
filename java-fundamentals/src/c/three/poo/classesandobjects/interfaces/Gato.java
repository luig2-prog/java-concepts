package c.three.poo.classesandobjects.interfaces;

public class Gato extends Animal {

    public Gato() {}
    public Gato(String name) {
        super(name);
    }

    @Override
    void hacerSonido() {
        System.out.println("Miau Miau!");
    }

}
