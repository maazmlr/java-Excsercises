import java.util.InputMismatchException;
import java.util.Scanner;

public class ex {
	public void input(int n) throws ArrayIndexOutOfBoundsException{
		
		
	}
	public static void main(String[] args) {
		String[] months = {"January", "February", "March", "April",
				"May", "June","July", "August", "September", "October",
				"November", "December"};
		int[] dom = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; 
		
		Scanner sc= new Scanner (System.in);
		
		try {
			System.out.println("Enter month number 1-12");
			int n=sc.nextInt();
			System.out.println("month name is "+months[n-1]);
			System.out.println("month have days "+dom[n-1]);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("wrong number");
		}
		catch(InputMismatchException e) {
			System.out.println("wrong input");
			
		}
		

	}

}
