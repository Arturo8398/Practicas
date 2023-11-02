package Tareas.ColeccionesIteradores.Ejercicio1;

import java.util.ArrayList;
import java.util.Iterator;

public class Generica<T> implements Iterable<FiguraGeometrica>{
    private T figura;
    public ArrayList<FiguraGeometrica> arrayFiguras;

    public Generica(T figura) {
        this.figura = figura;
        ;
    }

    public Generica() {
        this.arrayFiguras = new ArrayList<FiguraGeometrica>();
    }

    public T getFigura() {
        return figura;
    }

    public void setFigura(T figura) {
        this.figura = figura;
    }

    public void anadirFigura(FiguraGeometrica figura) {
        arrayFiguras.add(figura);
    }

    public ArrayList<FiguraGeometrica> arrayFiguras() {
        return arrayFiguras;
    }

    public void mostrarArreglo() {
        for (FiguraGeometrica figuraGeometrica : arrayFiguras) {
            figuraGeometrica.mostrarDatos();
            System.out.println("");
        }
    }

    @Override
    public Iterator iterator() {
        return new iterarFiguras();
    }

    private class iterarFiguras implements Iterator<FiguraGeometrica>{
        private int posicion = 0;
        @Override
        public boolean hasNext() {
            return posicion < arrayFiguras.size();
        }

        @Override
        public FiguraGeometrica next() {
            return arrayFiguras.get(posicion++);
        }

    }
}