package com.aequalis.student;
import java.util.*;
public class Arraydiv{
    public static void main(String[] args){
        double positive=0;
        double negative=0;
        double zeros = 0;
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i] = in.nextInt();
        
            if(a[i]>0){
                positive++;
            }
            else if(a[i]<0){
                negative++;
            }
            else{
                zeros++;
            }
            
        }
        System.out.println(positive/n);
        System.out.println(negative/n);
        System.out.println(zeros/n);
        
    }
}