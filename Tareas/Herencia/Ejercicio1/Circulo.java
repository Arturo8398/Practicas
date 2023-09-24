package Tareas.Herencia.Ejercicio1;
//this class inherits from FiguraGeometrica
public class Circulo extends FiguraGeometrica{
    private double radio;
    private final double PI = 3.1415;
    
    public Circulo(String nombre, double radio){
        super(nombre);
        this.radio = radio;
    }
    @Override
    //override superclass method calcularArea()
    public void calcularArea(){
        area =  PI * (Math.pow(radio, 2));
        System.out.println("El área del círculo es: " + area);
    }
    //get and set methods of each attribute
    public double getRadio() {
        return radio;
    }
    public void setRadio(double radio) {
        this.radio = radio;
    }
    public double getPI() {
        return PI;
    }
}
