package numberPrograms;

public class FindLCM {
	public static void main(String[] args)
	{
		System.out.println(isLcm(12, 15));
		
	}
	
	public static int isLcm(int num1,int num2)
	{
		int temp=1;
		int max=num1;
		if(num2>num1)
		{
			max=num2;
		}
		while(true)
		{
			int max1=max*temp;
			if(max1%num1==0 && max1%num2==0)
			{
				return max1;
			}
			
			//System.out.println(max1);
			temp++;
	
		}
	}

}
