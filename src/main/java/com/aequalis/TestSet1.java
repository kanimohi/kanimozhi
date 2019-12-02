package com.aequalis;

import java.util.Iterator;
import java.util.*;
public class TestSet1 {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<String>();
          ts.add("g");
          ts.add("h");
          ts.add("l");
          
          Iterator<String> itr=ts.iterator();
          while(itr.hasNext()){
          System.out.println(itr.next());

      }
}
}