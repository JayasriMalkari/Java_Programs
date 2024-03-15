package Programs;
import java.util.Scanner;
public class Composite {
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a value");
		int Num=scan.nextInt();
		int M=Num/2;
		//System.out.println("Enter a value");
		if( Num<=1) {
			System.out.println("NOt Compossite");}
		for(int i=2;i<=M;i++) {
			if(Num%i==0) {
				System.out.println("Composite");
				System.out.println("Composite");
				break;
			}
			else {
				System.out.println("NOt Composite");
				break;
			}
			
		}
			
		}
	}

