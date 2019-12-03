package com.aequalis.student;
import java.util.*;
public class Swap{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int temp;
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        temp = n1;
        n1 = n2;
        n2 = temp;
        System.out.println(n1);
        System.out.println(n2);

    }
}