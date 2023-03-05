import java.util.Arrays;
import java.util.Scanner;

public class ActTest {
	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
//		Account [] a= new Account[10];
//		for (int i=0;i<a.length;i++)
//		{
//			a[i]=new Account(i+1,100,0);
//		}
//		while(true)
//		{
//			System.out.println("Enter An ID");
//			int id=sc.nextInt();
//			if(id>0&&id<11)
//			{
//				while(true)
//				{
//					System.out.println("MAIN MENU\n1: check balance\n2: withdraw\n3: deposit\n4: exit");
//					int opt=sc.nextInt();
//					switch (opt) {
//					case 1:
//						System.out.println("the balnace is "+a[id].getBalance());
//						break;
//					case 2:
//						System.out.println("enter the amount to widtdarw");
//						double amt=sc.nextDouble();
//						a[id].widraw(amt);
//						break;
//					case 3:
//						System.out.println("enter the amount to deposit");
//						double am=sc.nextDouble();
//						a[id].deposit(am);
//						break;
//					default:
//						
//						break;
//					
//					}
//					if(opt==4)
//						break;
//				}
//			}
//		}
//	}
	Account a= new Account("muhammad Maaz", 234, 1000, 4.5);
//	a.deposit(100);
	a.widraw(50);
	a.deposit(89);
	System.out.println("Account History ");
	for (int i=0;i<a.getTransactions().size();i++)
	{
		System.out.println("Date :" +a.getTransactions().get(i).getDate());
		System.out.println("type :"+a.getTransactions().get(i).getType());
		System.out.println("amount :"+a.getTransactions().get(i).getAmount());
		System.out.println("balance :"+a.getTransactions().get(i).getBalance());
		System.out.println("Description :"+a.getTransactions().get(i).getDes());
	}
	
}
}