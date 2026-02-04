import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Podaj liczbe losowan");
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> hashSet = new HashSet<>();
        ArrayList<HashSet> arraylist = new ArrayList<>();
        int losowania = sc.nextInt();
        for(int i = 1; i <= losowania; i++){
            for(int j = 0; j < 6; j++){
                Random rand = new Random();
                int liczba = rand.nextInt(0,50);
                hashSet.add(liczba);
            }
            arraylist.add((HashSet) hashSet.clone());
            System.out.println("losowanie nr " + i + hashSet);
            hashSet.clear();
        }
        ArrayList<Integer> arraylist1 = new ArrayList<>();
        for(HashSet set: arraylist){
            arraylist1.addAll(set);
        }
        for (int num = 1; num < 50; num++) {
            //arraylist1, num -> Array , Searched
            int count = Collections.frequency(arraylist1, num);
            if (count > 0) {
                System.out.println("Wystąpienia liczby: " + num + " " + count);
            } else {
                System.out.println("Wystąpienia liczby: " + num + " " + count);
            }
        }

    }
}