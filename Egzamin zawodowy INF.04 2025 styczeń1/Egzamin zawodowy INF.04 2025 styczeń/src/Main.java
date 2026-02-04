import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {
        int[] tablicaInt = new int[1000];
        Tablica tablica = new Tablica(tablicaInt);
        tablica.wypiszIndexIWartosc();
        System.out.println(tablica.szukajPierwszeWystapienie(797));
        System.out.println("Liczby nieparzyste");
        tablica.szukajILiczNieparzyste();
        System.out.println("Średnia arytmetyczna wszystkich elementów: " + tablica.LiczSredniaArytmetyczna());
    }
}