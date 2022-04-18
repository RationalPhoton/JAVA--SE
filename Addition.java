//Problem : Write a java program for Addition of two integers. To do So, Take the number as input from user.

import java.lang.*;
import java.util.*;

class Addition
{
	public static void main(String args[])
	{
		//Scanner class is used to read the input from Keyboard. Create a object of Scanner class and named it as sc.
		Scanner sc = new Scanner(System.in);
		int a,b,c;
		
		//Ask user to input two numbers and store that in variable a and variable b respectively.
		System.out.println("Enter two numbers for Addition:");
		a=sc.nextInt();
		b=sc.nextInt();
		
		//Add the number a & b and store the result into variable c. Finally, display the result on the console.
		c=a+b;
		System.out.println("Addition is: "+c);
	}
}