package com.aequalis.student;
import java.util.*;
class StudentsManagementSystem {
    ArrayList<StudentDetails3> al = new ArrayList<StudentDetails3>();
    public void  insert(){
               
        Scanner in = new Scanner(System.in);
        
        boolean y = true;
   try{
       do{
            System.out.println("Please enter the Student id:");
            int sid = in.nextInt();
            System.out.println("Please enter the Student Name:");
            String sname = in.next();
            System.out.println("Please enter the Student Age:");
            int sage = in.nextInt();
            System.out.println("Please enter the Student Dept:");
            String sdept = in.next();

             if(sid == 0)
                System.out.println("Student id shoud not be 0");
                al.add(0,new StudentDetails3(sid, sname,sage ,sdept));
                System.out.println("Do you want to insert more?y/n");
                String x = in.next();
                char ch  = x.charAt(0);
                     if( ch == 'n')
                          y = false;
       }
       while(y!= false);
       }
       catch(InputMismatchException e){
           System.out.println("Invalid input");
       } 

              //to display records
              if(al.isEmpty())
                 System.out.println(" Student list is empty ");
              else
                 System.out.println("Students lists are:");
              
           displayAll();
       }

         

   public void update(){
       Scanner in = new Scanner(System.in);
       int number;
       System.out.println("Please enter the student id to update:");
       number = in.nextInt();
         if(number <= al.size()){
           System.out.println("Please enter the Student Id:");
           int sid = in.nextInt();
           System.out.println("Please enter the Student Name:");
           String sname = in.next();
           System.out.println("Please enter the Student Age:");
           int sage = in.nextInt();
           System.out.println("Please enter the Student Dept:");
           String sdept = in.next();

           try{
               al.set(number,new StudentDetails3(sid, sname, sage, sdept));
            } catch(IndexOutOfBoundsException e){
                   System.out.println("caught IndexOutOfBoundsException: specified position is empty "+e.getMessage());
               }
            
           }
       else{
           System .out.println("The entered row position not exist");
       }
       if(al.isEmpty())
             System.out.println("Student list is empty ");
         else
             System.out.println("Student lists are:");
             displayAll();
   }
           
       
       public void delete(){
           Scanner in = new Scanner(System.in);
           System.out.println("Please enter the student id to delete:");
            int sd = in.nextInt();
            Iterator<StudentDetails3> itr = al.iterator();
            try{
                while(itr.hasNext()){
                StudentDetails3 number = itr.next();
                if(number.Rollnum == sd)
                    al.remove(number);
                }
            }
               catch(ConcurrentModificationException e){
                   System.out.println(e.getMessage());
               }
                      System.out.println("Student lists are:");
                      displayAll();
           }
           

               public void view(){
               Scanner in = new Scanner(System.in);
               System.out.println("Please enter the student id to view details:");
                int sd = in.nextInt();
                Iterator<StudentDetails3> itr = al.iterator();
                while(itr.hasNext()){
                    StudentDetails3 number = itr.next();
                    if(number.Rollnum == sd){
                         System.out.println("Student lists are:");
                         display(number);
                    }     
                }
               }

             public static void list(){
                 displayAll();
             }
             public void updateid(int sid, int sid2) {
                Iterator<StudentDetails3>itr = al.iterator();
                while(itr.hasNext()){
                    StudentDetails3 sid1 = itr.next();
                    if(sid1.Rollnum == sid) 
                    al.remove(sid);
                    al.set(0,sid1);
                }
            }
        }
