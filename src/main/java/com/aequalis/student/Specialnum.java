package com.aequalis.student;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;
public class Specialnum {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        for(int t_i=0; t_i<T; t_i++)
        {
            int Number = Integer.parseInt(br.readLine().trim());
            int DecreasingCost = Integer.parseInt(br.readLine().trim());
            int IncreasingCost = Integer.parseInt(br.readLine().trim());

            long out_ = SpecialNumbers(IncreasingCost, DecreasingCost, Number);
            System.out.println(out_);
         }

         wr.close();
         br.close();
    }
    static long SpecialNumbers(int IncreasingCost, int DecreasingCost, int Number){
        int SpecialNumbers = IncreasingCost*DecreasingCost*number;
        
    
    }
}
    }
}