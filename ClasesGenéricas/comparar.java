package ClasesGenéricas;

import java.util.ArrayList;
import java.util.Collection;
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
        Collection.sort(numeros);
        mostrarLista(numeros);

        ArrayList<String> colores =  new ArrayList<String>();
        colores.add("Rojo");
        colores.add("Azul");
        colores.add("Verde");
        colores.add("Verde");

        mostrarLista(colores);

    }

    public static void mostrarLista(List<?> lista){
        for (Object o : lista) {
            System.out.println(o);
        }
    }
}
