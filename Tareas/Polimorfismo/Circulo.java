package Tareas.Polimorfismo;

import java.text.DecimalFormat;

public class Circulo extends FiguraGeometrica{
    private double radio;
    private final double PI = 3.1415;
    DecimalFormat formato = new DecimalFormat("###.##");
    
    public Circulo(String nombre, double radio){
        super(nombre);
        this.radio = radio;
    }
    @Override
    //override superclass method calcularArea()
    public double calcularArea(){
        area =  PI * (Math.pow(radio, 2));
        return area;
    }
    // method to display the data of an object of this child class
    @Override
    public void mostrarDatos(){
        System.out.printf("%-25s%-25s%-25s%-25s", "Nombre: " + this.nombre, "Radio: " + this.radio,"No aplica","Área: " + formato.format(calcularArea()));
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
