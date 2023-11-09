package XML;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;

public class word {
    public static void main(String[] args) {
        XWPFDocument documento = new XWPFDocument();

        //Crear párrafo
        XWPFParagraph paragraph = documento.createParagraph();

        //Crear una run
        XWPFRun run = paragraph.createRun();

        //Agregar texto
        run.setText("Hola mundo");

        try {
            FileOutputStream outputStream = new FileOutputStream("EjemploWord.docx");
            documento.write(outputStream);
            outputStream.close();
            System.out.println("El documento se ha creado correctamente.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}