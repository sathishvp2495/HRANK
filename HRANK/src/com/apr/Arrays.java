package com.apr;

import java.io.*;
import java.util.*;

/*Sample Input

4
1 4 3 2*/

/*Sample Output

2 3 4 1*/

public class Arrays {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        
        int arr[] = new int[n];
        for(int i=0; i < n; i++){
            arr[i] = in.nextInt();
        }
        
        in.close();
        
        for (int i= arr.length-1; i>=0; i--){
            System.out.print(arr[i] + " ");
        }
    }
}
