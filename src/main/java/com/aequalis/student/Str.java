package com.aequalis.student;
import java.util.*;
import java.util.Scanner;
public class Str{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        List<String> a = new ArrayList<String>();

        for(int i=0;i<n;i++){
            String word = in.next();
            a.add(word);
        }
        for(String l :a)
        System.out.print(l+" ");
    }
}