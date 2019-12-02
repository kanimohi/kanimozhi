package com.aequalis;
import java.util.*;
public class HashMap2{
    public static void main(String []args){
        HashMap<Integer,String> map=new HashMap<Integer,String>();
        map.put(1,"a");
        map.put(2,"b");
        map.put(3,"c");
        map.put(4,"d");
        map.put(5,"e");
        System.out.println("Initial list of element:"+map);
        map.remove(1);
            System.out.println("Updated list of element:"+map);
            map.remove(2);
            System.out.println("Updated list of element:"+map);
            map.remove(3);
            System.out.println("Updated list of element:"+map);
            map.remove(4);
            System.out.println("Updated list of element:"+map);
    }
}