package Tareas.Polimorfismo.Ejercicio1;



public class FiguraGeometrica {
    protected String nombre;
    protected double area;

    //Constructor of class
    public FiguraGeometrica(String nombre) {
        this.nombre = nombre;
    }
    // I changed the calculateArea() method so that it
    // only returns a number and not a string
    public double calcularArea() {
        return 0;
    }
    // Method to rewrite in child classes
    public void mostrarDatos(){
    }
    //get and set methods of each attribute
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
