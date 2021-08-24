package javaProjects;

import java.util.Scanner;

public class AutomorphicNumber {
	public static void main(String[] args)
	{
		System.out.println("Enter the number : ");
		Scanner sc=new Scanner(System.in);
		String numString1=sc.next();
		int number1=Integer.parseInt(numString1);
		Integer number2=number1*number1;
		String numString2=number2.toString();
		if(numString1.equals(numString2.substring(numString2.length()-2)))
		{
			System.out.println("This is a Automorphic number ");
		}
		else
		{
			System.out.println("This is not a Automorphic number ");
		}
		
		sc.close();
		
		
	}

}
