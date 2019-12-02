package com.aequalis;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
public class ReverceString{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        String sentence = in.nextLine();
        StringBuilder sb = new StringBuilder();

        String input = sentence.substring(0, sentence.length()-1); 

        LinkedHashMap<String, Integer> hm = new LinkedHashMap<String, Integer>();
    

    for(String word : input.toLowerCase().split(" ")){

        hm.put(word, word.length()); 

    }

    hm.entrySet().stream()
    .sorted(Map.Entry.<String, Integer>comparingByValue()) 
    .forEach(e->{
    sb.append(e.getKey()+" ");
    });


        StringBuilder result = sb;
        String s1 = result.substring(0, 1).toUpperCase()+ result.substring(1).toLowerCase();
        System.out.println(s1.trim()+".");
    

}

        
    }



