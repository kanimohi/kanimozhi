package com.aequalis.student;
import java.util.*;
public class Sumpro{
    public static void main(String []args){
        int sum;
        int product;
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        sum = a + b + c;
        System.out.println(sum);
        product = a * b * c;
        System.out.println(product);

    }
}