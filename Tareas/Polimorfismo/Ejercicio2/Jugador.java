package Tareas.Polimorfismo.Ejercicio2;

public class Jugador extends Personaje{
    private String clase;

    public Jugador(String nombre, int nivel, String clase) {
        super(nombre, nivel);
        this.clase = clase;
    }
    //get and set methods of this class
    public String getClase() {
        return clase;
    }
    public void setClase(String clase) {
        this.clase = clase;
    }

}
