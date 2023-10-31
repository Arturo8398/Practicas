package Archivos;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class LeerArchivoObjetos {
    public static void main(String[] args) {
        String nombreArchivo = "objeto.dat";
        try {
            ObjectInputStream entrada = new ObjectInputStream(new FileInputStream(nombreArchivo));
            Mascota m1 = (Mascota) entrada.readObject();
            System.out.println("Nombre: " + m1.getNombre());
            System.out.println("Edad: " + m1.getEdad());
            entrada.close();
        } catch (IOException |ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
