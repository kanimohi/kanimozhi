package com.aequalis;
import java.util.*;
public class HashTable1{
    public static void main(String []args){
        Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
        ht.put(1,"f");
        ht.put(2,"g");
        ht.put(3,"h");
    System.out.println(ht.getOrDefault(1,"f"));
System.out.println(ht.getOrDefault(2,"g"));   }
}