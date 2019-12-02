package com.aequalis;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Hello world!
 */
public final class App {
    public static void main(String []args){
    Scanner in = new Scanner(System.in);
    String sentence = in.nextLine();
    StringBuilder sb = new StringBuilder();

    String input = sentence.substring(0, sentence.length()-1); 

    LinkedHashMap<String, Integer> hm = new LinkedHashMap<String, Integer>();
    {

    for(String word : input.toLowerCase().split(" ")){

        hm.put(word, word.length()); 

    }

    hm.entrySet().stream()
    .sorted(Map.Entry.<String, Integer>comparingByValue()) 
    .forEach(e->{
    sb.append(e.getKey()+" ");  
    });


String result = sb.substring(0,1).toUpperCase().trim()+ sb.substring(1)+".";

System.out.println(result); 

    }
}


    


    }


