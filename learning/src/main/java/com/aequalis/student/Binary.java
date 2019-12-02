package com.aequalis.student;
import java.util.*;
public class Binary{
public static void main(String [] args){
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
        String bin[] = Integer.toBinaryString(n).split("0+");
        Arrays.sort(bin);
        System.out.println(bin[bin.length-1].length());
        
    }

}
