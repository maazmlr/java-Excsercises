import java.util.*;
public class ex6 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter an integer to check if its palindrime or not");
	int i=sc.nextInt();
	int k=i;
	int j;
	j=i%10;
	i/=10;
	j=i%10;
	i/=10;
	j=i%10;
	if(i==j)
	{
		System.out.println("true");
	}
			
}
}
