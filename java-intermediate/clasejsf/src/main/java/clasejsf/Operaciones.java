package clasejsf;

import javax.faces.bean.ManagedBean;

@ManagedBean(name = "operaciones")
public class Operaciones {
    private int num1;
    private int num2;
    private int resultado;

    // Getters y setters
    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int getResultado() {
        return resultado;
    }

    public void sumar() {
        resultado = num1 + num2;
    }
}
