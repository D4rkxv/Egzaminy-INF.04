import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj numer PESEL");
        String PESEL = "55030101193";
        PESEL = sc.nextLine();
        PESEL.toCharArray();
        ObliczaniePESEL obliczaniePESEL = new ObliczaniePESEL();
        obliczaniePESEL.sprawdzPlec(PESEL);
        obliczaniePESEL.sprawdzZgodnoscNumeruPESEL(PESEL);
    }
}