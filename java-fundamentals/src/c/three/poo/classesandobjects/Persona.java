package c.three.poo.classesandobjects;

// Como establecer una clase
// 1.
public class Persona {

//    2.
//    Como darle atributos a dicha clase

    private String name;
    private int age;


//3.
//    Constructor
//    Establecer un constructor (Punto de entrada para acceder al objeto de la clase)
    public Persona() {

    }

//    sobrercargar un constructor para establecer valores de inicio
    public Persona(String name, int age) {
        this.name = name;
        this.age = age;
    }

//    3.

//    Métodos set y get
//    Metodo Set es para modificar el valor de una variable en una clase

    public void setName(String name) {
        this.name = name;
    }

//    Método Get es para acceder al valor de una variable en una clase
    public String getName() {
        return this.name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //4.
//    Sobrecarga de constructores o métodos

// Sobrecargar metodos
    public void caminar() {
        System.out.println("Estoy caminando... ");
    }

    public void caminar(String palabra) {
        System.out.println("Estoy caminando diciendo esta palabra: " + palabra);
    }

}
