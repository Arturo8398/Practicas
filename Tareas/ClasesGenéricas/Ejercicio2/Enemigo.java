package Tareas.ClasesGenéricas.Ejercicio2;

public class Enemigo extends Personaje {
    private String tipo;

    public Enemigo(String nombre, int nivel, String tipo) {
        super(nombre, nivel);
        this.tipo = tipo;
    }

    public Enemigo() {
    }
    

    @Override
    void usarHabilidadEspecial() {
        System.out.println("Kame Hame Ha >:(");
    }
    @Override
    public String toString() {
        return "- Nombre " + nombre + "\n- Nivel " + nivel + "\n- Tipo " + tipo;
    }

    @Override
    public void gritar() {
        System.out.println("Ahhhhhhhh, vas a morir >:)");
    }

}
