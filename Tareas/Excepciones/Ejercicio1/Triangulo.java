package Tareas.Excepciones.Ejercicio1;

import java.text.DecimalFormat;

//this class inherits from FiguraGeometrica
public class Triangulo extends FiguraGeometrica {
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

    // get and set methods of each attribute
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
    }// override superclass method calcularArea()

    @Override
    public double calcularArea() {
        area = (base * altura) / 2;
        return area;
    }

    @Override
    public void calcularPerimetro() throws RuntimeException {
        if (base < 1 || lado1 < 1 || lado2 < 1) {
            throw new RuntimeException();
        } else {
            perimetro = base + lado1 + lado2;
        }
        System.out.println(perimetro);
    }

    // method to display the data of an object of this child class
    @Override
    public void mostrarDatos() {
        System.out.printf("%-25s%-25s%-25s%-25s", "Nombre: " + this.nombre, "Base: " + this.base,
                "Altura: " + this.altura, "Área: " + formato.format(calcularArea()));
    }
}
