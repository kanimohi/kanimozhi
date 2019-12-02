package com.aequalis.student;
import java.util.*;
public class Details{
    public static void main(String[]args){
        ArrayList<String> al = new ArrayList<String>();
        al.add("hina");
        al.add("jeena");
        al.add("liya");
        System.out.println(al);
        al.set(2,"Riya");
        System.out.println("After updation:"+al);
        al.remove(2);
        System.out.println("After removing elements:"+al);
        al.add(0,"nivi");
        System.out.println("After insertion:"+al);
    }
}