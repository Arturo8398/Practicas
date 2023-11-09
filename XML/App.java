package XML;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class App {
    public static void main(String[] args) {
        Workbook workbook = new XSSFWorkbook(); // Crear un nuevo libro de trabajo
        // Crear una hoja en el libro de trabajo
        Sheet sheet = workbook.createSheet("Hoja1");
        // Crear una fila en la hoja
        Row row = sheet.createRow(0);
        // Crear una celda en la fila
        Cell cell1 = row.createCell(0);
        cell1.setCellValue("Hola Mundo"); // Establecer el valor de la celda
        Cell cell2 = row.createCell(1);
        cell2.setCellValue(123); // Establecer el valor de la celda
        Cell cell3 = row.createCell(2);
        cell3.setCellValue(true); // Establecer el valor de la celda
        Cell cell4 = row.createCell(3);
        cell4.setCellValue(123.456); // Establecer el valor de la celda
        Row row2 = sheet.createRow(1);
        Cell cell5 = row2.createCell(0);
        cell5.setCellValue("Adiós Mundo"); // Establecer el valor de la celda
        Cell cell6 = row2.createCell(1);
        cell6.setCellValue(456); // Establecer el valor de la celda
        try {
            // Guardar el libro de trabajo en un archivo
            FileOutputStream fos = new FileOutputStream("nuevo_archivo.xlsx");
            workbook.write(fos);
            fos.close();
            System.out.println("Archivo Excel creado correctamente.");
            workbook.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}