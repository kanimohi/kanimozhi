package com.aequalis;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet2 {
    public static void main(String []args){
        TreeSet<String> set= new TreeSet<String>();
        set.add("a");
        set.add("b");
        set.add("c");
        System.out.println("Traverse the element through iterator indecending order");
        Iterator i=set.descendingIterator();
        while(i.hasNext()) {
            System.out.println(i.next());
        }
    }
}