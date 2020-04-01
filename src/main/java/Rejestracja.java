import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

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
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


        Scanner scan = new Scanner(System.in);
        System.out.println("Sprawdź czy PESEL jest w bazie");
        for (Patient one : patientList) {
            if (one.getPesel().equals(scan)) ;
          //  System.out.println("Pacjent " + one + " jest zarejestrowany");
        }

        //String firstName = scan.nextLine();

        //no i git śmiga
        boolean jestZarejestrowany = false;
        System.out.println("S------");//pesel nie miał by
        for (Patient one : patientList) {
            if (one.getPesel().equals("355555558")) {
                jestZarejestrowany = true;
            }
        }

        System.out.println("355555558" + jestZarejestrowany);

        boolean jestZarejestrowany2 = false;
        System.out.println("S------");//pesel nie miał by
        for (Patient one : patientList) {
            if (one.getPesel().equals("111111")) {// takl mówiłęm że mają być dwa porównanai jedno po peselu drugie po imieniu i nazwisku .ok. a git ?
                
                jestZarejestrowany2 = true;
            }
        }
        //jakieś pytania? masz iteracje po liście która sprawdza, zmienna boolean przechowuje wartośćczy znalazł dopasowanie ,a sprawdzanie po peselu samym?

        System.out.println("111111" + jestZarejestrowany2);

        System.out.println(patientList);
    }
}
