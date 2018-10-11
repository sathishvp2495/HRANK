package com.apr;

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class SimpleArraySum {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        int sum =0;
        for(int i=0;i<n;i++){
            sum+= in.nextInt();
        }
        System.out.println(sum);
    }
}
