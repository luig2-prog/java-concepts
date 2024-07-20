package d.four.errorhandling;

public class MiExcepcionPersonalizada extends Exception {
    public MiExcepcionPersonalizada(String mensaje) {
        super(mensaje);
        writeToLog();
    }

    public void writeToLog() {
        System.out.println("Escribí en un log por una excepcion personalizada");
    }

}
