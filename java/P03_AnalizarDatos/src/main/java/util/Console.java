package util;

import model.ApplicationState;
import org.apache.poi.ss.usermodel.Workbook;

import java.util.Scanner;

public class Console {

    public void showWelcome() {

        System.out.println("====================================");
        System.out.println("        DATA ANALYZER v1.0");
        System.out.println("====================================");
        System.out.println();

    }

    public void showMenu() {

        System.out.println("1. Abrir archivo Excel \uD83D\uDCC2");
        System.out.println("2. Ver hojas \uD83D\uDCD1");
        System.out.println("3. Mostrar columnas \uD83D\uDE01");
        System.out.println("4. Estadísticas \uD83D\uDCCA");
        System.out.println("5. Filtrar datos \uD83D\uDD0D");
        System.out.println("6. Exportar resultados \uD83D\uDCBE");
        System.out.println("0. Salir \uD83D\uDEAA");
        System.out.println();

    }

    public int readOption() {
        /* No se usa void en el metodo porque el metodo necesita devolver
         un valor (int) al codigo que lo llamo, y void dice que el metodo
          no necesita devolver ningun valor*/

        //Crea un objeto que sabe leer desde el teclado.//
        Scanner scanner = new Scanner(System.in);

        //Muestra el mensaje sin hacer un salto de línea//
        System.out.print("Seleccione una opción: ");

        //Lee un numero entero que escribe el usuario y lo guarda en la variable option.//
        int option = scanner.nextInt();

        //Devuelve ese número al lugar desde donde se llamo el metodo//
        return option;

    }
    public void showInvalidOption() {

        System.out.println("----------------------------");
        System.out.println("    Opción inválida");
        System.out.println("----------------------------");

    }

    public void showExitMessage() {

        System.out.println("----------------------------");
        System.out.println("Se termina la sesión.");
        System.out.println("----------------------------");
    }

    public void showWorkbookInfo(Workbook workbook) {

        System.out.println();
        System.out.println("Libro abierto correctamente.");
        System.out.println();

        System.out.println("Número de hojas: " + workbook.getNumberOfSheets());

        for (int i = 0; i < workbook.getNumberOfSheets(); i++) {
            System.out.println(workbook.getSheetName(i));
        }
    }

    public void showNoFileOpened() {

        System.out.println("--------------------------------");
        System.out.println("No hay ningún archivo abierto.");
        System.out.println("Seleccione primero la opción 1.");
        System.out.println("--------------------------------");

    }
    public void showStatus(ApplicationState state) {

        System.out.println("====================================");
        System.out.println("      DATA ANALYZER v1.0");
        System.out.println("====================================");

        if(state.getFilePath() == null){
            System.out.println("Archivo: Ninguno");
        }else{
            System.out.println("Archivo: " + state.getFilePath());
        }
        System.out.println();

    }
}