package automaion.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.regex.Pattern;

import org.testng.annotations.Test;

public class Question1 {

    static String driverPath = (new java.io.File("").getAbsolutePath());
    static String fileLocation = driverPath + "/fruits.txt";
    static int i=1;
    
    @Test
    public static void canReadFile() throws IOException
    {
    	doesFileExist(fileLocation);
    	
    }
    public static void doesFileExist(String fileLocation) throws IOException
    {
    	try (BufferedReader br = new BufferedReader(new FileReader(fileLocation))) {
    	    String line;
    	    while ((line = br.readLine()) != null) {
    	       // process the line.
    	    	
    	    	String[] splitted = line.split(" – ");
    	    	System.out.println("Word " + i +" is " +splitted[0]);
    	    	System.out.println("Meaning " + i + " is "+splitted[1]);
    	    	i+=1;

    	    }
    	}
        
    }


}
