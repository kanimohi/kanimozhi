package com.aequalis;
import java.util.Scanner;
import java.util.ArrayList;
public class IfCondition{

    public static void main(String[] args) {
         ArrayList<Integer> a = new ArrayList<Integer>();
         ArrayList<Integer> al =new ArrayList<Integer>();
        Scanner in = new Scanner(System.in);
        int wallPositions = in.nextInt();
        int wallHeights = in.nextInt();
        a.add(wallPositions);
        al.add(wallHeights);
        int max = 0;

        int n = (int)wallPositions;
        int m = (int)wallHeights;
        for (int i = 0; i < n - 1; i++) {
            if (a[i] < a[i + 1] - 1) {
                int heightDiff = Math.abs(al[i + 1] - al[i]);
                int gapLen = a[i + 1] - a[i] - 1;
                int localMax = 0;
                if (gapLen > heightDiff) {
                    int low = Math.max(al[i + 1], al[i]) + 1;
                    int remainingGap = gapLen - heightDiff - 1;
                    localMax = low + remainingGap / 2;

                } else {
                    localMax = Math.min(al[i + 1], al[i]) + gapLen;
                }

                max = Math.max(max, localMax);
            }
        }

        return max;
    }
}

      
      
        
    