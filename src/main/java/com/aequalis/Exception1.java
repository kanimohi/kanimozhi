package com.aequalis;
public class Exception1{
    public static void main(String []args){
            try{
                int b=30/0;
            }
               catch(ArithmeticException e){
                   System.out.println(e);
                }
                
                finally{
                    System.out.println("finally block is executed");
                
                System.out.println("Normal flow");
                }
            }
        }
    

        



