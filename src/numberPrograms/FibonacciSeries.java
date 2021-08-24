package numberPrograms;

public class FibonacciSeries {
	public static void main(String[] args)
	{
		isFibo(10);
	}
	
	public static void isFibo(int count)
	{
		int num1=0;
		System.out.println(num1);
		
		int num2=1;
		System.out.println(num2);
		for(int i=3;i<=count;i++)
		{
			int num3=num1+num2;
			System.out.println(num3);
			num1=num2;
			num2=num3;
			
		}
	}

}
