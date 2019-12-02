package com.aequalis;
import java.util.*;
public class TreeSet4{
public static void main(String []args){
    TreeSet<String> set=new TreeSet<String>();
    set.add("g");
    set.add("b");
    set.add("n");
    set.add("k");
    System.out.println("InitialSet:"+set);
    System.out.println("ReverceSet:"+set.descendingSet());
    System.out.println("HeadSet:"+set.headSet("n",false));
    System.out.println("TailSet:"+set.tailSet("b",false));

}
}