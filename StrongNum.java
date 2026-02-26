import java.util.*;
public class prog_1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		int temp=num;
		int sum=0;
		int l=0;
	
		while(num!=0)
		{
			int f=1;
			l=num%10;
			for(int i=1;i<=l;i++)
			{
			 f=f*i;
			}
			sum=sum+f;
			num=num/10;
		}
		if(sum==temp)
		{
			System.out.println("Strong number");
		}
		else
		{
			System.out.println("Not Strong number");
		}

	}

}
