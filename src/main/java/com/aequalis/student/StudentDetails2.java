package com.aequalis.student;
import java.util.*;

public class StudentDetails2 {
    public static void main(String[] args) {
        // ArrayList<StudentDetails> list=new ArrayList<StudentDetails>();
        StudentDetails s1 = new StudentDetails(1, "K", 21, "IT");
        StudentDetails s2 = new StudentDetails(2, "H", 20, "CSE");
        StudentDetails s3 = new StudentDetails(3, "G", 22, "ECE");
        StudentDetails s4 = new StudentDetails(4, "N", 24, "EEE");
        ArrayList<StudentDetails> list = new ArrayList<StudentDetails>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        Iterator itr=list.iterator();
        while(itr.hasNext()){
            StudentDetails sd=(StudentDetails)itr.next();
            System.out.println(sd.rollnum+" "+sd.name+" "+sd.age+" "+sd.dept);
        }

        
        }
    }

