package com.aequalis;

import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;
import java.util.*;

enum days {
    SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY
}
public class EnumSetExample{
    public static void main(String[] args){
      Set<days> set=EnumSet.of(days.TUESDAY,days.WEDNESDAY);
      Iterator<days> itr=set.iterator();
      while(itr.hasNext());
      System.out.println(itr.next());
    }
}