package com.aequalis;
public class Constructor{
    int id;
    String name;
    
    Constructor(int i,String n) {
        id = i;
        name = n;
    }
    
    void display() {
        System.out.println(id+" "+name);
    }
    public static void main(String []args){
        Constructor c1 = new Constructor(5,"j");
        Constructor c2 = new Constructor(6,"h");
        c1.display();
        c2.display();
    }

}