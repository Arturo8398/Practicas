package Tareas.ClasesInterfaces.Ejercicio3;

public class Main {
    public static void main(String[] args) {
        // instances of class objects
        Paleta paletaCrema1 = new PaletaCrema("Zarzamora", 6, true);
        Paleta paletaCrema2 = new PaletaCrema("Queso", 6, true);
        Paleta paletaCrema3 = new PaletaCrema("Nuez", 6, true);
        Paleta paletaCrema4 = new PaletaCrema("Mango", 6, true);

        Paleta paletaAgua1 = new PaletaAgua("Limón", 2, true);
        Paleta paletaAgua2 = new PaletaAgua("Uva", 2, true);
        Paleta paletaAgua3 = new PaletaAgua("Maruchan", 2, true);

        // Object lists for storing water palette and cream palette objects
        Paleta[] paletas = new Paleta[7];
        paletas[0] = paletaAgua1;
        paletas[1] = paletaAgua2;
        paletas[2] = paletaAgua3;
        paletas[3] = paletaCrema1;
        paletas[4] = paletaCrema2;
        paletas[5] = paletaCrema3;
        paletas[6] = paletaCrema4;

        // improved for loop to save creamy palettes
        System.out.println("---------------------------------------------------------");
        System.out.println("Lista de paletas");
        System.out.println("---------------------------------------------------------");
        try {
            for (int i = 0; i < 7; i++) {
                paletas[i].mostrarDatos();
                System.out.println();
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("El rango de índices es incorrecto");
            System.out.println("¡Error! " + e);
        }
        System.out.println("---------------------------------------------------------");
        System.out.println("Paleta de agua");
        paletaAgua1.eligeVasoOCono();
        System.out.println("Paleta de crema");
        paletaCrema1.eligeVasoOCono();
    }
}
