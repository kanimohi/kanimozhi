package com.aequalis.student;
import java.util.*;
public class Number1{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int j=0;j<num;j++)
        {
            int count=0;
            String s = sc.next();
            char ch[] = s.toCharArray();
            Arrays.sort(ch);
            for(int i=1;i<ch.length;i++)
            {
                if(ch[i]-ch[i-1]!=1)
                {
                    count++;
                    break;
                }
            
            }
            if(count==0)
            {
                System.out.println("YES");
            }
            else
                System.out.println("NO");
        }
    }
}

    


