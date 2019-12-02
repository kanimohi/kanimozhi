package com.aequalis;

import java.util.ArrayList;
import java.util.Iterator;

public class JavaCollection {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        al.add("R");
        al.add("S");
        al.add("G");
        al.add("H");
        Iterator<String> itr = al.iterator();
    while(itr.hasNext()){
        System.out.println(itr.next());
    }
    
}
}