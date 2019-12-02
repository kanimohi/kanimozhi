package com.aequalis.student;
import java.util.*;
public class ArrayList1{
    public static void main(String []args){
        ArrayList<String> al=new ArrayList<String>();
        al.add("k");
        al.add("g");
        al.add("v");
        al.remove("g");
    
    for(String itr:al){
            System.out.println(itr);
        }
    }
} 