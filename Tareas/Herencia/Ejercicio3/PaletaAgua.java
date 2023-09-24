package Tareas.Herencia.Ejercicio3;

public class PaletaAgua extends Paleta{
    private boolean baseAgua;

    public PaletaAgua(String sabor, double precio, boolean baseAgua) {
        super(sabor, precio);
        this.baseAgua = baseAgua;
    }
    //get and set methods of each attribute
    public boolean isBaseAgua() {
        return baseAgua;
    }

    public void setBaseAgua(boolean baseAgua) {
        this.baseAgua = baseAgua;
    }
    //It shows with this method if the palette is made of water or not
    public void mostrarBaseAgua(){
        System.out.println("¿Tiene base de agua?: " + baseAgua);
    }
}
