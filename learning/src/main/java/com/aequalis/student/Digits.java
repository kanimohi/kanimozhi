package com.aequalis.student;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Digits{
    public static void main(String []args){
        ArrayList<String> numbers = new ArrayList<String>();
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();

        Pattern p = Pattern.compile("\\d+");
        Matcher m = p.matcher(s); 
        while (m.find()) {
        numbers.add(m.group());
        }
        System.out.println(numbers);
        for(String a:numbers){
            System.out.println(a.startsWith(prefix));
        }
        
        
            
        }
    }

    
    


  
    

