package Java_Concepts;

public class Reverse_String {

	public static void main(String[] args)
	{
		String name = "Nazeera";
		String revname = ""	;
		
		int len = name.length(); //7 
		
		for(int i = len-1; i>=0; i--)
		{
			revname = revname+name.charAt(i);
			
			
		}
		
		System.out.println("Reversed string is:"+revname);
	}

}
