package com.aequalis;
import java.util.Scanner;
public class GetInputFromUser{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        System.out.println("you entered number:"+a);
        in.close();
    }
}