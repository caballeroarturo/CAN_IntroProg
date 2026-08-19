package app;

import file.FileChooser;
import model.ApplicationState;
import reader.ExcelReader;
import util.Console;

public class Application {

    private ApplicationState state = new ApplicationState();
    public void start() {

        Console console = new Console();
        ExcelReader excelReader = new ExcelReader();
        FileChooser fileChooser = new FileChooser();
        console.showWelcome();


        int option = -1;
        do {
            console.showMenu();
            option = console.readOption();

            switch(option){

                case 1:
                    state.setFilePath(fileChooser.selectFile());
                    if (state.getFilePath() != null) {
                        state.setWorkbook(
                                excelReader.openFile(state.getFilePath())
                        );
                        if (state.getWorkbook() != null) {
                            console.showWorkbookInfo(state.getWorkbook());
                        }
                    }
                    break;

                case 2:
                    if (state.getWorkbook() == null) {
                        console.showNoFileOpened();
                    } else {
                        console.showWorkbookInfo(state.getWorkbook());
                    }
                    break;

                case 3:
                    System.out.println("Elegiste la opción: " + option);
                    break;

                case 4:
                    System.out.println("Elegiste la opción: " + option);
                    break;

                case 5:
                    System.out.println("Elegiste la opción: " + option);
                    break;

                case 6:
                    System.out.println("Elegiste la opción: " + option);
                    break;

                case 0:
                    console.showExitMessage();
                    break;
                default:
                    console.showInvalidOption();
            }
        } while (option != 0);


    }
}