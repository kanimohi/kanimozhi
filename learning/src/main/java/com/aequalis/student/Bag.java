package com.aequalis.student;

public class Bag<T> {
    Integer Coin;
    Integer Note;
    Bag(Integer Coin,Integer Note){
        this.Coin=Coin;
        this.Note=Note;
    }
    public void setCoin(Integer Coin){
        this.Coin=Coin;
    }
    public Integer getCoin(){
     return Coin;
    }
    public void setNote(Integer Note){
       this.Note=Note;;
    }
    public Integer getNote(){
     return Note;
    }
    
    public static Bag nextInt() {
     return null;
    }
     
}


