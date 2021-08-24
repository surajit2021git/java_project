package arrayPrograms;
//find biggest sum of two consecutive elements of an given array//

public class ProgramArray3 {

	public static void main(String[] args)
	{
		int[] array= {10,30,20,15,40,12};
		int sum=0;
		for(int i=0;i<array.length-1;i++)
		{
			if(array[i]+array[i+1] > sum )
			{
				sum=array[i]+array[i+1];
			}
		}
		System.out.println("The biggest sum :"+sum);
	}
}
