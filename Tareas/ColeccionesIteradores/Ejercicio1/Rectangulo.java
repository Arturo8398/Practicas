package Tareas.ColeccionesIteradores.Ejercicio1;

import java.text.DecimalFormat;

//this class inherits from FiguraGeometrica
public class Rectangulo extends FiguraGeometrica implements Figura{
    private double ladoMay;
    private double ladoMen;
    DecimalFormat formato = new DecimalFormat("###.##");

    public Rectangulo(String nombre, double ladoMay, double ladoMen) {
        super(nombre);
        this.ladoMay = ladoMay;
        this.ladoMen = ladoMen;
    }
    // override superclass method calcularArea()
    @Override
    public double calcularArea() {
        area = ladoMay * ladoMen;
        return area;
    }

    @Override
    public double calcularPerimetro() {
        if (ladoMay < 1 || ladoMen < 1) {
            throw new RuntimeException();
        } else {
            perimetro = ladoMay * 2 + ladoMen * 2;
        }
        return perimetro;
    }

    // method to display the data of an object of this child class
    @Override
    public void mostrarDatos() {
        System.out.printf("%-25s%-25s%-25s%-25s%-25s", "Nombre: " + this.nombre, "Lado mayor:  " + this.ladoMay,
                "Lado menor: " + this.ladoMen, "Área: " + formato.format(calcularArea()), "Perímetro: " + formato.format(calcularPerimetro()));
    }

    @Override
    public int compare(FiguraGeometrica o1, FiguraGeometrica o2) {
        return o1.getNombre().compareTo(o2.getNombre());
    }
}
