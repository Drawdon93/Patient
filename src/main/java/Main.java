import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static final String FILE_NAME = "src/main/resources/Excel.xlsx";

    public static void main(String[] args) {
        List<Patient> patientList= new ArrayList<>();
        patientList.add(new Patient("Patryk","Trybuch",new BigInteger("99087666341")));
        patientList.add(new Patient("Jan","Kowalski",new BigInteger("314044210")));
        patientList.add(new Patient("Ania","Kuk",new BigInteger("910640277")));

        ApachePOIExcelWrite apachePOIExcelWrite = new ApachePOIExcelWrite();

        apachePOIExcelWrite.createExcel(patientList);

        PatientService patientService = new PatientService(patientList);

        System.out.println(patientService.isRegistered(new BigInteger("99087666341"))); // true
        System.out.println(patientService.isRegistered(new BigInteger("123"))); // false        System.out.println(patientService.isRegistered("Asd", "Asd")); //false
        System.out.println(patientService.isRegistered("Jan", "Kowalski")); //true        System.out.println("-------------------------------");
        Patient patient1 = new Patient("Test", "Kowalski", new BigInteger("82345678910"));
        System.out.println(patientService.isRegistered("Test", "Kowalski")); //false
        patientList.add(patient1);
        apachePOIExcelWrite.createExcel(patientList);
        System.out.println(patientService.isRegistered("Test", "Kowalski")); //false
        System.out.println("///////////////");

            Scanner scan = new Scanner(System.in);
            System.out.println("Witam na recepcji");
            String firstcase = scan.nextLine();

            
        switch(new int[firstcase]){
            case 1:
                System.out.println("jakieś_instrukcje_1");
                break;
            case 2:
                System.out.println("jakieś_instrukcje_2");
                break;
                case 3:
                System.out.println("jakieś_instrukcje_3");
                break;

            default:
                return;
        }
            System.out.println("Witaj " );


    }


    }

