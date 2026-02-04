import java.util.Scanner;

public class Main {
    public static int szukajNWD(int a, int b) {
        while(a != b){
            if(a > b){
                a = a-b;
            }else {
                b = b-a;
            }
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println("Podaj a");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Podaj b");
        int b = sc.nextInt();
        System.out.println("NWD:" + szukajNWD(a,b));
    }
}