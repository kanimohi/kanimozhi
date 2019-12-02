package com.aequalis;

import java.util.Scanner;

public class Case{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String word = in.next();
        String reverse="";
        for(int i=word.length()-1;i>=word.length()-2;i--)
    {
            reverse = reverse+ word.charAt(i)+" ";
            System.out.println(reverse);
    }
    }
    
    }

