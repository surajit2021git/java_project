package arrayPrograms;



public class Test2 {

	public static void main(String[] args) {
	
	String name="I have Done it";
	


	String[] firstName=name.split("\\s");
	for(int i=firstName.length-1;i>=0;i--)
	{
		System.out.print(firstName[i]);
		System.out.print(" ");
	}
	
	
	}
}
