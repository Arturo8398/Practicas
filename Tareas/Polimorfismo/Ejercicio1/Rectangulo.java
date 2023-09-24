package Tareas.Polimorfismo.Ejercicio1;

import java.text.DecimalFormat;

//this class inherits from FiguraGeometrica
public class Rectangulo extends FiguraGeometrica{
    private double ladoMay;
    private double ladoMen;
    DecimalFormat formato = new DecimalFormat("###.##");
    public Rectangulo(String nombre, double ladoMay, double ladoMen) {
        super(nombre);
        this.ladoMay = ladoMay;
        this.ladoMen = ladoMen;
    }
    //get and set methods of each attribute
    public double getLadoMay() {
        return ladoMay;
    }
    public void setLadoMay(double ladoMay) {
        this.ladoMay = ladoMay;
    }
    public double getLadoMen() {
        return ladoMen;
    }
    public void setLadoMen(double ladoMen) {
        this.ladoMen = ladoMen;
    }
    //override superclass method calcularArea()
    @Override
    public double calcularArea(){
        area = ladoMay * ladoMen;
        return area;
    }
    // method to display the data of an object of this child class
    @Override
    public void mostrarDatos(){
        System.out.printf("%-25s%-25s%-25s%-25s", "Nombre: " + this.nombre, "Lado mayor:  " + this.ladoMay, "Lado menor: " + this.ladoMen, "Área: " + formato.format(calcularArea()));
    }
}
