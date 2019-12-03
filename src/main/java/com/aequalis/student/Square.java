package com.aequalis.student;
import java.util.*;
public class Square{
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if((i%2)==0){
                System.out.print(" "+"#");
                }
                else{
                    System.out.print("#"+" ");
                }
                }
                System.out.println(" ");
            }
            System.out.println();
           
        }
    }
