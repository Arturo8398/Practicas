package Tareas.ColeccionesIteradores.Ejercicio1;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        // We instantiate the GeometricFigure class but using the derived classes

        // Object of type GeometricFigure using the Circle class
        System.out.println("Hola, cambio de VSCode a Intellij");
        System.out.println("Pruebas con intellij");
        Generica<FiguraGeometrica> arregloFiguras = new Generica<FiguraGeometrica>();

        arregloFiguras.anadirFigura(new Circulo("Circulo 2", 23));
        arregloFiguras.anadirFigura(new Circulo("Circulo 1", 5.6));
        arregloFiguras.anadirFigura(new Rectangulo("Rectangulo 1", 2.3, 1.1));
        arregloFiguras.anadirFigura(new Rectangulo("Rectangulo 2", 5.6, 2.3));
        arregloFiguras.anadirFigura(new Rectangulo("Rectangulo 3", 8.6, 2.4));
        arregloFiguras.anadirFigura(new Triangulo("Triangulo 1", 8.9, 10.3, 10.0, 14.3));
        arregloFiguras.anadirFigura(new Triangulo("Triangulo 2", 7.6, 20.3, 15.2, 16.1));
        arregloFiguras.anadirFigura(new Triangulo("Triangulo 3", 10.3, 14.6, 17.1, 15.2));
        arregloFiguras.anadirFigura(new Triangulo("Triangulo 4", 10.3, 4.6, 17.1, 19.2));

        /*
         * Se crea un objeto de la interfaz Iterator<FiguraGeometrica>
         * donde se le asigna el iterador que retorna el método iterator() de la clase
         * Generica<>
         */
        Iterator<FiguraGeometrica> iterador = arregloFiguras.iterator();
        System.out.println(
                "-----------------------------------------------------------------------------------------------------------------------");
        System.out.println("Usando el iterador");
        System.out.println("Lista de las figuras geométricas con sus datos y áreas");
        System.out.println(
                "-----------------------------------------------------------------------------------------------------------------------");

        /*
         * The for... each is replaced by the iterator returned by the iterator() method
         * of the Generica<> class using the hasNext() and next() methods of the
         * Iterator<> interface
         * The data is displayed with the showData() method of the FiguraGeometrica
         * class
         */
        while (iterador.hasNext()) {
            FiguraGeometrica figura = iterador.next();
            figura.mostrarDatos();
            System.out.println("");
        }
        System.out.println(
                "-----------------------------------------------------------------------------------------------------------------------");

        /*
         * System.out.println(
         * "-----------------------------------------------------------------------------------------------------------------------"
         * );
         * System.out.println("Lista de las figuras geométricas con sus datos y áreas");
         * System.out.println(
         * "-----------------------------------------------------------------------------------------------------------------------"
         * );
         * arregloFiguras.mostrarArreglo();
         * System.out.println(
         * "-----------------------------------------------------------------------------------------------------------------------"
         * );
         */
    }
}
