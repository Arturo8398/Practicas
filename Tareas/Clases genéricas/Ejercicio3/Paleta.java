package Tareas.ClasesInterfaces.Ejercicio3;

import java.util.Scanner;

public abstract class Paleta implements ElegirVoC{
    protected String sabor;
    protected double precio;
    static Scanner entrada = new Scanner(System.in);

    public Paleta(String sabor, double precio) {
        this.sabor = sabor;
        this.precio = precio;
    }

    // get and set methods of each attribute
    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    // method to display the data of the palettes on the screen
    public void mostrarInformacion() {
        System.out.println("Sabor: " + sabor);
        System.out.println("Precio: " + precio);
    }

    public void agregarSabor() {
        int opcion, opcionSabor;
        String saborCrema, saborAgua;
        // A functionality that I added was to add a new flavor
        System.out.println("¿Quieres agregar un nuevo sabor?");
        System.out.println("1. Si");
        System.out.println("2. No");
        opcion = entrada.nextInt();
        // with conditional you choose what type of flavor you want to add
        if (opcion == 1) {
            System.out.println("¿El sabor es cremoso o a base de agua?");
            System.out.println("1. Cremoso");
            System.out.println("2. Base de agua");
            opcionSabor = entrada.nextInt();
            if (opcionSabor == 1) {
                entrada.nextLine();
                System.out.print("Escribe el nuevo sabor: ");
                saborCrema = entrada.nextLine();
                Paleta paletaNueva = new PaletaCrema(saborCrema, 6, true);
                System.out.println("-->Sabor agregado<--");
                paletaNueva.mostrarInformacion();
            } else {
                entrada.nextLine();
                System.out.print("Escribe el nuevo sabor: ");
                saborAgua = entrada.nextLine();
                Paleta paletaNueva = new PaletaAgua(saborAgua, 2, true);
                System.out.println("-->Agregando sabor<--");
                paletaNueva.mostrarInformacion();
            }
        } else {
            System.out.println("Adiós");
        }
    }

    // function to "buy pallets"
    public void comprarPaletas() throws RuntimeException {
        int cantidadCrema, cantidadAgua;
        PaletaAgua paletaDeAgua = new PaletaAgua("Fresa", 5.6, true);
        PaletaCrema paletaDeCrema = new PaletaCrema("Zarzamora", 2.6, true);
        // change prices
        if (paletaDeAgua.isBaseAgua() == true) {
            paletaDeAgua.setPrecio(2);
        }
        if (paletaDeCrema.isCremosa() == true) {
            paletaDeCrema.setPrecio(6);
        }
        // The second functionality that I put is to buy palettes and give the total
        System.out.print("¿Cuántas paletas de crema quieres comprar?: ");
        cantidadCrema = entrada.nextInt();
        System.out.print("¿Cuántas paletas de agua quieres comprar?: ");
        cantidadAgua = entrada.nextInt();

        if (cantidadAgua <= 0 || cantidadCrema <= 0) {
            throw new RuntimeException();
        } else {
            System.out.println("El precio total es de: $"
                    + (paletaDeAgua.getPrecio() * cantidadAgua + paletaDeCrema.getPrecio() * cantidadCrema));
        }
    }

    // method to override in child classes
    abstract void mostrarDatos();
}
