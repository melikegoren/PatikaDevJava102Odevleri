package com.patikadev;

public class Main {

    public static void main(String[] args) {
        MyList<Integer> liste = new MyList<>();
        System.out.println("Dizideki Eleman Sayısı : " + liste.size());
        System.out.println("Dizinin Kapasitesi : " + liste.getCapacity());
        liste.add(10);
        liste.add(20);
        liste.add(30);
        liste.add(40);
        System.out.println("Dizideki Eleman Sayısı : " + liste.size());
        System.out.println("Dizinin Kapasitesi : " + liste.getCapacity());
        liste.add(50);
        liste.add(60);
        liste.add(70);
        liste.add(80);
        liste.add(90);
        liste.add(100);
        liste.add(110);
        System.out.println("Dizideki Eleman Sayısı : " + liste.size());
        System.out.println("Dizinin Kapasitesi : " + liste.getCapacity());
        MyList<Integer> liste1 = new MyList<>();
        System.out.println("Liste Durumu : " + (liste.isEmptyy() ? "Boş" : "Dolu"));
        liste1.add(10);
        liste1.add(20);
        liste1.add(30);
        liste1.add(40);
        liste1.add(20);
        liste1.add(50);
        liste1.add(60);
        liste1.add(70);

        System.out.println("Liste Durumu : " + (liste1.isEmptyy() ? "Boş" : "Dolu"));

        // Bulduğu ilk indeksi verir
        System.out.println("Indeks : " + liste1.indexOf(20));

        // Bulamazsa -1 döndürür
        System.out.println("Indeks :" + liste1.indexOf(100));

        // Bulduğu son indeksi verir
        System.out.println("Indeks : " + liste1.lastIndexOf(20));

        // Listeyi Object[] dizisi olarak geri verir.
        Object[] dizi = liste.toArray();
        System.out.println("Object dizisinin ilk elemanı :" + dizi[0]);

        // Liste veri türünde alt bir liste oluşturdu
        MyList<Integer> altListem = liste.subList(0, 3);
        altListem.toStringg();

        // Değerim listedeki olup olmadığını sorguladı
        System.out.println("Listemde 20 değeri : " + liste.contains(20));
        System.out.println("Listemde 120 değeri : " + liste.contains(120));

        // Listeyi tamamen boşaltır ve varsayılan boyutuna çevirir
        liste.clear();
        liste.toStringg();

        System.out.println();
        System.out.println();


        MyList<Integer> liste2 = new MyList<>();
        liste2.add(10);
        liste2.add(20);
        liste2.add(30);
        System.out.println("2. indisteki değer : " + liste2.get(2));
        liste2.add(40);
        liste2.remove(1);
        liste2.set(0, 100);
        System.out.println("2. indisteki değer : " + liste2.get(2));
        liste2.toStringg();

    }

}
