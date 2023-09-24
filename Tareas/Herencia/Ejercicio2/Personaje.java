package Tareas.Herencia.Ejercicio2;

public class Personaje {
    protected String nombre;
    protected int nivel;

    public void atacar(){
        System.out.println(" \n-----> Mátenseeeeeeeeeee >:( <-----\n");
    }
    public Personaje(String nombre, int nivel) {
        this.nombre = nombre;
        this.nivel = nivel;
    }
    public Personaje(){
    }
    //get and set methods of each attribute of the parent class
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
