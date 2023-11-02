package Archivos.EjercicioClase;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class LeerMascotas {
    public static void main(String[] args) {
        String nombreArchivo =  "Mascotas.dat";
        ArrayList<Mascota> mascotas = new ArrayList<>();

        try {
            ObjectInputStream salida = new ObjectInputStream(new FileInputStream(nombreArchivo));
            for (int i = 0; i < 5; i++) {
                mascotas.add((Mascota) salida.readObject());
            }
            salida.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        recorrerArrayL(mascotas);
    }
    public static void recorrerArrayL(ArrayList<Mascota> mascotas){
        for (Mascota mascota : mascotas) {
            System.out.println("Nombre: " + mascota.getNombre());
            System.out.println("Edad: " + mascota.getEdad());
            System.out.println();
        }
    }
}
