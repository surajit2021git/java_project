package numberPrograms;

public class StringToInterger {

	public static void main(String[] args)
	{
		int num=convert("2315");
		System.out.println(num);
		
	}
	public static int convert(String s)
	{	
		int out=0;
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			out=out*10 +(ch-48);
		}
		return out;
	}
}
