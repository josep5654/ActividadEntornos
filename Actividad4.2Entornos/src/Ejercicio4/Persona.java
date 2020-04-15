package Ejercicio4;

import java.util.List;

public class Persona {
    private String numeroDetelefono;

    public Persona(String numeroDetelefono) {
        this.numeroDetelefono = numeroDetelefono;
    }

    public String getNumeroDetelefono() {
        return numeroDetelefono;
    }

    public void setNumeroDetelefono(String numeroDetelefono) {
        this.numeroDetelefono = numeroDetelefono;
    }
}
class Profesor<Prestamo> extends Persona{
    String str;
    int edad;
    String numeroDeTelefono;
    List<Prestamo> prestamos;

    public Profesor(String numeroDetelefono) {
        super(numeroDetelefono);
    }
    public  void informacionPersonal(){
        datos();
        System.out.println("Telefono" + numeroDeTelefono);
    }
    public void printTodaLaInformacion(){
        datos();
        for (Prestamo p: prestamos){
            System.out.println(p);

        }
    }
    /*

    */

    private void datos() {
        System.out.println("nombre " +str);
        System.out.println("Edad" + edad);
        System.out.println("Telefono" + numeroDeTelefono);
    }
}
