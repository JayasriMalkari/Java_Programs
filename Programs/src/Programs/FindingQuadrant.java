package Programs;
import java.util.Scanner;
public class FindingQuadrant {
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the value of X and Y ");
		int X=scan.nextInt();
		int Y=scan.nextInt();
		if(X>0 && Y>0) {
			System.out.println("Entered point is in the 1st Quadrant");
		}
		else if (X<0 && Y>0) {
			System.out.println("Entered point is in the 2nd Quadrant");
			
		}
		else if (X<0 && Y<0) {
			System.out.println("Entered point is in the 3rd Quadrant");
		}
		else if (X>0 && Y<0) {
			System.out.println("Entered point is in the 4th Quadrant");
		}
		else if (X!=0 && Y==0) {
			System.out.println("Entered point is on the X-axis");
		}
		else if (X==0 && Y!=0) {
			System.out.println("Entered point is on the Y-axis");
		}
		else if (X==0 && Y==0) {
			System.out.println("Enterd point is on the Origin");
		}
	}

}
