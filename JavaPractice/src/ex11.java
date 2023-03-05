import java.util.*;
public class ex11 {
	public static void main(String[] args) {
		String p="abcd1234#2";
		Pass(p);
		
		
	}
	public static void Pass(String p)
	{
		int numCount=0;
		int charCount=0;
		
		if (p.length()<10)
		{
			System.out.println("password length at least 10 characters");
		}
		
		
			for (int i =0;i<p.length();i++)
			{
				if(isNumeric(p.charAt(i))) {
					numCount++;
				}
				else if (isString(p.charAt(i)))
				{
					charCount++;
				}
				else {
					System.out.println("password contain only digits and character");
				}
			}
				if(numCount>2)
				{
					System.out.println("password can only contain 2 digits");
				
			
			}
				else {
					System.out.println("password eligible "+p);
				}
	}
	
	public static boolean isNumeric(char a)
	{
		return(a>='0'&&a<='9');
	}
	public static boolean isString(char c)
	{
		c=Character.toUpperCase(c);
		return(c>='A' && c<='Z');
	}

}
