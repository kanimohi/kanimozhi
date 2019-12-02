package com.aequalis;

import java.util.Iterator;
import java.util.PriorityQueue;



public class TestJavaCollection {
    public static void main(String []args){
        PriorityQueue <String> queue=new PriorityQueue <String>();
        queue.add("d");
        queue.add("A");
        queue.add("K");
        queue.add("H");
        System.out.println("head:"+queue.element());
            System.out.println("head:"+queue.peek());
            System.out.println("elements are:");
            Iterator<String> itr1 = queue.iterator();
            while(itr1.hasNext()) {
              System.out.println(itr1.next());
            }
            queue.remove();
            queue.poll();
            System.out.println("after removing 2 elements:");
            Iterator<String> itr2=queue.iterator();
            while(itr2.hasNext()){
                System.out.println(itr2.next());
            }

    }
}