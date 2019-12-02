package com.aequalis.student;

import java.util.*;
import java.util.Iterator;
import java.util.Scanner;

public class StudentManagementSystem {
    static ArrayList<StudentDetails3> al = new ArrayList<StudentDetails3>();
    
        public static void main(String[] args) {
            SystemOperator so = new SystemOperator();
            
            Iterator itr = al.iterator();
            while(itr.hasNext()){
                StudentDetails3 sd =(StudentDetails3)itr.next();
                System.out.println(sd.Rollnum+" "+sd.Name+" "+sd.Age+" "+sd.Dept);
            }
             Scanner in = new Scanner(System.in);
             boolean y  = true;  
             do{
                 System.out.println("Choose below option to proceed:");
                 System.out.println("1 : Create New Record");
                 System.out.println("2 : Update a Record");
                 System.out.println("3 : Delete a Record");
                 System.out.println("4 : To View a Record");
                 System.out.println("5 : To List All Records");
                 System.out.println("Please enter your choice::");
                 int choice = in.nextInt();
                 switch(choice)
                 {
                    case 1:
                        so.insert();
                        break;
                    case 2:
                        so.update();
                        break;
                    case 3:
                        so.delete();
                        break;
                    case 4:
                        so.view();
                        break;
                    case 5:
                        so.list();
                        break;
                    default:
                        System.out.println("bad input");
                        break;
                }
                System.out.println("Do you want to process more? y/n");
                String x = in.next();
                char ch  = x.charAt(0); 
                if( ch == 'n')
                    y = false;
            }
                while(y!= false);

   }
}


    
    

        