package com.aequalis.student;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class K {
    public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    String[] a = br.readLine().split(" ");
    
    int[] arr = new int[n];

    for(int i = 0; i<n; i++){
        arr[i] = Integer.parseInt(a[i]);
    }

    int flag = 0;
    for(int i = 0; i<n-1; i++){
        for(int j = i+1; j<n; j++){
            if( arr[i] < arr[j] ){
                flag = 0;
                break;
            }else{
                flag = 1;
            }
        }
        if(flag == 1){
            System.out.print(arr[i] + " ");
        }
    }
    System.out.print(arr[n-1]);
    
}
}
    




