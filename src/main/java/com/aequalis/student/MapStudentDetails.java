package com.aequalis.student;
import java.util.*;

public class MapStudentDetails {
   static  HashMap<Integer,MapDetails> map = new HashMap<Integer,MapDetails>();

    public static void main(String []args){
		    boolean y=true;
			Scanner in = new Scanner(System.in);
		do{
            System.out.println("Enter a key value:");
			Integer key=in.nextInt();
			for(int i=0;i<=key;i++){
			System.out.println("Enter a student Id:");
            Integer sid=in.nextInt();
            System.out.println("Enter a student Name:");
			String sname=in.next();
			System.out.println("Enter a student Age:");
            Integer sage=in.nextInt();
            System.out.println("Enter a student Dept:");
			String sdept=in.next();
			map.put(i,new MapDetails(sid, sname,sage ,sdept)); 
			for(Map.Entry<Integer, MapDetails> entry:map.entrySet()){     
				MapDetails b=entry.getValue();  
				System.out.println(b.Rollnum+" "+b.Name+" "+b.Age+" "+b.Dept);   
			}  
		}        
		System.out.println("Do you want to process more? y/n");
		String x = in.next();
		char ch  = x.charAt(0); 
		if( ch == 'n')
			y = false;
	}
	
		while(y!= false);
	}

}
		
	





    
    