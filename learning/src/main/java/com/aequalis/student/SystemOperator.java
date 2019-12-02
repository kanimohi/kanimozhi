package com.aequalis.student;
import java.util.*;
import java.util.Iterator;
public class SystemOperator{
    static ArrayList<StudentDetails3> al = new ArrayList<StudentDetails3>();
    
    public  void insert(){
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
     System.out.println("Choose below option to proceed:");
     System.out.println("1 : Update Student Id");
     System.out.println("2 : Update Student Name");
     System.out.println("3 : Update Student Age");
     System.out.println("4 : Update Student Dept");
     System.out.println("Please enter your choice::");
     int choice = in.nextInt();
                 switch(choice)
                 {
                    case 1:
                         updateid();
                         break;
                    case 2:
                          updatename();
                          break;
                    case 3:
                          updateage();
                          break;
                    case 4:
                          updatedept();
                          break;
                    default:
                        System.out.println("bad input");
                        break;
                }
     
        if(al.isEmpty())
           System.out.println("Student list is empty ");
       else
           System.out.println("Student lists are:");
           displayAll();
 }
     
     private void updatedept() {
         try{
        Scanner in =new Scanner(System.in);
        System.out.println("Enter dept name you want to add");
        String sdept1=in.next();
        System.out.println("Enter dept name you want to edit");
        String sdept2=in.next();
       Iterator<StudentDetails3> itr = al.iterator();
       int index = 0;
        while(itr.hasNext()){
            StudentDetails3 sdept = itr.next();
            if(sdept.Dept.equals(sdept2)) 
            {
              sdept.Dept=sdept1;
              al.set(4,sdept);
            }
            index++;
        }
    }
    catch(IndexOutOfBoundsException e){
        System.out.println(e.getMessage());
    }
        
        
   }
    

    private void updateage() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter age you want to add");
        int sage1 = in.nextInt();
        System.out.println("Enter age you want to edit");
        int sage2=in.nextInt();
        Iterator<StudentDetails3> itr = al.iterator();
        int index = 0;
        while(itr.hasNext()){
            StudentDetails3 sage = itr.next();
            if(sage.Age == sage2) 
            {
                sage.Age=sage1;
                al.set(index,sage);
            }
            index++;
        }
        
   }
    

    private void updatename( ) {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter name you want to add");
        String sname1=in.next();
        System.out.println("Enter name you want to edit");
        String sname2=in.next();
        Iterator<StudentDetails3> itr = al.iterator();
        int index=0;
        while(itr.hasNext())
        {
            StudentDetails3 sname = itr.next();
            if(sname.Name.equals(sname2)) 
            {
                sname.Name=sname1;
                al.set(index,sname);
            }
            index++;
        }
   
    }
    

    private void updateid() {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter number you want to add");
        int sid1=in.nextInt();
        System.out.println("Enter id you want to edit");
        int sid2=in.nextInt();
        Iterator<StudentDetails3> itr = al.iterator();
        int index=0;
        while(itr.hasNext())
        {
            StudentDetails3 sid = itr.next();
            if(sid.Rollnum == sid2)
            {
            sid.Rollnum = sid1;
            al.set(index,sid);
            }
            index++;
        }
            
    }
   
      public void delete() {
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

     public void list(){
               displayAll();
           }
           public static void display( StudentDetails3 sd){
            System.out.println(sd.Rollnum+" "+sd.Name+" "+sd.Age+" "+sd.Dept);
        }
        

        public void displayAll(){
            Iterator itr = al.iterator();
            while(itr.hasNext()){
            StudentDetails3 sd =(StudentDetails3)itr.next();
            System.out.println(sd.Rollnum+" "+sd.Name+" "+sd.Age+" "+sd.Dept);
            }
        }

}
