package numberPrograms;

public class Prime1 {
	public static void main(String[] args)
	{
		int num=34;
		boolean answer=isPrime(num);
		if(answer==true)
		{
			
			System.out.println("It is a Prime number");
		}
		else
		{
			System.out.println("It is not a prime number");
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
