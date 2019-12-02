package com.aequalis.student;
import java.*;
import com.aequalis.ArrayList;
public class Delete1{
     Integer Rollnum;
     String Name;
     Integer Age;
     String Dept;
      Delete1(Integer Rollnum,String Name,Integer Age,String Dept){
          this.Rollnum=Rollnum;
          this.Name=Name;
          this.Age=Age;
          this.Dept=Dept;
      }

    public Integer getRollnum() {
        return Rollnum;
    }

    public void setRollnum(Integer rollnum) {
        Rollnum = rollnum;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Integer getAge() {
        return Age;
    }

    public void setAge(Integer age) {
        Age = age;
    }

    public String getDept() {
        return Dept;
    }

    public void setDept(String dept) {
        Dept = dept;
    }

      
    
}
