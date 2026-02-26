import java.util.*;
public class prog_1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
				System.out.println("Eneter a number");
                  int n=sc.nextInt();
                  int sum=0;
                  while(n!=0)
                  {
                	  sum=sum+(n%10);
                	  n=n/10;
                  }
                  if(sum%9==0)
                  {
                	  System.out.println("Divisible by 9");
                  }
                  else
                	  System.out.println("Not Divisible by 9");
                  
	}

}
