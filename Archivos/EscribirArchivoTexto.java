package Archivos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class EscribirArchivoTexto {
    public static void main(String[] args) {
        String nombreArchivo = "archivo_salida.txt";
        try {
            FileWriter archivo = new FileWriter(nombreArchivo);
            BufferedWriter escritor = new BufferedWriter(archivo);
            escritor.write("Hola mundo");
            escritor.newLine(); // Salto de línea
            escritor.write("Adiós mundo");
            escritor.close();
        } catch (IOException e) {

        }
    }
}
