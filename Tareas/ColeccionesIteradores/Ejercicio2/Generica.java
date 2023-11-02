package Tareas.ColeccionesIteradores.Ejercicio2;

import java.util.ArrayList;
import java.util.Iterator;

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


    @Override
    public Iterator iterator() {
        return new iterarFiguras();
    }

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
