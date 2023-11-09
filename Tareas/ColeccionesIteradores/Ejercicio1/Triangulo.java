package Tareas.ColeccionesIteradores.Ejercicio1;

import java.text.DecimalFormat;

//this class inherits from FiguraGeometrica
public class Triangulo extends FiguraGeometrica implements Figura{
    private double base;
    private double altura;
    private double lado1;
    private double lado2;
    DecimalFormat formato = new DecimalFormat("###.##");

    public Triangulo(String nombre, double base, double altura, double lado1, double lado2) {
        super(nombre);
        this.base = base;
        this.altura = altura;
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
    @Override
    public double calcularArea() {
        area = (base * altura) / 2;
        return area;
    }

    @Override
    public double calcularPerimetro() throws RuntimeException {
        if (base < 1 || lado1 < 1 || lado2 < 1) {
            throw new RuntimeException();
        } else {
            perimetro = base + lado1 + lado2;
        }
        return perimetro;
    }

    // method to display the data of an object of this child class
    @Override
    public void mostrarDatos() {
        System.out.printf("%-25s%-25s%-25s%-25s%-25s", "Nombre: " + this.nombre, "Base: " + this.base,
                "Altura: " + this.altura, "Área: " + formato.format(calcularArea()), "Perímetro: " + formato.format(calcularPerimetro()));
    }

    @Override
    public int compare(FiguraGeometrica o1, FiguraGeometrica o2) {
        return o1.getNombre().compareTo(o2.getNombre());
    }
}
