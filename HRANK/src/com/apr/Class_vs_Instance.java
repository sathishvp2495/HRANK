package com.apr;


import java.io.*;
import java.util.*;
public class Class_vs_Instance {
    private int age;	
  
    public Class_vs_Instance(int initialAge) {
  		// Add some more code to run some checks on initialAge
        this.age=initialAge;
	}

	public void amIOld() {
  		// Write code determining if this person's age is old and print the correct statement:
        if(this.age<0)
          { System.out.println("Age is not valid, setting age to 0.");
           this.age=0;
           amIOld();
          }
        else if(this.age<13)
            System.out.println("You are young.");
        else if(this.age<18)
            System.out.println("You are a teenager.");
        else if(this.age>=18)
            System.out.println("You are old.");
	}

	public void yearPasses() {
  		// Increment this person's age.
        this.age+=1;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			int age = sc.nextInt();
			Class_vs_Instance p = new Class_vs_Instance(age);
			p.amIOld();
			for (int j = 0; j < 3; j++) {
				p.yearPasses();
			}
			p.amIOld();
			System.out.println();
        }
		sc.close();
    }
}
