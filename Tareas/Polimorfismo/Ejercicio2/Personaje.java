package Tareas.Polimorfismo.Ejercicio2;

public class Personaje {
    protected String nombre;
    protected int nivel;
    // Message
    public void atacar() {
        System.out.println(" \n-----> Mátenseeeeeeeeeee >:( <-----\n");
    }

    public Personaje(String nombre, int nivel) {
        this.nombre = nombre;
        this.nivel = nivel;
    }

    public Personaje() {
    }

    // own method of class Enemy
    public void gritar() {
        System.out.println("Ahhhhhhhh, vas a morir >:)");
    }

    // own method of class Player
    public void usarHabilidadEspecial() {
        System.out.println("Kame Hame Ha >:(");
    }

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

}
