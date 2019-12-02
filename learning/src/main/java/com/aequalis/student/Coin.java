package com.aequalis.student;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class Coin {
            public static void main(String[] args) throws IOException {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                PrintWriter wr = new PrintWriter(System.out);
                 int N = Integer.parseInt(br.readLine().trim());
                 String[] arr_A = br.readLine().split(" ");
                 int[] A = new int[3*N];
                 for(int i_A=0; i_A<arr_A.length; i_A++)
                 {
                     A[i_A] = Integer.parseInt(arr_A[i_A]);
                 }
        
                 long out_ = maxTripletSum(A);
                 System.out.println(out_);
        
                 wr.close();
                 br.close();
            }
            static long maxTripletSum(int[] A){
                for(int i=0;i<=A.length;i++){
                int a = A[0]+A[6];
    }
        return a;
    
}
}
        

