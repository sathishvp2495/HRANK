package com.apr;

import java.io.*;
import java.util.*;

public class ServiceStartStop {
    public static void main(String args[]) {
    	
    	/*open command prompt*/
          /*  try
            {
                // Just one line and you are done ! 
                // We have given a command to start cmd
                // /K : Carries out command specified by string
               Runtime.getRuntime().exec(new String[] {"Postman", "/K", "Start"});
     
            }
            catch (Exception e)
            {
                System.out.println("HEY Buddy ! U r Doing Something Wrong ");
                e.printStackTrace();
            }*/
    	
    	/*open google chrome*/
    	try {
    	    Process p = Runtime.getRuntime().exec("C:/Program Files (x86)/Google/Chrome/Application/chrome.exe");
    		//Process p = Runtime.getRuntime().exec("C:/Program Files (x86)/Microsoft SQL Server/90/Shared/sqlbrowser.exe");
    		p.waitFor();
    	    System.out.println("Google Chrome launched!");
    	    
    	} catch (Exception e) {
    	    e.printStackTrace();
    	}
        }
}