package com.aequalis;

import java.util.HashSet;

public class LinkedHashSet {
    public static void main(String[] args) {
        HashSet<Book> hs=new HashSet<Book>();
        Book b1=new Book(1,"d","kl",7);
        Book b2=new Book(2, "j", "hg", 4);

        hs.add(b1);
        hs.add(b2);
        for(Book b:hs){
          System.out.println(b.id+" "+b.name+" "+b.author+" "+b.quantity);
        }
    }

}