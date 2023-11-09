package XML;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;

public class LeerDocumentoWord {
    public static void main(String[] args) {
        try {
            // Cargar el archivo de Word
            FileInputStream fis = new FileInputStream(new File("EjemploWord.docx"));
            XWPFDocument document = new XWPFDocument(fis);

            // Recorrer los párrafos y runs para obtener el contenido del documento
            for (XWPFParagraph paragraph : document.getParagraphs()) {
                for (XWPFRun run : paragraph.getRuns()) {
                    String text = run.getText(0);
                    if (text != null && !text.isEmpty()) {
                        System.out.println(text);
                    }
                }
            }

            // Cerrar el flujo de entrada
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

