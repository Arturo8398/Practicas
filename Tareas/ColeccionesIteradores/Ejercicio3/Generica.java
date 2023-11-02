package Tareas.ColeccionesIteradores.Ejercicio3;

import java.util.ArrayList;
import java.util.Iterator;

public class Generica<T> implements Iterable<Paleta> {
    private T objeto;
    private ArrayList<Paleta> paletas;

    public Generica(T objeto){
        this.objeto = objeto;
    }

    public Generica(){
        this.paletas = new ArrayList<Paleta>();
    }
    
    public void addPaleta(Paleta paleta){
        this.paletas.add(paleta);
    }

    public void mostrarPaletas(){
        Iterator<Paleta>  i = paletas.iterator();
        while (i.hasNext()) {
            i.next().mostrarInformacion();
        }
    }

    public Paleta unaPaleta(int i){
        return paletas.get(i);
    }

    @Override
    public Iterator iterator() {
        return new IterarPaletas();
    }

    private class IterarPaletas implements Iterator<Paleta>{
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
