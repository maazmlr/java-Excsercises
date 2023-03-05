import java.util.Scanner;

public class ex5 {
public static void main(String[] args) {
	Scanner sc= new Scanner (System.in);
	System.out.println("enter an integer 0-1000");
	int a=sc.nextInt();
	
	int fd=a%10;
	a/=10;
	int sd=a%10;
	a/=10;
	int td=a%10;
	a/=10;
	int fod=a%10;
	System.out.println(fd*sd*td);
	
}
}
