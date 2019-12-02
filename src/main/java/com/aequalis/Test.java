package com.aequalis;
public class Test{
    public static void main(String []args){
       String input ="welcome to kashmiri geeks...";

        System.out.println(input);

        String[] str = input.split(" ");

        for(int i=0; i< str.length; i++)
        {
            str[i] = (str[i]).substring(0,1).toUpperCase() + (str[i]).substring(1);
        }

        for(int i=0;i<str.length;i++)
        {
            System.out.print(str[i]+" ");
        }

    }
}