package Tareas.Herencia.Ejercicio1;

public class FiguraGeometrica {
    protected String nombre;
    protected double area;

    //Constructor of class
    public FiguraGeometrica(String nombre) {
        this.nombre = nombre;
    }

    //get and set methods of each attribute
    public void calcularArea() {
        System.out.println("Calcular área de una figura");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
}
