package com.apr;

	import java.io.*;
	import java.util.*;

	public class Equalize_the_Array {

	    public static void main(String[] args) {

	        int n=0;
	        Scanner sc=new Scanner(System.in);
	        n=sc.nextInt();
	        int[] array = new int[n];
	        for(int i=0;i<n;i++)
	        {
	          array[i]=sc.nextInt();
	        }
	        // Create a hash map
	        HashMap hm = new HashMap();
	        for(int i=0;i<n;i++)
	        {
	        	
	          // Put elements to the map
	          if(hm.get(new Integer(array[i]))!=null)
	          {
	        	  System.out.println("array[i] = "+array[i]);
	            Integer currentValue = (Integer) hm.get(new Integer(array[i]));
	            
	            int currentIntValue = currentValue.intValue();
	            System.out.println("currentIntValue = "+currentIntValue);
	            hm.put(new Integer(array[i]), new Integer(currentIntValue +1));
	          }
	          else{
	        	  System.out.println("else = "+array[i]);
	          hm.put(new Integer(array[i]), new Integer(1));
	          }
	        }
	        // Get a set of the entries
	      Set set = hm.entrySet();
	      System.out.println("set-------"+set);
	      // Get an iterator
	      Iterator i = set.iterator();
	      System.out.println("i value---------"+i);
	      //Define max
	      int max = 0;
	      // Display elements
	      while(i.hasNext()) {
	         Map.Entry me = (Map.Entry)i.next();
	         Integer gotValue = (Integer) me.getValue();
	         int gotIntValue = gotValue.intValue();
	         System.out.println("max = "+max);
	         if(max<gotIntValue)
	         {
	           max=gotIntValue;
	         }
	      }
	      int output=n-max;
	      System.out.println(output);
	    }
	}