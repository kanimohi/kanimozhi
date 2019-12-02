package com.aequalis;
import java.util.*;
public class MapExample{
    public static void main(String []args){
        Map map=new HashMap();
        map.put(1,"A");
        map.put(2,"B");
        map.put(3,"c");
        Set set=map.entrySet();
        Iterator itr=set.iterator();
        while(itr.hasNext()){
            Map.Entry entry=(Map.Entry)itr.next();
            System.out.println(entry.getKey()+" "+entry.getValue());

        }
    }
}