package PrimerParcial;

public abstract class Empleado {
    private String rfc;
    private String apellidos;
    private String nombres;
    public Empleado(String rfc, String apellidos, String nombres) {
        rfc = rfc;
        apellidos = apellidos;
        this.nombres = nombres;
    }
    @Override
    public String toString() {
        return "Empleado [RFC=" + rfc + ", Apellidos=" + apellidos + ", nombres=" + nombres + "]";
    }

    public abstract double descuentos();
    public abstract double sueldoNeto();

    
}
