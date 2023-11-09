package Tareas.ColeccionesIteradores.Ejercicio1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
The Iterable<> interface is implemented where the type is set.
of data that is going to be iterated, which in this case is Geometric Figure, which is
the parent class of the other classes
 */
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

    /*
    The iterator() method of the Iterable<> interface is implemented
    which returns the iterator returned by the iterator() method of the ArrayList<> class
     */
    @Override
    public Iterator iterator() {
        return new iterarFiguras();
    }

    /*
    An inner class is created that implements the Iterator<> interface and
     override interface methods
     */
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