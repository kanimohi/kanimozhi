package com.aequalis.student;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Digit{
 
public static boolean isValid(String email) 
    { 
        String emailRegex = ("(0/91)?[7-9][0-9]{9}");
                              
        Pattern pat = Pattern.compile(emailRegex); 
        if (email == null) 
            return false; 
        return pat.matcher(email).matches(); 
    } 
  
    /* driver function to check */
    public static void main(String[] args) 
    { 
        String email = "8220684862"; 
        if (isValid(email)) 
            System.out.print("Yes"); 
        else
            System.out.print("No"); 
    } 
} 
                                                                                                                               

    
    
