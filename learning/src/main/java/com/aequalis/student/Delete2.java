package com.aequalis.student;
import java.util.*;
import java.util.ArrayList;
public class Delete2{
    public static void main(String[]args){
    ArrayList<Delete1> al = new ArrayList<Delete1>();
    Delete1 d1 = new Delete1(100,"H",21,"Y");
    Delete1 d2 = new Delete1(101,"K",22,"L");
    Delete1 d3 = new Delete1(102,"M",23,"W");
    al.add(d1);
    al.add(d2);
    al.add(d3);
    al.remove(100);
    System.out.println("Rollnum\tName\tAge\tDept");
    System.out.println("-----------------------------");
    for(Delete1 item : al) {
        System.out.println(item.getRollnum() + "\t" + item.getName() + "\t" + item.getAge() + "\t" + item.getDept());
        
        }
        
    }
    
}


    
