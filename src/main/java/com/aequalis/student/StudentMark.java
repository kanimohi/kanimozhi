package com.aequalis.student;
import java.util.*;
public class StudentMark{
    public static void main(String args[]){
        HashMap<String,Integer> hm=new HashMap<String,Integer>();
        hm.put("Ram",40);
        hm.put("Tina",35);
        hm.put("piya",50);
        for(Map.Entry m:hm.entrySet()){
        System.out.println(m.getKey()+" scored mark "+m.getValue());
        }
    }
}