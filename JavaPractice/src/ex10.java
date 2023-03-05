import java.util.*;
public class ex10 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		cal(1000, 10, 5);
		
	}
	public static void cal(double  invAmt,double rate,int years)
	{
		double result;
		for (int i=1;i<=years;i++)
		{
			result=invAmt*(rate/100);
			result+=invAmt;
			
			invAmt=result;
		System.out.println(i+" amount"+result);
		}
	}
}
