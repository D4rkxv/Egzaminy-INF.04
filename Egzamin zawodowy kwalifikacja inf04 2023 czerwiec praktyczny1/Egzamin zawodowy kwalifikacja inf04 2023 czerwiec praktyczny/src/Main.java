public class Main {
    public static void wypelnijTablice(boolean[] tablica){
        int n = 100;
        for (int i = 2; i < n+1; i++){
            tablica[i] = true;

        }
    }

    public static void main(String[] args) {
        int n = 100;
        boolean[] tablica = new boolean[n+1];
        wypelnijTablice(tablica);
        for(int i = 2; i <= Math.sqrt(n); i++){
            if (tablica[i] == true){
                for (int j = 2 * i; j <= n; j += i){
                    tablica[j] = false;
                }
            }
        }
        for (int i = 1; i <= n; i++){
            if (tablica[i] == true){
                System.out.printf(i + ", ");
            }
        }
    }
}