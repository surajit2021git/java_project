package arrayPrograms;
//Program to find biggest element of an given array//




public class ProgramArray1 {
	public static void main(String[] args)
	{
		int[] array= {10,25,15,78,54,62,20,89};
		int max=array[0];
		for(int i=1;i<array.length;i++)
		{
			if(max < array[i])
			{
				max=array[i];
			}
		}
		System.out.println("The biggest value is: "+max);
	}

}
