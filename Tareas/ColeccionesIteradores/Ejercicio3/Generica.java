package Tareas.ColeccionesIteradores.Ejercicio3;

import java.util.ArrayList;
import java.util.Iterator;

/*
The Iterable<> interface is implemented where the type is set.
of data that is going to be iterated, which in this case is Palette, which is
the parent class of the other classes
 */
public class Generica<T> implements Iterable<Paleta> {
    private T objeto;
    private ArrayList<Paleta> paletas;

    public Generica(T objeto) {
        this.objeto = objeto;
    }

    public Generica() {
        this.paletas = new ArrayList<Paleta>();
    }

    public void addPaleta(Paleta paleta) {
        this.paletas.add(paleta);
    }

    /*
     * To take advantage of this showPalettes() method of the Generic<T> class
     * An object of type Iterator<Palette> i is implemented that contains the
     * iterator of the
     * list of palettes, and the list is traversed with the next() and hasNext()
     * methods of the Iterator<Palette> interface
     */
    public void mostrarPaletas() {
        Iterator<Paleta> i = paletas.iterator();
        while (i.hasNext()) {
            i.next().mostrarInformacion();
        }
    }

    public Paleta unaPaleta(int i) {
        return paletas.get(i);
    }

    /*
     * The iterator() method of the Iterable<> interface is implemented
     * which returns the iterator returned by the iterator() method of the
     * ArrayList<> class
     */
    @Override
    public Iterator iterator() {
        return new IterarPaletas();
    }

    /*
     * An inner class is created that implements the Iterator<> interface and
     * override interface methods
     */
    private class IterarPaletas implements Iterator<Paleta> {
        private int indice = 0;

        @Override
        public boolean hasNext() {
            return indice < paletas.size();
        }

        @Override
        public Paleta next() {
            return paletas.get(indice++);
        }

    }
}
