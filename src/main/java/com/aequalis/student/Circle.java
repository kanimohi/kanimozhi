package com.aequalis.student;
import java.util.*;
public class Circle{
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        double radius = in.nextDouble();
        double diameter ;
        double area ;
        double circumference ;
        diameter = 2.0 * radius;
        System.out.println(String.format("%.2f",diameter));
        area = Math.PI * radius * radius;
        System.out.println(String.format("%.2f",area));
        circumference = 2.0 * Math.PI * radius;
        System.out.println(String.format("%.2f",circumference));

    }
}