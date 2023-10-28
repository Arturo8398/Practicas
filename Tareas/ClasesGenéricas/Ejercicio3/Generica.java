package Tareas.ClasesGenéricas.Ejercicio3;

import java.util.ArrayList;

public class Generica<T> {
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
        for(Paleta paleta : paletas){
            paleta.mostrarDatos();
            System.out.println();
        }
    }

    public Paleta unaPaleta(int i){
        return paletas.get(i);
    }
}
