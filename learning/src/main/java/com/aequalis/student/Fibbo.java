package com.aequalis.student;
import java.util.*;
public class Fibbo{
    public static void main(String []args){
       // Scanner in = new Scanner(System.in);
       // int n = in.nextInt();
        int n = 10, t1 = 0, t2 = 1;
        for (int i = 1; i <= n; ++i)
        {
            System.out.print(t1 + " ");
            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }
    }
}
