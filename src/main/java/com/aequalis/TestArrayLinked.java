package com.aequalis;
import java.util.*; 
import java.util.ArrayList;  
public class TestArrayLinked{    
 public static void main(String args[]){    
     
  List<String> al=new ArrayList<String>();   
  al.add("R");    
  al.add("V");    
  al.add("R");    
  al.add("A");    
    
  List<String> al2=new LinkedList<String>();    
  al2.add("J");    
  al2.add("e");    
  al2.add("S");    
  al2.add("J");    
    
  System.out.println("arraylist: "+al);  
  System.out.println("linkedlist: "+al2);  
 }    
}    
