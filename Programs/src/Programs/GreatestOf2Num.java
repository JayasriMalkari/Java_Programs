package Programs;
import java.util.Scanner;
public class GreatestOf2Num {
	public static void main(String[]args) {
		System.out.println("Enter a Two NUmbers:");
		Scanner scan=new Scanner(System.in);
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		if(num1>num2) {
			System.out.println("The greatest number is "+num1);
		}
		else {
			System.out.println("The greatest number is "+num2);
		}
		
	}

}
