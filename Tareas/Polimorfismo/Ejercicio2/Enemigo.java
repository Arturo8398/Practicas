package Tareas.Polimorfismo.Ejercicio2;

public class Enemigo extends Personaje{
    private String tipo;

    public Enemigo(String nombre, int nivel, String tipo) {
        super(nombre, nivel);
        this.tipo = tipo;
    }

    //get and set methods of this class
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

}
