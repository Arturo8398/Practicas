package Tareas.Herencia.Ejercicio3;

public class Main {
    public static void main(String[] args) {
        //instances of class objects
        PaletaAgua paletaDeAgua = new PaletaAgua("Fresa", 5.6, true);
        PaletaCrema paletaDeCrema =  new PaletaCrema("Zarzamora",2.6, true);
        Paleta paleta1 = new Paleta();

        System.out.println("\n--> ¿Son de base agua o cremmosas? <--");
        paletaDeAgua.mostrarBaseAgua();
        paletaDeCrema.mostrarTexturaCremosa();

        //change prices
        if(paletaDeAgua.isBaseAgua() == true){
            paletaDeAgua.setPrecio(2);
        }
        if(paletaDeCrema.isCremosa() == true){
            paletaDeCrema.setPrecio(6);
        }

        System.out.println("\n--> Muestra los los dos sabores que hay <--");
        //display information for two palettes, one of each type
        System.out.println("---->Paleta de agua: ");
        paletaDeAgua.mostrarInformacion();
        System.out.println("\n---->Paleta cremosa: ");
        paletaDeCrema.mostrarInformacion();

        System.out.println("\n--> Función para agregar un nuevo sabor <--");
        paleta1.agregarSabor();

        System.out.println("\n--> Función para 'Comprar paletas' <--");
        paleta1.comprarPaletas();

    }
}
