package Tareas.ClasesGenéricas.Ejercicio3;

import java.util.Scanner;

public class PaletaAgua extends Paleta {
    private boolean baseAgua;
    Scanner entrada = new Scanner(System.in);
    public PaletaAgua(String sabor, double precio, boolean baseAgua) {
        super(sabor, precio);
        this.baseAgua = baseAgua;
    }

    // get and set methods of each attribute
    public boolean isBaseAgua() {
        return baseAgua;
    }

    public void setBaseAgua(boolean baseAgua) {
        this.baseAgua = baseAgua;
    }

    // It shows with this method if the palette is made of water or not
    public void mostrarBaseAgua() {
        System.out.println("¿Tiene base de agua?: " + baseAgua);
    }

    // overridden method to print the object data
    @Override
    public void mostrarDatos() {
        System.out.printf("%-20s%-20s%-20s", "Sabor: " + sabor, "Precio:  " + precio, "Base agua: " + true);
    }

    @Override
    public void eligeVasoOCono() {
        int opcion;
        System.out.println("Quieres en vaso o en cono");
        System.out.println("1. Vaso");
        System.out.println("2. Cono");
        opcion = entrada.nextInt();
        if(opcion == 1){
            System.out.println("Quieres helado en vaso");
        }else{
            System.out.println("Quieres helado en cono");
        }
    }
}
