package com.aequalis;

import java.util.Scanner;
import java.util.Stack;
public class Counter{
     public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
             Stack<Character> stack=new Stack<>();

    while (sc.hasNext()) {
        String input=sc.next();
        //Complete the code
        char[] c=input.toCharArray();
        for(char a:c)
        {
            if(a=='['||a=='('||a=='{')
            {
                stack.push(a);
                continue;
            }
            if(a==']'&&!stack.empty()&&stack.peek()=='[')
            {
                stack.pop();
                continue;
            }
            if(a==')'&&!stack.empty()&&stack.peek()=='(')
            {
                    stack.pop();
                    continue;
            }
            if(a=='}'&&!stack.empty()&&stack.peek()=='{')
            {
                stack.pop();
                continue;
            }
            if(a==']'||a==')'||a=='}')
            {
                stack.push(a);
                break;
            }
        }
        System.out.println(stack.isEmpty());
        stack.clear();

    }

}
		}
		
