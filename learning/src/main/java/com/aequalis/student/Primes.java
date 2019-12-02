package com.aequalis.student;
import java.util.*;
public class Primes{
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        int dig =0;
        int sum =0;
            int p = in.nextInt();
          while(p!=0)
            {
                dig=p%10;
                p/=10;
            
                if(dig==2 || dig== 3 || dig==5 || dig==7) {
                    sum =sum+dig;
                }
            }
                System.out.println(sum);
             }
        }

            
    
        
    
    
    
   
    

