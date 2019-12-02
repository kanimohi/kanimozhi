package com.aequalis;

import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;

public class Compare{
    public static int main(String []args){
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int maxCount = 0;
        int i = 0;
        int j = 0;
        int strLen = s.length();
        HashSet<Character> hs = new HashSet<>();
        while(i < strLen && j < strLen){
            if(!hs.contains(s.charAt(j))){
                hs.add(s.charAt(j));
                j++;
                maxCount = Math.max(maxCount, j-i);
            }
            else{
                hs.remove(s.charAt(i));
                i++;
            }
            }
            System.out.println(maxCount);
        }

    }
