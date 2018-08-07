package automaion.test;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import org.testng.annotations.Test;

public class Question3 {
	
	int n;
	
	
	
	
	@Test
	public void generateNumber()
	{
		int[] intArray = new int[500];
		for (int i=0; i<500;i++)
		{
			Random rand = new Random();

			n = rand.nextInt(1000000) + 500000;
			System.out.println("Number is " +n);
			intArray[i]=n;
			
		}
		
		Arrays.sort(intArray);
		 
		System.out.println("The sorted int array is:");
	      for (int number : intArray) {
	         System.out.println("Sorted Nummber = " + number);
	      }
	      
	      Scanner input = new Scanner(System.in);
	      System.out.println("What number of the list would you like to print?");
          String myItem = input.next();
          int result = Integer.parseInt(myItem);
          System.out.println("The number at position "+myItem +" is " +intArray[result] );
	}

}
