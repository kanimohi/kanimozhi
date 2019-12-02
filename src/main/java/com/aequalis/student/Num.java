package com.aequalis.student;
import java.util.*;
public class Num{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int even = 0;
        int odd = 0;
        int diff;
        int n = in.nextInt();
          for(int i=1;i<=n;i++){
              if(i%2 == 0){
               even = even+i;
              }
              else if(i%2!=0){
                odd = odd+i;
              }
          }
          System.out.println(even);
          System.out.println(odd);
          if(even>odd){
              diff = even-odd;
          }
          else{
              diff = odd-even;
          }
          System.out.println(diff);
    }
}