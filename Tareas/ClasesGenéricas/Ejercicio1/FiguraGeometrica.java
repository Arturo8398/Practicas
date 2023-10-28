package Tareas.ClasesGenéricas.Ejercicio1;

public abstract class FiguraGeometrica implements Figura{
    protected String nombre;
    protected double area;
    protected double perimetro;

    // Constructor of class
    public FiguraGeometrica(String nombre) {
        this.nombre = nombre;
    }

    // I changed the calculateArea() method so that it
    // only returns a number and not a string
    abstract double calcularArea();

    // Method to rewrite in child classes
    abstract void mostrarDatos();

    // get and set methods of each attribute
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
