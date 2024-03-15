package Programs;
import java.util.Scanner;
public class GreatestOf3Nums {
	public static void main(String[]args) {
		System.out.println("Enter three numbers:");
		Scanner scan=new Scanner(System.in);
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		int num3=scan.nextInt();
		if(num1>num2 && num1>num3) {
			System.out.println("The greatest number is "+num1);
		}
		else if(num2>num1 && num2>num3) {
			System.out.println("The greatest number is "+num2);
		}
		else {
			System.out.println("The greatest number is "+num3);
		}
		
		
		
	}

}
