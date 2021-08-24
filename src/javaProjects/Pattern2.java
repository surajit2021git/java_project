package javaProjects;

public class Pattern2 {

	public static void main(String[] args)
	{
		int number=5;
		for(int row=1;row<=number;row++)
		{
			for(int star=1;star<=row;star++)
			{
				System.out.print("* ");
			}
			System.out.println("");
		}
	}
}
