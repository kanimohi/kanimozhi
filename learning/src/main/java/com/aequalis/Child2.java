package com.aequalis;
public class Child2 extends Parent {
    void msg()throws ArithmeticException{
        System.out.println("Child");
}
public static void main(String []args){
    Parent p=new Child2();
    p.msg();
}
}