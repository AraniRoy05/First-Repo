import java.util.*;
public class prog4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 3 numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if(a<b && b<c)
		{
			System.out.println("Increasing");
		}
		else if(a>b && b>c)
		{
			System.out.println("Decreasing");
		}
		else
		{
			System.out.println("Neither");
			
		}

	}

}
