void main() {
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    HashSet<Integer> losowania = new HashSet<>();
    ArrayList<HashSet> wylosowaneTablice = new ArrayList<>();
    ArrayList<Integer> tablicaLiczbyWystapien = new ArrayList<>();
    int iloscLosowan = 0;
    int j = 0;

    System.out.println("Ile wygenerować losowań?");
    iloscLosowan = scanner.nextInt();

    for (int i = 1; i <= iloscLosowan; i++) {
        while (losowania.size() < 6) {
            int liczba = random.nextInt(1,50);
            losowania.add(liczba);
        }
        wylosowaneTablice.add((HashSet) losowania.clone());
        System.out.println("Losowanie " + i + ": " + losowania);
        losowania.clear();
    }
    for(HashSet hashSet: wylosowaneTablice){
        tablicaLiczbyWystapien.addAll(hashSet);
    }
        System.out.println(wylosowaneTablice);
        System.out.println(tablicaLiczbyWystapien);
    for (int i = 1; i <= 49; i++) {
        int freq = Collections.frequency(tablicaLiczbyWystapien, i);
        System.out.println("Liczba wystąpień: " + i + ": "  + freq);
    }
}