import java.util.*;

public class prime_num {

	public static void main(String[] args) {
		
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number");
    int num=sc.nextInt();
    int c=0;
    for(int i=1;i<=num;i++)
    {
    	if(num%i==0)
    		c++;
    }
    if(c==2)
    	System.out.println("Prime Number");
    else
    	System.out.println("Not Prime Number");
	}

}
