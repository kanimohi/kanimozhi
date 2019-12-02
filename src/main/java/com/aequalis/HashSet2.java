package com.aequalis;
import java.util.*;
public class HashSet2{
    public static void main(String []args){
        HashSet<String> set=new HashSet<String>();
        set.add("H");
        set.add("H");
        set.add("H");
        for(String str:set)
        System.out.println(str);
    }
}