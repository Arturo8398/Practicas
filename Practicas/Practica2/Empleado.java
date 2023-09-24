package Practicas.Practica2;/**
 * Unit test for simple App.
 */
public abstract class Empleado {
    private String nombre;
    private double salario;
    
    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    abstract double calcularSalario();

    public String getNombre() {
        return nombre;
    }

    public double getSalario() {
        return salario;
    }
}
