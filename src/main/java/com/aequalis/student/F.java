package com.aequalis.student;
import java.util.*;
public class F{
    public static void main(String []args){
        int n = 4567;
        int sum;
        while(n>0){
            sum = n%10;
            n/= 10;
            System.out.print(sum+" ");
        }
        

        }
    }
