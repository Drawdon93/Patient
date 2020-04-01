import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class Main {
    private static final String FILE_NAME = "src/main/resources/Excel.xlsx";

    public static void main(String[] args) {
        List<Patient> patientList= new ArrayList<>();
        patientList.add(new Patient("Patryk","Trybuch",("355555558")));
        patientList.add(new Patient("Jan","Kowalski",("314044210")));
        patientList.add(new Patient("Ania","Kuk",("910640277")));

        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("Patient");
       creatingDaneExel(sheet,patientList);
        try {
            FileOutputStream outputStream = new FileOutputStream(FILE_NAME);
            workbook.write(outputStream);
            workbook.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Finish");
    }

    private static void creatingDaneExel(XSSFSheet sheet, List<Patient> patientList) {
        int rowNum = 0;
        Row row = sheet.createRow(rowNum++);
        row.createCell(0).setCellValue("Imię");
        row.createCell(1).setCellValue("Nazwisko");
        row.createCell(2).setCellValue("PESEL");
        for (Patient employee : patientList) {
            row = sheet.createRow(rowNum++);
            row.createCell(0).setCellValue(employee.getName());
            row.createCell(1).setCellValue(employee.getSurname());
            row.createCell(2).setCellValue(employee.getPesel().toString());
        }
    }




    }
