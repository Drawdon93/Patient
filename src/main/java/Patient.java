import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigInteger;

@Data
@AllArgsConstructor
public class Patient {
    private String name;
    private String surname;
   // private BigInteger pesel;
    private String pesel;

}
//Zadanie Rejestracja
//Napisać klasę Patient zawierającą podstawę dane o pacjencie: imię i nazwiskooraz numer PESEL.
// Stworzyć możliwość rejestracji z metodą zwracającą pacjenta o
//podanym numerze PESEL.
//Stworzyć przykładowe dane i przykładowe użycie z
// uwzględnieniem przypadku
//gdy szukanego pacjenta nie ma zarejestrowanego.
//Użyć Lomboka oraz projekt wrzucić na GitHubie.