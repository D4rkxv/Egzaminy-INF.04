import java.lang.reflect.Array;
import java.util.Random;

public class Tablica {
    private int[] tablica;

    public Tablica(int[] tablica) {
        this.tablica = tablica;
        for (int i = 0; i < tablica.length; i++) {
            Random rand = new Random();
            tablica[i] = rand.nextInt(0,1001);
        }
    }

    public int[] getTablica() {
        return tablica;
    }

    public void setTablica(int[] tablica) {
        this.tablica = tablica;
    }

    public void wypiszIndexIWartosc() {
        for (int i = 0; i < getTablica().length; i++) {
            System.out.println(i + ":" + tablica[i]);
        }
    }
    public int szukajPierwszeWystapienie(int szukana){
        int index = -1;
        for (int i = 0; i < tablica.length; i++) {
            if (tablica[i] == szukana){
                index = i;
                break;
            }
        }
        return index;
    }
    public void szukajILiczNieparzyste() {
        int suma = 0;
        for (int i = 0; i < tablica.length; i++){
            if(tablica[i] % 2 != 0){
                suma++;
                System.out.println(tablica[i]);
            }
        }
        System.out.println("Razem nieparzystych " + suma);
    }
    public int LiczSredniaArytmetyczna() {
        int srednia = 0;
        for(int i = 0; i < tablica.length; i++){
            srednia += tablica[i];
        }
        srednia /= tablica.length;
        return srednia;
    }
}
