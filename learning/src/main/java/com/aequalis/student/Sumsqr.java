package com.aequalis.student;
import java.util.*;
public class Sumsqr{
    public static void main(String [] aStrings){
        double i;
        double sum =0.0;
        double sum1 =0.0;
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(i=1;i<=n;i++){
            sum += 1/i;
            sum1 += 1/(n-i+1);
        }
        System.out.println(sum);
        System.out.println(sum1);

    }
}