package com.aequalis;
public class TryCatch{
    public static void main(String []args){
        int n;
        int a=60;
        int b=0;
        try{
            n=a/b;
        }
        catch(Exception e){
             System.out.println(a/(b+2));
        }

        }
    }

