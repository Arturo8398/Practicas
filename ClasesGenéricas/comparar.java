package ClasesGenéricas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class comparar{
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<Integer>();

        numeros.add(1);
        numeros.add(6);
        numeros.add(3);
        numeros.add(4);
        numeros.add(1);
        numeros.add(3);
        System.out.println("Lista de números sin ordenar");
        mostrarLista(numeros);
        Collections.sort(numeros);
        System.out.println("Lista de números ordenada");
        mostrarLista(numeros);

        ArrayList<String> colores =  new ArrayList<String>();
        colores.add("Rojo");
        colores.add("Azul");
        colores.add("Verde");
        colores.add("Verde");
        mostrarLista(colores);

        ArrayList<Alumno> alumnos = new ArrayList<>();
        alumnos.add(new Alumno(3333, "Luis", "Perez", 1.82, SituacionAcademica.REGULAR));
        alumnos.add(new Alumno(1111, "Maria", "Gomez", 1.66, SituacionAcademica.REGULAR));
        alumnos.add(new Alumno(4444, "Pepe", "Lopez", 1.78, SituacionAcademica.IRREGULAR));
        alumnos.add(new Alumno(2222, "Ana", "Jerez", 1.69, SituacionAcademica.BAJA));
        Collections.sort(alumnos);
        mostrarLista(alumnos);

    }

    public static void mostrarLista(List<?> lista){
        for (Object o : lista) {
            System.out.println(o);
        }
    }
    
}
