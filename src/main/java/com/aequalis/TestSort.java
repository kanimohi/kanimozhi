package com.aequalis;

import java.util.*;
import java.util.ArrayList;

public class TestSort {

    public static void main(String []args) {
       // ArrayList<String> list = new ArrayList<String>();
       ArrayList<String> list=new ArrayList<String>();
       list.add("n");
        list.add("a");
        list.add("c");
        Collections.sort(list);
        Iterator itr=list.iterator();
        while(itr.hasNext())
            
        {
          System.out.println(itr.next());

        }
    }

}