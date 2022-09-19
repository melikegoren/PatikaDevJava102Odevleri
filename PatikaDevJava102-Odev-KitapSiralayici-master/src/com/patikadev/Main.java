package com.patikadev;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        TreeSet<Book> bookSet = new TreeSet<Book>();
        Book b1 = new Book("Cthulhunun Çağrısı",218);
        Book b2 = new Book("Reset At",300);
        Book b3 = new Book("Yolun Sonundaki Okyanus",257);
        Book b4 = new Book("Başlat",512);
        Book b5 = new Book("Karanlık Sular",327);


        bookSet.add(b1);
        bookSet.add(b2);
        bookSet.add(b3);
        bookSet.add(b4);
        bookSet.add(b5);

        System.out.println("####### Ada Göre Sıralama #######");
        for(Book book: bookSet){
            System.out.println(book.getName());
        }

        TreeSet<Book> bookSet2 = new TreeSet<Book>(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getPageNumber()-o2.getPageNumber();
            }
        });

        bookSet2.add(b1);
        bookSet2.add(b2);
        bookSet2.add(b3);
        bookSet2.add(b4);
        bookSet2.add(b5);

        System.out.println("####### Sayfa Sayısına Göre Sıralama #######");
        for (Book book: bookSet2){
            System.out.println(book.getName());
        }
    }
}
