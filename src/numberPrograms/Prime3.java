package numberPrograms;

//First 20 prime numbers

public class Prime3 {
	public static void main(String[] args)
	{
		int count=0;
		for(int num=1;count<20;num++)
		{
			boolean answer=isPrime(num);
			if(answer==true)
			{
				System.out.print(num);
				System.out.print(" ");
				count++;
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
