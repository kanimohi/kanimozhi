package com.aequalis;
import java.util.*;
public class MapExample2{
    public static void main(String []args){
        Map<Integer,String> map=new HashMap<Integer,String>();
        map.put(1,"S");
        map.put(2,"D");
        map.put(3,"F");
        for(Map.Entry m:map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }}