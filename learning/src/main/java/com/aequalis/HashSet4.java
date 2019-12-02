package com.aequalis;
import java.util.*;
import java.util.ArrayList;
public class HashSet4{
    public static void main(String []args){
        List<String> al=new ArrayList<String>();
        al.add("s");
        al.add("d");
        al.add("e");
       HashSet<String> set=new HashSet(al);
       set.add("l");
       Iterator<String> itr=set.iterator();
       while(itr.hasNext()){
           System.out.println(itr.next());
       }

    }
}