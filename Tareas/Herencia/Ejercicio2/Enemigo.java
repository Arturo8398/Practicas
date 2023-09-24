package Tareas.Herencia.Ejercicio2;

public class Enemigo extends Personaje{
    private String tipo;

    public Enemigo(String nombre, int nivel, String tipo) {
        super(nombre, nivel);
        this.tipo = tipo;
    }

    //own method of this class
    public void gritar(){
        System.out.println("Ahhhhhhhh, vas a morir >:)");
    }

    //get and set methods of this class
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

}
