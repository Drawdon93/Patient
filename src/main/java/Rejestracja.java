import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Rejestracja {

        private static final String FILE_NAME = "src/main/resources/Excel.xlsx";

        public static void main(String[] args) {
            List<Patient> patientList = new ArrayList<>();
            try {
                FileInputStream excelFile = new FileInputStream(new File(FILE_NAME));
                XSSFWorkbook workbook = new XSSFWorkbook(excelFile);
                XSSFSheet datatypeSheet = workbook.getSheetAt(workbook.getNumberOfSheets() - 1);
                for (int i = 1; i < datatypeSheet.getPhysicalNumberOfRows(); i++) {
                    Row currentRow = datatypeSheet.getRow(i);
                    patientList.add(new Patient(currentRow.getCell(0).toString(), currentRow.getCell(1).toString(), currentRow.getCell(2).toString()));
               /* for (int j = 0; j < currentRow.getPhysicalNumberOfCells(); j++) {
                    System.out.println(currentRow.getCell(j));
                }*/
                } }
            catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println(patientList);
        }
    }
