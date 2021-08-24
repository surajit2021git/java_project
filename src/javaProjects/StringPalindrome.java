package javaProjects;

import java.util.Scanner;

public class StringPalindrome {
	public static void main(String[] args)
	{
		System.out.println("Enter the String : ");
		Scanner sc=new Scanner(System.in);
		String string=sc.next();
		int count=0;
		char[] ch=new char[string.length()];
		for(int i=string.length()-1;i>=0;i--)
		{
			ch[count]=string.charAt(i);
			count++;
		}
		String string2=new String(ch);
		if(string.equals(string2))
		{
			System.out.println("It is a palindrome String");
		}
		else
		{
			System.out.println("It is not a plaindrome String");
		}
		sc.close();
	}

}
