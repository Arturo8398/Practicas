package Tareas.ClasesGenéricas.Ejercicio2;

import java.util.ArrayList;

public class Generica<T> {
    private T personaje;
    private ArrayList<Personaje> lista;

    public  Generica(T personaje){
        this.personaje = personaje;
    }

    public Generica(){
        lista = new ArrayList<Personaje>();
    }

    public T getPersonaje() {
        return personaje;
    }

    public void setPersonaje(T personaje) {
        this.personaje = personaje;
    }

    public void agregarPersonaje(Personaje i){
        lista.add(i);
    }

    public Personaje mostrarPersonaje(int i){
        return lista.get(i);
    }
}
