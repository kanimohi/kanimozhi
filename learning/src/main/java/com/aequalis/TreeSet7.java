package com.aequalis;
import java.util.*;
public class TreeSet7{
    public static void main(String[] args){
        TreeSet<Integer> set=new TreeSet<Integer>();
        set.add(3);
        set.add(4
        );
        set.add(5);
        System.out.println("The lowest value is:"+set.pollFirst());
        System.out.println("The  highest value is:"+set.pollLast());
    }
}