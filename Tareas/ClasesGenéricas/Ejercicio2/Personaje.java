package Tareas.ClasesGenéricas.Ejercicio2;

public abstract class Personaje implements Habilidades{
    protected String nombre;
    protected int nivel;

    // Message
    public void atacar() throws RuntimeException {
        if (nivel < 5) {
            throw new RuntimeException();
        } else {
            System.out.println(" \nIniciando ataque...\n");
        }
    }

    public Personaje(String nombre, int nivel) {
        this.nombre = nombre;
        this.nivel = nivel;
    }

    public Personaje() {
    }
    // own method of class Player
    abstract void usarHabilidadEspecial();

    // get and set methods of each attribute of the parent class
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    @Override
    public String toString() {
        return "Personaje [nombre=" + nombre + ", nivel=" + nivel + "]";
    }

}
