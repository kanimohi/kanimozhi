package com.aequalis;
import java.util.*;
import java.util.Iterator;
public class ArrayList1{
    public static void main(String []args){
        ArrayList<String> al=new ArrayList<String>();  
              al.add("Ravi");    
              al.add("Vijay");    
              al.add("Ajay");    
              Iterator<String> itr=al.iterator();  
              while(itr.hasNext()){  
              System.out.println(itr.next());  
       }  
    }
}         
             