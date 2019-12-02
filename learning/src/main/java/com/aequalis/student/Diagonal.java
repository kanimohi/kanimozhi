package com.aequalis.student;
import java.util.*;
public class Diagonal{
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        int sum = 0;
        int sumj = 0;
        int n = in.nextInt();
        int d[][] = new int[n][n];
       for(int i = 0;i < n;i++){
           for(int j = 0;j < n;j++)
           {
               d[i][j] = in.nextInt();
            }
        }
        for(int i=0 ;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(d[i][j]+"\t");
            }
                System.out.println(" ");
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i == j){
                    sum += d[i][j];
                }
                if(j==(n-i-1))
                sumj+=d[i][j];
            }
        }     
         System.out.println (sumj-sum);
    }
        
        
}

