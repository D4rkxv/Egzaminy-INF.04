import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Losowanie losowanie = new Losowanie();
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Ile kostek chcesz wyrzucić?(3 - 10)");
        int liczbaLosowan;
        liczbaLosowan = sc1.nextInt();
        losowanie.rzucajKosci(liczbaLosowan);
        Scanner sc2 = new Scanner(System.in);
          String zagrajPonownie;
      do {
          System.out.println("Jeszcze raz? (t / n)");
          zagrajPonownie = sc2.nextLine();
          if(zagrajPonownie.equals("t")) {
              losowanie.rzucajKosci(liczbaLosowan);
          }
      }while (zagrajPonownie.equals("t"));
    }
}