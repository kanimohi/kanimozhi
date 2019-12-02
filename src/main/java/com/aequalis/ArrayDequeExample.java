package com.aequalis;
import java.util.*;
public class ArrayDequeExample{
    public static void main(String []args){
        Deque<String> deque=new ArrayDeque<String>();
        deque.add("f");
        deque.add("t");
        deque.add("n");
        for(String str:deque){
            System.out.println(str);
        }
    }

}