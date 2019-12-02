package com.aequalis.student;

import java.util.*;
import java.util.ArrayDeque;;
    public class Deque11 {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
       int n = in.nextInt(); 
        for (int i=1; i<=n; i++)                                  
        { 
            int num = in.nextInt();
            for(int j=1;j<=num;j++)
            {
            if (j%15==0)                                                  
                System.out.println("FizzBuzz"+" ");   
            else if (j%5==0)      
                System.out.println("Buzz"+" ");  
   
            else if (j%3==0)      
                System.out.println("Fizz"+" ");  
                  
            else 
                System.out.println(j+" ");                          
        } 
        }
    }
}

        
    