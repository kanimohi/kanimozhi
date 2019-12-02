package com.aequalis.student;
public class MapDetails{
    int Rollnum;
    String Name;
    int Age;
    String Dept;
    MapDetails(Integer Rollnum,String Name,Integer Age,String Dept){
        this.Rollnum=Rollnum;
        this.Name=Name;
        this.Age=Age;
        this.Dept=Dept;
    }

    public int getRollnum() {
        return Rollnum;
    }

    public void setRollnum(int rollnum) {
        Rollnum = rollnum;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getDept() {
        return Dept;
    }

    public void setDept(String dept) {
        Dept = dept;
    }

}