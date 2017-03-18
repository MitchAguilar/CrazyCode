package MotorLogico;

public class Cuenta {

    private String nombre;
    private String Cedula;
    private String Telefono;
    private int Vcuenta;

    public Cuenta(String nombre, String Cedula, String Telefono, int Vcuenta) {
        this.nombre = nombre;
        this.Cedula = Cedula;
        this.Telefono = Telefono;
        this.Vcuenta = Vcuenta;
    }

    public Cuenta() {
        this.nombre = "Grangero Ranchero jamiquino terrorista";
        this.Cedula = "400092954";
        this.Telefono = "313232795";
        this.Vcuenta = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public int getVcuenta() {
        return Vcuenta;
    }

    public void setVcuenta(int Vcuenta) {
        this.Vcuenta = Vcuenta;
    }

    @Override
    public String toString() {
        return "Cuenta ( " + "Nombre= " + nombre + "  Cedula= " + Cedula + "  Telefono= " + Telefono + "  Estado de Cuenta= " + Vcuenta + "$ " ;
    }
}
