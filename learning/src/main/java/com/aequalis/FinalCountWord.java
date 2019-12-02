package com.aequalis;
import java.util.*;
public class FinalCountWord{
    public static void main(String []args){
    String str=("This this is is");
    String[]split=str.split(" ");
    HashMap<String,Integer> hm=new HashMap<String,Integer>();
    for(int i=0;i<split.length-1;i++){
        if(hm.containsKey(split[i])){
            int count =hm.get(split[i]);
            hm.put(split[i],count+1);
}else{
hm.put(split[i],i);
    }
    }
    System.out.println(hm);
}
}