package Tareas.ClasesGenéricas.Ejercicio3;

public class Main {
    public static void main(String[] args) {
        // instances of class objects
        Paleta paletaCrema1 = new PaletaCrema("Zarzamora", 6, true);
        Paleta paletaCrema2 = new PaletaCrema("Queso", 6, true);
        Paleta paletaCrema3 = new PaletaCrema("Nuez", 6, true);
        Paleta paletaCrema4 = new PaletaCrema("Mango", 6, true);

        // Object lists for storing water palette and cream palette objects

        Generica<Paleta> paletas = new Generica<Paleta>();
        paletas.addPaleta(paletaCrema1);
        paletas.addPaleta(paletaCrema2);
        paletas.addPaleta(paletaCrema3);
        paletas.addPaleta(paletaCrema4);
        paletas.addPaleta(new PaletaAgua("Limón", 2, true));
        paletas.addPaleta(new PaletaAgua("Uva", 2, true));
        paletas.addPaleta(new PaletaAgua("Maruchan", 2, true));

        // improved for loop to save creamy palettes
        System.out.println("---------------------------------------------------------");
        System.out.println("Lista de paletas");
        System.out.println("---------------------------------------------------------");
        try {
            paletas.mostrarPaletas();
        } catch (IndexOutOfBoundsException e) {
            System.out.println("El rango de índices es incorrecto");
            System.out.println("¡Error! " + e);
        }
        System.out.println("---------------------------------------------------------");
        System.out.println("Paleta de agua");
        paletas.unaPaleta(4).eligeVasoOCono();
        System.out.println("Paleta de crema");
        paletaCrema1.eligeVasoOCono();
    }
}
