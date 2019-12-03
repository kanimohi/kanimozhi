package com.aequalis.studnt;
import java.util.*;
public class Minmax{
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int n3 = in.nextInt();
        int n4 = in.nextInt();
        int n5 = in.nextInt();
        int sum;
        int mul;
        sum = n1 + n2 + n3 + n4 + n5;
        System.out.println("sum is:"+sum);
        mul = n1 * n2 * n3 * n4 * n5;
        System.out.println("multiplication is:"+mul);
        if(n1<=n2 && n1<=n3 && n1<=n4 && n1<=n5)
        {
            System.out.println("Minimum value is:"+n1);
        }
        else if(n2<=n1 && n2<=n3 && n2<=n4 && n2<=n5){
            System.out.println("Minimum value is:"+n2);
        }
        else if(n3<=n1 && n3<=n2 && n3<=n4 && n3<=n5){
            System.out.println("Minimum value is:"+n3);
        }
        else if(n4<=n1 && n4<=n2 && n4<=n3 && n4<=n5){
            System.out.println("Minimum value is:"+n4);
        }
        else {
            System.out.println("Minimum value is:"+n5);
        }

        if(n1>=n2 && n1>=n3 && n1>=n4 && n1>=n5)
        {
            System.out.println("Maximum value is:"+n1);
        }
        else if(n2>=n1 && n2>=n3 && n2>=n4 && n2>=n5){
            System.out.println("Maximum value is:"+n2);
        }
        else if(n3>=n1 && n3>=n2 && n3>=n4 && n3>=n5){
            System.out.println("Maximum value is:"+n3);
        }
        else if(n4>=n1 && n4>=n2 && n4>=n3 && n4>=n5){
            System.out.println("Maximum value is:"+n4);
        }
        else {
            System.out.println("Maximum value is:"+n5);
        }
    }


}