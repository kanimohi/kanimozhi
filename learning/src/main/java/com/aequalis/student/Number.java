package com.aequalis.student;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;
public class Number{
    public static void main(String []args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
         int N = Integer.parseInt(br.readLine().trim());
         String[] arr_A = br.readLine().split(" ");
         int[] A = new int[N];
         for(int i_A=0; i_A<arr_A.length; i_A++)
         {
         	A[i_A] = Integer.parseInt(arr_A[i_A]);
         }
         int Q = Integer.parseInt(br.readLine().trim());
         String[] arr_queries = br.readLine().split(" ");
         int[] queries = new int[Q];
         for(int i_queries=0; i_queries<arr_queries.length; i_queries++)
         {
         	queries[i_queries] = Integer.parseInt(arr_queries[i_queries]);
         }

         int[] out_ = solve(A,N, queries,Q);
         System.out.print(out_[0]);
         for(int i_out_=1; i_out_<out_.length; i_out_++)
         {
         	System.out.print("\n" + out_[i_out_]);
         }

         wr.close();
         br.close();
    }
    static int[] solve(int[] A, int N, int[] queries, int Q) {
        int P;
        for(int i=1;i<=N;i++)
        {
            for(int j=1;j<=N;j++)
            {
                if((i!=j) && (A[i]==A[j]))
                {
                 P=i-j;
                System.out.println(P);
                }
                else
                {
                System.out.println("-1");
                }
            }
        }
        return P;
    }


    }
