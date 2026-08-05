package model;

import org.apache.poi.ss.usermodel.Workbook;

public class ApplicationState {

    private String filePath;
    private Workbook workbook;

    /* se hace con alt + insert*/
    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public Workbook getWorkbook() {
        return workbook;
    }

    public void setWorkbook(Workbook workbook) {
        this.workbook = workbook;
    }
}