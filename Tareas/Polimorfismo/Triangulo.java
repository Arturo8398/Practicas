package Tareas.Polimorfismo;

import java.text.DecimalFormat;

//this class inherits from FiguraGeometrica
public class Triangulo extends FiguraGeometrica{
    private double base;
    private double altura;
    DecimalFormat formato = new DecimalFormat("###.##");
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
    @Override
    public double calcularArea(){
        area =  (base*altura)/2;
        return area;
    }
    // method to display the data of an object of this child class
    @Override
    public void mostrarDatos(){
        System.out.printf("%-25s%-25s%-25s%-25s", "Nombre: " + this.nombre, "Base: " + this.base, "Altura: " + this.altura,"Área: " + formato.format(calcularArea()));
    }
}
