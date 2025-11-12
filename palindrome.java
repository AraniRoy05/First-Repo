import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int N=sc.nextInt();
		int N1=N;
		int N2=0;
		while(N>0)
		{
		int n=N%10;
		 N2=(N2*10)+n;
		 N/=10;

	}
		if(N2==N1)
			System.out.println("Palindrome Number");
		else
			System.out.println("Not Palindrome Number");

}
}

