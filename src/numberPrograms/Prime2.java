package numberPrograms;

//prime numbers between 1 to 50


public class Prime2 {
	public static void main(String[] args)
	{
		for(int count=1;count<=50;count++)
		{
			boolean answer=isPrime(count);
			if(answer==true)
			{
				System.out.print(count);
				System.out.print(" ");
			}
		}
	}
	
	public static boolean isPrime(int num)
	{
		if(num==1)
		{
			return false;
		}
		for(int i=2;i<num/2;i++)
		{
			if(num%i==0)
			{
				return false;
			}
			
		}
		return true;
	}
}
