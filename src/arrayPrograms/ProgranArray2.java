package arrayPrograms;
//First two biggest number of a given array//

public class ProgranArray2 {
	public static void main(String[] args)
	{
		int[] array= {18,25,15,70,54,64,87};
		int max1=array[0];
		int max2=array[1];
		for(int i=1;i<array.length;i++)
		{
			if(max1<array[i])
			{
				max2=max1;
				max1=array[i];
			}
			else if(max2 < array[i])
			{
				max2=array[i];
			}
		}
		System.out.println("The first biggest number : "+max1);
		System.out.println("The Second biggest number: "+max2);
	}

}
