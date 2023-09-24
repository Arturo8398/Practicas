package Tareas.Polimorfismo;

public class Main {
    public static void main(String[] args) {
        // We instantiate the GeometricFigure class but using the derived classes

        // Object of type GeometricFigure using the Circle class
        FiguraGeometrica circulo1 = new Circulo("Circulo 1", 5.6);
        FiguraGeometrica circulo2 = new Circulo("Circulo 2", 23);
        FiguraGeometrica circulo3 = new Circulo("Circulo 3", 10.2);

        // Object of type GeometricFigure using the Rectangle class
        FiguraGeometrica rectangulo1 = new Rectangulo("Rectangulo 1", 2.3, 1.1);
        FiguraGeometrica rectangulo2 = new Rectangulo("Rectangulo 2", 5.6, 2.3);
        FiguraGeometrica rectangulo3 = new Rectangulo("Rectangulo 3", 8.6, 2.4);

        // Object of type GeometricFigure using the Triangle class
        FiguraGeometrica triangulo1 = new Triangulo("Triangulo 1", 8.9, 10.3);
        FiguraGeometrica triangulo2 = new Triangulo("Triangulo 2", 7.6, 20.3);
        FiguraGeometrica triangulo3 = new Triangulo("Triangulo 3", 10.3, 14.6);
        FiguraGeometrica triangulo4 = new Triangulo("Triangulo 4", 10.3, 4.6);

        // Create the array of objects
        FiguraGeometrica[] arregloFiguras = new FiguraGeometrica[10];

        // The table is created to display the data using improved for
        arregloFiguras[0] = circulo1;
        arregloFiguras[1] = circulo2;
        arregloFiguras[2] = circulo3;
        arregloFiguras[3] = rectangulo1;
        arregloFiguras[4] = rectangulo2;
        arregloFiguras[5] = rectangulo3;
        arregloFiguras[6] = triangulo1;
        arregloFiguras[7] = triangulo2;
        arregloFiguras[8] = triangulo3;
        arregloFiguras[9] = triangulo4;

        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("Lista de las figuras geométricas con sus datos y áreas");
        System.out.println("-----------------------------------------------------------------------------------------");
        for (FiguraGeometrica figuraGeometrica : arregloFiguras) {
            figuraGeometrica.mostrarDatos();
            System.out.println();
        }
        System.out.println("-----------------------------------------------------------------------------------------");
    }
}
