package com.aequalis.student;
import java.util.*;
public class Inheritance{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
int b = in.nextInt();
int h = in.nextInt();
if(b>=0 && h>=0)
{
    int result=b*h;
    System.out.println(result);
}
else
{
    System.out.println("java.lang.Exception: Breadth and height must be positive");
}

    }
}






