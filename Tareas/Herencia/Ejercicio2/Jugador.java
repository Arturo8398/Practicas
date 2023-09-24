package Tareas.Herencia.Ejercicio2;
public class Jugador extends Personaje{
    private String clase;

    public Jugador(String nombre, int nivel, String clase) {
        super(nombre, nivel);
        this.clase = clase;
    }

    //own method of this class
    public void usarHabilidadEspecial(){
        System.out.println("Kame Hame Ha >:(");
    }
    //get and set methods of this class
    public String getClase() {
        return clase;
    }
    public void setClase(String clase) {
        this.clase = clase;
    }
}
