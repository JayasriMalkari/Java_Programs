package Programs;
import java.util.Scanner;
public class Prime {
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number");
		int Num=scan.nextInt();
		int m=Num/2;
		if(Num==0||Num==1) {
			System.out.println("Not prime");
		}
		for(int i=2;i<=m;i++){
			if (Num%i==0) {
				System.out.println("NOt Prime");
				break;
			}
			else {
				System.out.println("Prime");
				break;
			}
		}
				
				
				
		
		
	
	}

}
