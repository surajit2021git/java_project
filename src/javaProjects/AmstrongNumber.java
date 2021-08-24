package javaProjects;

import java.util.Scanner;

public class AmstrongNumber {
	public static void main(String[] args)
	{
		System.out.println("Enter the Number :");
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		int temp=number;
		int sum=0;
		while(number>0)
		{
			int r=number%10;
			sum=sum+(r*r*r);
			number=number/10;
		}
		if(temp==sum)
		{
			System.out.println("It is a Amstrong number");
		}
		else
		{
			System.out.println("It is not a Amstrong number");
		}
		sc.close();
	}

}
