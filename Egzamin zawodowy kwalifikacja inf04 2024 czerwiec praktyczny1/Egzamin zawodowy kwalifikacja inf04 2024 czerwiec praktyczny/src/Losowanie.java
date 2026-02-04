import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Losowanie {
    public void rzucajKosci(int ilosc){
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        while(!(ilosc >= 3 && ilosc  <= 10)) {
            System.out.println("Ile kostek chcesz wyrzucić?(3 - 10)");
            ilosc = sc.nextInt();
        }
        int sumaPunktów = 0;
        int[] tablicaLosowan = new int[ilosc];
        ArrayList<Integer> listaLosowan = new  ArrayList<>();
        for(int i = 1; i<=ilosc; i++){
            int losowana = rand.nextInt(1,7);
            System.out.println("Kostka " + i + " " + losowana);
            tablicaLosowan[i -1 ] += losowana;
            listaLosowan.add(losowana);
        }
        Arrays.sort(tablicaLosowan);
        for(int i = 0; i < tablicaLosowan.length; i++){
            for(int j = 1; j <= tablicaLosowan.length - 1; j++){
                if(tablicaLosowan[i] == tablicaLosowan[j]){
                    if(i > 0 && tablicaLosowan[i - 1] == tablicaLosowan[j]){
                        sumaPunktów += tablicaLosowan[j];
                        i++;
                        continue;
                    }
                    sumaPunktów += tablicaLosowan[i] + tablicaLosowan[j];
                    i++;
                }else {
                    sumaPunktów += 0;
                    i++;
                }

            }
        }
        System.out.println(sumaPunktów);
    }
}
