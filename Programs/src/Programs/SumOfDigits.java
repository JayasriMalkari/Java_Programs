package Programs;

public class SumOfDigits {
	public static void main(String[]args) {
		int num=123;
		int sum=0;
		int rem;
		while(num>0)
		{
			rem=num%10;
			num=num/10;
			sum+=rem;
		}
		System.out.println(sum);
	}

}
