package ClasesGenéricas;

import java.util.ArrayList;
import java.util.Iterator;

public class App {
    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList<String>();

        nombres.add("Juan");
        nombres.add("Pedro");
        nombres.add("Maria");
        nombres.add("Jose");
        nombres.add("Luis");
        nombres.add("Ana");

        Iterator<String> it = nombres.iterator();
        System.out.println("Iterando con while");
        while (it.hasNext()) {
            String nombre = it.next();
            System.out.println(nombre);
            if (nombre.equals("Jose")) {
                it.remove();
            }
        }

        System.out.println("\nIterando con for each");
        for (String i : nombres) {
            System.out.println(i);
            if (i.equals("Maria")) {
                nombres.remove(i);
            }
        }

        for (String string : nombres) {
            System.out.println(string);
        }
    }
}
