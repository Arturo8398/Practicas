package Archivos;

import java.io.FileInputStream;
import java.io.IOException;

public class LeerArchivoObjeto {
    public static void main(String[] args) {
        String nombreArchivo = "archivo.bin";
        try {
            FileInputStream entrada = new FileInputStream(nombreArchivo);
            int byteLeido;

            while((byteLeido = entrada.read()) != -1){
                System.out.println(byteLeido + " ");

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
