package Tareas.ClasesGenéricas.Ejercicio3;
import java.util.Scanner;
public class PaletaCrema extends Paleta {
    private boolean cremosa;
    Scanner entrada = new Scanner(System.in);
    public PaletaCrema(String sabor, double precio, boolean cremosa) {
        super(sabor, precio);
        this.cremosa = cremosa;
    }

    // get and set methods of each attribute
    public boolean isCremosa() {
        return cremosa;
    }

    public void setCremosa(boolean cremosa) {
        this.cremosa = cremosa;
    }

    // it shows with this method if the palette is cream or not
    public void mostrarTexturaCremosa() {
        System.out.println("¿Tiene textura cremosa?: " + cremosa);
    }

    // overridden method to print the object data
    @Override
    public void mostrarDatos() {
        System.out.printf("%-20s%-20s%-20s", "Sabor: " + sabor, "Precio:  " + precio, "Base Crema: " + true);
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
