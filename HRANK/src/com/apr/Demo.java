package com.apr;

public class Demo {

	
	
	    public native int square(int i);
	    public static void main(String[] args) {
	        System.loadLibrary("Main");
	        System.out.println(new Demo().square(2));
	    }
}
