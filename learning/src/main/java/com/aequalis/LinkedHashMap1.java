package com.aequalis;
import java.util.*;
public class LinkedHashMap1{
    public static void main(String []args){
        LinkedHashMap<Integer,String> hm=new LinkedHashMap<Integer,String>();
        hm.put(1,"a");
        hm.put(2,"b");
        hm.put(3,"c");
        for(Map.Entry m:hm.entrySet()){
        System.out.println(m.getKey()+" "+m.getValue());
        }
    }
    
}
