import java.util.Scanner;

public class ex9 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String s="The quick brown fox jumps over the lazy dog.";
	System.out.println(middle(s));
}
public static int middle(String s)
{
	 String[] arr=s.split(" ");
	 return arr.length;
}
}
