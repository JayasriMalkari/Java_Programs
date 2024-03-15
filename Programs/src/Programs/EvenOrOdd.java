package Programs;
import java.util.Scanner;
public class EvenOrOdd {
	public static void main(String[]args) {
		System.out.println("Enter a number:");
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		if (n%2==0) {
			System.out.println("Entered number "+n+"is Even");
		}
		else {
			System.out.println("Entered number "+n+"is Odd");
		}
		
		
	}

}
