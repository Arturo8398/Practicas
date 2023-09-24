package Tareas.Herencia.Ejercicio3;

public class PaletaCrema extends Paleta{
    private boolean cremosa;

    public PaletaCrema(String sabor, double precio, boolean cremosa) {
        super(sabor, precio);
        this.cremosa = cremosa;
    }
    //get and set methods of each attribute
    public boolean isCremosa() {
        return cremosa;
    }

    public void setCremosa(boolean cremosa) {
        this.cremosa = cremosa;
    }
    //it shows with this method if the palette is cream or not
    public void mostrarTexturaCremosa(){
        System.out.println("¿Tiene textura cremosa?: " + cremosa);
    }
}
