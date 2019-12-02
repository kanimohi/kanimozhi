package com.aequalis.student;
import java.util.*;
public class StudentDetails3{
    Integer Rollnum;
    String Name;
    Integer Age;
    String Dept;
    StudentDetails3(Integer Rollnum,String Name,Integer Age,String Dept){
        this.Rollnum=Rollnum;
        this.Name=Name;
        this.Age=Age;
        this.Dept=Dept;
    }
    public void setRollnum(Integer Rollnum){
        this.Rollnum=Rollnum;
    }
    public Integer getRollnum(){
     return Rollnum;
    }
    public void setName(String Name){
       this.Name=Name;;
    }
    public String getName(){
     return Name;
    }
    public void setAge(Integer Age){
        this.Age=Age;
    }
    public Integer getAge(){
     return Age;
    }
    public void setDept(String Dept){
        this.Dept=Dept;
    }
    public String getDept(){
     return Dept;
    }
    public static StudentDetails3 nextInt() {
     return null;
    }
     
}
