package com.aequalis;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Array {

    // Complete the compareTriplets function below.
    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int al = 0;
        int bl = 0;
        for(int i=0;i<n;i++){
                if(a[i]>b[i]){
                     al+=1;
                }
                else if(b[i]>a[i]){
                    bl+=1;
                }
            }
        
       return(al+" "+bl);
        
    }

        


    

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> b = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());
            List<Integer> result = compareTriplets(a, b);

            bufferedWriter.write(
                result.stream()
                    .map(Object::toString)
                    .collect(joining(" "))
                + "\n"
            );
    
            bufferedReader.close();
            bufferedWriter.close();
    }
}

        
            


