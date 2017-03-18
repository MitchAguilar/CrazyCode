package MotorLogico;

public class Posiciones {

    private int tamaño;
    private String nombre;

    public Posiciones(int tamaño, String nombre) {
        this.tamaño = tamaño;
        this.nombre = nombre;
    }

    public Posiciones() {
        this.tamaño = 0;
        this.nombre = "";
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
