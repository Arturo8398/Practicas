package Tareas.ClasesGenéricas.Ejercicio2;

public class Jugador extends Personaje {
    private String jugador;
    private int nivel;
    private String tipo;
    public Jugador(String jugador, int nivel, String tipo) {
        this.jugador = jugador;
        this.nivel = nivel;
        this.tipo = tipo;
    }
    public Jugador(){

    }
    @Override
    public void gritar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'gritar'");
    }
    @Override
    public void usarHabilidadEspecial() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'usarHabilidadEspecial'");
    }
    @Override
    public String toString() {
        return "- Nombre " + jugador + "\n- Nivel " + nivel + "\n- Tipo " + tipo;
    }
    
}
