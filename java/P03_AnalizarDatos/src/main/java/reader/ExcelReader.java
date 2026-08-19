package reader;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ExcelReader {

    public Workbook openFile(String filePath) {

        try {
            FileInputStream file = new FileInputStream(filePath);
            Workbook workbook = new XSSFWorkbook(file);
            return workbook;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}