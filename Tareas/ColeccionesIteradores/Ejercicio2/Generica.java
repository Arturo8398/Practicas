package Tareas.ColeccionesIteradores.Ejercicio2;

import java.util.ArrayList;
import java.util.Iterator;

/*
The Iterable<> interface is implemented where the type is set.
of data that is going to be iterated, which in this case is Character, which is
the parent class of the other classes
 */
public class Generica<T> implements Iterable<Personaje>{
    private T personaje;
    private ArrayList<Personaje> lista;

    public  Generica(T personaje){
        this.personaje = personaje;
    }

    public Generica(){
        this.lista = new ArrayList<Personaje>();
    }

    public T getPersonaje() {
        return personaje;
    }

    public void setPersonaje(T personaje) {
        this.personaje = personaje;
    }

    public void agregarPersonaje(Personaje personaje){
        lista.add(personaje);
    }

    public Personaje mostrarPersonaje(int i){
        return lista.get(i);
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
    private class iterarFiguras implements Iterator<Personaje>{
        private int posicion = 0;
        @Override
        public boolean hasNext() {
            return posicion < lista.size();
        }

        @Override
        public Personaje next() {
            return lista.get(posicion++);
        }

    }
}
