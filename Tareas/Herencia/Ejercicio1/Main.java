package Tareas.Herencia.Ejercicio1;

public class Main{
    public static void main(String[] args) {
        //We instantiate the geometric figures

        //Circle
        FiguraGeometrica circulo1 = new Circulo("Círculo 1", 5.6);
        
        //rectangle
        FiguraGeometrica rectangulo1 =  new Rectangulo("Rectángulo 1", 6, 5.6);

        //triangele

        FiguraGeometrica triangulo1 =  new Triangulo("Triángulo 1", 2.3, 5.6);

        //the areas of each type of figure are displayed by rewriting the calcularArea() method; of the parent class FiguraGeometrica
        circulo1.calcularArea();
        rectangulo1.calcularArea();
        triangulo1.calcularArea();
    }
}
