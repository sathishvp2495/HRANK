package com.apr;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CompareTriplets {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int alice=0;
        int bob=0;
        int a0 = in.nextInt();
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int b0 = in.nextInt();
        int b1 = in.nextInt();
        int b2 = in.nextInt();
        
        if (a0<b0){
            bob+=1;
            
        }
        if (a1<b1){
            bob+=1;
            
        }
        if (a2<b2){
            bob+=1;
           
        }
        if(a0>b0 ){
            alice+=1;
           
            
        }
        if(a1>b1 ){
            alice+=1;
            
            
        }
        if(a2>b2){
            alice+=1;
            
            
        }
        if(a0==b0){
            alice+=0;
           bob+=0;          
           
        }
        if(a1==b1){
            alice+=0;
           bob+=0;          
           
        }
        if(a2==b2){
            alice+=0;
           bob+=0;          
           
        }
        System.out.println(alice+" "+bob);
    }
}