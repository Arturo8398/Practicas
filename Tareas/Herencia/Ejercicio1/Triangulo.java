package Tareas.Herencia.Ejercicio1;
//this class inherits from FiguraGeometrica
public class Triangulo extends FiguraGeometrica{
    private double base;
    private double altura;
    public Triangulo(String nombre, double base, double altura) {
        super(nombre);
        this.base = base;
        this.altura = altura;
    }
    //get and set methods of each attribute
    public double getBase() {
        return base;
    }
    public void setBase(double base) {
        this.base = base;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }//override superclass method calcularArea()
    public void calcularArea(){
        area =  (base*altura)/2;
        System.out.println("El área del triángulo es: " + area);
    }
}
