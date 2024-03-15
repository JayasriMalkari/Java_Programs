package Programs;
import java.util.Scanner;
public class Perfect {
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number");

		int Num=scan.nextInt();
		int Sum=0;
		int m=Num/2;
		//System.out.println("Enter a number");
		for (int i=1; i<=m;i++) {
			if (Num%i==0) {
				Sum+=i;
				
			}
			
		}
		if(Sum==Num) {
			System.out.println("Given Number "+Num+"is perfect number");
		}
		else {
			System.out.println("Given number "+ Num+" is Not a perfect number");
		}
		
			
		
	}

}
