package Archivos;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class EscribirArchivoObjeto {
    public static void main(String[] args) {
        String nombreArchivo = "objeto.dat";

        try {
            ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream(nombreArchivo));
            Mascota hercules = new Mascota("Hercules", 2);
            salida.writeObject(hercules);
            salida.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
