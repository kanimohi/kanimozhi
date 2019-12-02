package com.aequalis.student;
import java.util.*;
import java.util.Scanner;
public class Kani{
    public static void main(String args[] ) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for (int i = 0;i < t;i++) {
            int n = s.nextInt();
            int k = s.nextInt();
            int c = s.nextInt();
            for(int j = 1;j < n;j++){
                int a = s.nextInt();
                c = c>a?a:c;
            }
            k = k>c?k-c:0;
            System.out.println(k);
        }
    }
}
 