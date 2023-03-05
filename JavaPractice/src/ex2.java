import java.util.Scanner;

public class ex2 {
public static void main(String[] args) {
	double side;
	Scanner sc= new Scanner (System.in);
	System.out.println("Enter the side of a triangle");
	side=sc.nextDouble();
	
	double area=(Math.sqrt(3)/4)*(Math.pow(side, 2));
	double vol=area*side;
	System.out.println("the area is "+area);
	System.out.println("the vol is "+vol);
}
}
