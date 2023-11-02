package Archivos.EjercicioClase;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class GuardarObjetos {
    public static void main(String[] args) {
        String nombreArchivo = "Mascotas.dat";
        ArrayList<Mascota> mascotas = new ArrayList<>();
        mascotas.add(new Mascota("Firulais", 5));
        mascotas.add(new Mascota("Scooby", 10));
        mascotas.add(new Mascota("Pluto", 3));
        mascotas.add(new Mascota("Snoopy", 7));
        mascotas.add(new Mascota("Goofy", 8));
        mascotas.add(new Mascota("Odie", 2));
        mascotas.add(new Mascota("Spike", 4));

        try {
            ObjectOutputStream entrada =  new ObjectOutputStream(new FileOutputStream(nombreArchivo));
            for (Mascota mascota : mascotas) {
                entrada.writeObject(mascota);
            }
            entrada.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        
    }
}
