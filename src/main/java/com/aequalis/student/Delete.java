package com.aequalis.student;
import java.util.*;
class StudentsManagementSystem implements Delete{
    static ArrayList<StudentDetails3> al=new ArrayList<StudentDetails3>();
    void delete(){
        Scanner in=new Scanner(System.in);
         System.out.println("enter the number you want to delete");
         int sd=in.nextInt();
         Iterator<StudentDetails3> itr = al.iterator();
         while(itr.hasNext()){
             StudentDetails3 number = itr.next();
             if(number.Rollnum==sd){
                 al.remove(number);
             }

         }
         if(al.isEmpty())
        System.out.println("list is empty ");
        else
           System.out.println("members of lists are:");
         for(int i=0 ; i<al.size();i++)
             System.out.println("index "+i+" : "+ al.get(i)+" ");
          }
            
            
    }

    public void update(){
        Scanner in = new Scanner(System.in);
        int position;
        System.out.println("Please enter the row position you want to update:");
        position = in.nextInt();
          if(position <= al.size()){
            System.out.println("Enter a column position you want to update:");
            System.out.println("Please enter the Student Id:");
            int sid = in.nextInt();
            System.out.println("Please enter the Student Name:");
            String sname = in.next();
            System.out.println("Please enter the Student Age:");
            int sage = in.nextInt();
            System.out.println("Please enter the Student Dept:");
            String sdept = in.next();
 
            try{
                al.set(position,new StudentDetails3(sid, sname, sage, sdept));
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

    public void update(){
        Scanner in = new Scanner(System.in);
        String position;
        System.out.println("Please enter to update:");
        try{
            System.out.println("To Update a Student Id: type id");
            System.out.println("To Update a Student Nmae:");
            System.out.println("To Update a Student Age:");
            System.out.println("To Update a Student Department:");
            position = in.nextLine();
            switch(position){
                case "id":
                     System.out.println("Please enter the Student old Id: new id:");
                     int sid = in.nextInt();
                     int sid2 = in.nextInt();
                     updateid(sid,sid2);
                     break;
                case "name":
                     System.out.println("Please enter the Student Name:");
                     String sname = in.next();
                     String sname2 = in.next();
                     updatename(sname,sname2);
                     break;
                case "age":
                     System.out.println("Please enter the Student Age:");
                     int sage = in.nextInt();
                     int sage2 = in.nextInt();
                     updateage(sage,sage2);
                     break;
                case "department":
                     System.out.println("Please enter the Student Dept:");
                     String sdept = in.next();
                     String sdept2 = in.next();
                     break;
                default:
                     System.out.println("Entered input is wrong!");
                     break;
            }
           
           }
            catch(IndexOutOfBoundsException e){
                    System.out.println("caught IndexOutOfBoundsException: specified position is empty "+e.getMessage());
                }
             
          
        if(al.isEmpty())
              System.out.println("Student list is empty ");
          else
              System.out.println("Student lists are:");
              displayAll();
    }
        public void updateid(int id1, int id2){
            Iterator<StudentDetails3>itr = al.iterator();
            while(itr.hasNext()){
                StudentDetails3 sid = itr.next();
                if(sid.Rollnum == id1) 
                al.remove(sid);
                al.add(sid);
            }
   
        }    
