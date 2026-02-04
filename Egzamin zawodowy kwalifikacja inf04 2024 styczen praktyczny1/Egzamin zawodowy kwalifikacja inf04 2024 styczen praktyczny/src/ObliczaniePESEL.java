public class ObliczaniePESEL {
    public void sprawdzPlec(String PESEL){
        int plec = PESEL.charAt(9);
        if(plec % 2 == 0){
            System.out.println("Kobieta");
        }else{
            System.out.println("Mężczyzna");
        }
    }
    public void sprawdzZgodnoscNumeruPESEL(String PESEL){
        int[] tablicaPesel = new int[11];
        for(int i = 0; i < tablicaPesel.length; i++){
            tablicaPesel[i] = PESEL.charAt(i) - 48;
        }
        int S = (tablicaPesel[0] * 1) +  (tablicaPesel[1] * 3) + (tablicaPesel[2] * 7)  + (tablicaPesel[3] * 9) + (tablicaPesel[4] * 1 ) +( tablicaPesel[5] * 3) +  (tablicaPesel[6] * 7) +  (tablicaPesel[7] * 9 ) +( tablicaPesel[8] *1) + (tablicaPesel[9] * 3);
        int M = S % 10;
        int R = 10 - M;

        if(R == tablicaPesel[10]){
            System.out.println("PESEL zgodny");
        }else {
            System.out.println("PESEL niezgodny!");
        }
    }
}
