package com.aequalis.student;
import java.util.*;
public class Queue1{
     public static void main(String []args){
        Deque<String> queue = new LinkedList<>();
	    queue.add("one");
        queue.add("two");	
        queue.add("three");	
	    System.out.println(queue);		
	    System.out.println(queue.poll());
        System.out.println(queue.poll());	
        System.out.println(queue);
   }
}