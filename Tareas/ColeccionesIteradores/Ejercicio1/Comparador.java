package Tareas.ColeccionesIteradores.Ejercicio1;

import Tareas.Herencia.FiguraGeometrica;

import java.util.Comparator;

public class Comparador implements Comparator<Circulo> {

    @Override
    public int compare(Circulo o1, Circulo o2) {
        return o1.getNombre().compareTo(o2.getNombre());
    }
}
