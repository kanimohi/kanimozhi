package com.aequalis.student;
import java.util.*;
public class Reverse1{
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int p,a=0;
        while(n!=0){
           p = n%10;
           n/=10;
           a +=p;
        }
           System.out.println(a);
        
       
    }
}