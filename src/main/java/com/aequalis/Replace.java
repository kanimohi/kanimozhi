package com.aequalis;
import java.util.Scanner;
import java.util.Stack;
public class Replace{
    public static void main(String []args){
        Scanner in=new Scanner(System.in);
        String s = in.nextLine();
        Stack stack = new Stack();

        for (int i = 0; i < s.length(); i++) {
            stack.push(s.charAt(i));
        }

        String reverseString = "";

        while (!stack.isEmpty()) {
            reverseString = reverseString+stack.pop();
        }

        if (s.equals(reverseString))
            System.out.println("Yes");
        else
            System.out.println("No");

    }
        
    
}