package com.aequalis;
public class TestArray3{

    public static void main(String[] args) {
        int a[][] = {{3,4,5},{2,4,5}};
        int b[][] = {{2,6,4},{4,5,2}};
        int c[][] = new int[2][3];
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
            c[i][j] = a[i][j]+b[i][j];
            System.out.print(c[i][j]+ " ");
            }
             System.out.println();
        }
    }

}