package com.aequalis.student;
import java.util.*;
public class InheritanceChild extends Inheritance{
String studentname="k";
Integer rollnumber=18;
String department="IT";
public static void main(String []args){
InheritanceChild ic=new InheritanceChild();
System.out.println(ic.deptcode);
System.out.println(ic.deptname);
System.out.println(ic.studentname);
System.out.println(ic.rollnumber);
System.out.println(ic.department);
ic.does();
}
}



