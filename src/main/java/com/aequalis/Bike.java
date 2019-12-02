package com.aequalis;
import java.util.*;
        public class Bike {
        
            public static void main(String[] args){
                ArrayList<ArrayList<Integer>> rows = new ArrayList<>();
                ArrayList<Integer> row = new ArrayList<>();
                Scanner in = new Scanner(System.in);
                int n = in.nextInt();
                
                for (int i = 0; i < n; i++) {
                    int d = in.nextInt();
                    
                    for (int j = 0; j < d; j++) {
                        row.add(in.nextInt());
                    }
                    
                    rows.addAll(row);
                }
                
                int q = in.nextInt();
                
                for (int i = 0; i < q; i++) {
                    int x = in.nextInt();
                    int y = in.nextInt();
                    
                    try {
                        System.out.println(rows.get(x -1));
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("ERROR!");
                    }
                }
            }
        }
        
        
