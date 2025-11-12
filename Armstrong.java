import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a number");
		int N=sc.nextInt();
		int N1=N;
		int n=0;
		while(N>0)
		{
			int m=N%10;
		 n = n + (int)Math.pow(m, 3);
	     N/=10;
		}
        if(n==N1)
        	System.out.println("Armstrong Number");
        else
        	System.out.println("Not Armstrong Number");
	}

}
