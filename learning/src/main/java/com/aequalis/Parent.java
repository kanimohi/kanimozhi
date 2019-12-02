package com.aequalis;
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
public class Parent{
public static void main(String args[])throws IOException
 {
     ArrayList<String> al = new ArrayList<>();
     StringBuilder sb = new StringBuilder();
 String word = "Hello Java World What do you want.";
 String str[] = word.split(" ");
 Arrays.sort(str, new StringLengthComparator());
 for(String s: str)
  StringBuilder s= sb;
        String s1 = s.substring(0, 1).toUpperCase()+ s.substring(1).toLowerCase();
        System.out.println(" "+s1);
 }
}

 class StringLengthComparator implements Comparator<String> {
 public int compare(String s1, String s2) {
 return s1.length() - s2.length();
 }
}

 

        

    
