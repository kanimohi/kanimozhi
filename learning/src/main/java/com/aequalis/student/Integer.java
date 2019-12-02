package com.aequalis.student;
import java.util.*;
public class Integer{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,val=0;
        String str="";
        n=sc.nextInt();
        Bag<Coin> bagOfCoins=new Bag<Coin>();
        Bag<Note> bagOfNotes=new Bag<Note>();
        for(int i=0;i<n;i++)
        {
            str=sc.next();
            val=sc.nextInt();
            switch(str)
            {
                case  "Coin":
                    Coin coin=new Coin();
                    coin.setValue(val);
                    bagOfCoins.add(coin);
                    break;
                case  "Note":
                    Note note=new Note();
                    note.setValue(val);
                    bagOfNotes.add(note);
                    break;
            }
        }
        System.out.println("Coins :");
        bagOfCoins.display();
        System.out.println("Notes :");
        bagOfNotes.display();
    }

	public static int parseInt(String trim) {
		return 0;
	}

	public static Collection<?> valueOf(int i) {
		return null;
	}

}
class Coin {
     Integer Val;
    Coin(Integer Val){
        this.Val=Val;
    }
    public void setVal(Integer Val){
        this.Val=Val;
    }
   }
class Note{
    Integer Val;
    Note(Integer Val){
        this.Val=Val;
    }
    public void setVal(Integer Val){
        this.Val=Val;
    }
}
class Bag<T> 
{ 
    Coin coin = null;
    Note note = null;
    public Bag(Coin coin){
        this.coin = coin;
    }
    public Bag(Note note){
        this.note = note;
    }
    ArrayList<T> blist = new ArrayList<T>();
    
    public void add(T t) {
        blist.add(t);

        
    }

    void display() {
        for(Integer coin:bagOfCoins){
            System.out.println(coin);
        }
        for(Integer note:bagOfNotes){
            System.out.println(note);
        }
        
    }
} 




    
