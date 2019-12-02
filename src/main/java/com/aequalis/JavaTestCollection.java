package com.aequalis;

import java.util.Iterator;
import java.util.Stack;

public class JavaTestCollection {
    public static void main(String []args){
        Stack<String> stack=new Stack<String>();
        stack.push("h");
        stack.push("t");
        stack.push("l");
        stack.push("j");
        stack.push("M");
        stack.pop();

        Iterator<String> itr=stack.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}