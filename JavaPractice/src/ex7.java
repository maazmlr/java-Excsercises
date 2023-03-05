import java.util.Scanner;

public class ex7 {
//	Write a Java method to find the smallest number among three numbers.

	public static void main(String[] args) {
		int num1=9;
		int num2 =10;
		int num3=2;
		System.err.println(max(num1, num2, num3));
		
		
		
		
	}
	public static int max(int n1,int n2,int n3)
	{	
		if ((n1<n2)&&(n1<n3))
		{
			return n1;
		}
		else if((n2<n1)&&(n2<n3))
		{
			return n2;
		}
		return n3;
		
	}
}
