package com.ejemplo;

// esta en esta dirección para que compile automáticamente
// src/main/java/com/ejemplo/ExcelColumnNames.java

// Importaciones necesarias para trabajar con archivos Excel usando Apache POI

import org.apache.poi.hssf.usermodel.HSSFWorkbook; // Para leer archivos .xls (Excel 97-2003)
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook; // Para leer archivos .xlsx (Excel 2007+)

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.File;                           // Representa un archivo en el sistema
import java.io.FileInputStream;                // Para leer datos del archivo
import java.io.IOException;

// Importaciones para la interfaz gráfica (JFileChooser) y manejo de archivos
/**
 * Clase principal que abre un cuadro de diálogo para seleccionar un archivo Excel,
 * lee la primera hoja y muestra los nombres de las columnas en la consola.
 */

public class ExcelColumnNames {

    // Metodo principal (punto de entrada de la aplicación)
    public static void main(String[] args) {
        // SwingUtilities.invokeLater asegura que la interfaz gráfica se ejecute en el hilo de eventos de Swing
        // Esto es importante para evitar problemas de concurrencia en interfaces gráficas
        SwingUtilities.invokeLater(() -> {
            // Creamos un objeto JFileChooser para que el usuario seleccione un archivo
            JFileChooser fileChooser = new JFileChooser();

            // Le ponemos un título a la ventana de selección
            fileChooser.setDialogTitle("Selecciona un archivo Excel");
            // Creamos un filtro para mostrar solo archivos con extensiones .xls y .xlsx
            FileNameExtensionFilter filter = new FileNameExtensionFilter(
                    "Archivos Excel (*.xls, *.xlsx)", "xls", "xlsx");
            fileChooser.setFileFilter(filter);

            // Mostramos la ventana de selección y guardamos la acción del usuario (si seleccionó o canceló)
            int result = fileChooser.showOpenDialog(null);

            // Si el usuario presionó "Abrir" (Aprobar)...
            if (result == JFileChooser.APPROVE_OPTION) {
                // Obtenemos el archivo seleccionado
                File selectedFile = fileChooser.getSelectedFile();
                try {
                    // Se llama al metodo que lee e imprime los nombres de las columnas
                    printColumnNames(selectedFile);
                } catch (IOException e) {
                    // Si ocurre un error al leer el archivo, se muestra un mensaje en una ventana emergente
                    JOptionPane.showMessageDialog(null,
                            "Error al leer el archivo: " + e.getMessage(),
                            "Error", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                // Si el usuario canceló o cerró la ventana sin seleccionar
                System.out.println("No se seleccionó ningún archivo.");
            }
        });
    }

    /**
     * Metodo que recibe un archivo Excel, lo abre, lee la primera hoja y
     * muestra en consola los nombres de las columnas (asumiendo que están en la primera fila).
     *
     * @param file El archivo Excel seleccionado por el usuario.
     * @throws IOException Si hay problemas al leer el archivo.
     */
    private static void printColumnNames(File file) throws IOException {
        // Obtenemos el nombre del archivo para determinar su extensión
        String fileName = file.getName();

        // Declaramos una variable Workbook (libro de trabajo) que será el objeto que representa el Excel
        Workbook workbook;

        // Usamos try-with-resources para asegurar que el FileInputStream se cierre automáticamente
        // (No necesitamos cerrar el stream manualmente con finally)
        try (FileInputStream fis = new FileInputStream(file)) {
            // Verificamos si el archivo termina en .xlsx (Excel moderno basado en XML)
            if (fileName.endsWith(".xlsx")) {
                // Si es .xlsx, creamos un libro de trabajo XSSFWorkbook (para Excel 2007+)
                workbook = new XSSFWorkbook(fis);
            }
            // Si no es .xlsx, verificamos si termina en .xls (Excel antiguo, formato binario)
            else if (fileName.endsWith(".xls")) {
                // Si es .xls, creamos un libro de trabajo HSSFWorkbook (para Excel 97-2003)
                workbook = new HSSFWorkbook(fis);
            }
            // Si la extensión no es reconocida, lanzamos una excepción
            else {
                throw new IllegalArgumentException("El archivo no tiene extensión .xls o .xlsx");
            }
        }
        // Nota: el try-with-resources cierra automáticamente 'fis' al salir del bloque,
        // pero 'workbook' aún está abierto. Lo cerraremos al final.

        // Obtenemos la primera hoja del libro (índice 0)
        // Las hojas en Excel se numeran desde 0
        Sheet sheet = workbook.getSheetAt(0);
        if (sheet == null) {
            // Si la hoja es nula (no existe), mostramos mensaje y cerramos el libro
            System.out.println("La hoja está vacía o no existe.");
            workbook.close(); // Cerramos el libro para liberar recursos
            return; // Salimos del metodo
        }

        // Obtenemos la primera fila de la hoja (fila 0)
        // Asumimos que en la fila 0 están los encabezados (nombres de columnas)
        Row headerRow = sheet.getRow(0);
        if (headerRow == null) {
            // Si no hay fila 0 (hoja vacía), mostramos mensaje y cerramos el libro
            System.out.println("No se encontró la fila de encabezados (fila 0).");
            workbook.close();
            return;
        }

        // Imprimimos un encabezado en la consola
        System.out.println("Nombres de las columnas (primera fila):");

        // Recorremos todas las celdas de la fila de encabezados
        // headerRow es un objeto Row que contiene celdas (Cell)
        for (Cell cell : headerRow) {
            // Obtenemos el valor de la celda como cadena de texto (String)
            String columnName = cell.getStringCellValue();
            // Imprimimos el nombre de la columna con un guion para mejor legibilidad
            System.out.println("- " + columnName);
        }

        // Cerramos el libro de trabajo para liberar los recursos (memoria y archivos)
        // Esto es importante para evitar fugas de memoria
        workbook.close();
    }
}