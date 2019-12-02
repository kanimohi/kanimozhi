package com.aequalis.student;
import java.util.*;
 class MultithreadingDemo extends Thread 
    { 
            public void run(){  
             for(int i=1;i<5;i++){  
               try{Thread.sleep(500);}catch(InterruptedException e){System.out.println(e);}  
               System.out.println(i);  
             }  
            }  
            public static void main(String args[]){  
                MultithreadingDemo t1=new MultithreadingDemo();  
                MultithreadingDemo t2=new MultithreadingDemo();  
              
             t1.start();  
             t2.start();  
            }  
           }  