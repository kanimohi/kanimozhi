package com.aequalis.student;
import java.util.*;
public class Product{
    public static void main(String []args){
        int sum=1 ;
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i=1;i<=n;i++){
            sum = sum*i;
        }
        System.out.println(sum);
    }
}