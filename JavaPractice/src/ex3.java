import java.util.*;
public class ex3 {
	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		
		System.out.println("Enter the subtotal n maturity rate ");
		double sub=sc.nextDouble();
		double mat=sc.nextDouble();
		System.out.println("the GRAtutiy is "+mat/10+"$ and total is "+((mat/10)+sub));
	}
}
