package Tareas.ClasesGenéricas.Ejercicio1;

import java.util.ArrayList;

public class Generica<T>{
    private T figura;
    public ArrayList<FiguraGeometrica> arrayFiguras;

    public Generica(T figura){
        this.figura = figura;;
    }

    public Generica(){
        this.arrayFiguras = new ArrayList<FiguraGeometrica>();
    }

    public T getFigura() {
        return figura;
    }

    public void setFigura(T figura) {
        this.figura = figura;
    }

    public void anadirFigura(FiguraGeometrica figura){
        arrayFiguras.add(figura);
    }

    public ArrayList<FiguraGeometrica> arrayFiguras(){
        return arrayFiguras;
    }

    public void mostrarArreglo (){
        for (FiguraGeometrica figuraGeometrica : arrayFiguras) {
            figuraGeometrica.mostrarDatos();
            System.out.println("");
        }
    }
}