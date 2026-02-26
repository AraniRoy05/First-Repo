import java.util.*;
public class prog2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a year");
		int y=sc.nextInt();
		boolean res=false;
		if(y%4==0)
		{
			if(y%100==0)
			{
				if(y%400==0)
				{
					res=true;
				}
				else
				{
					res=false;
				}
			}
			else
			{
				res=true;
			}
		}
		else
		{res=false;
		}
		System.out.println(res);
		
		}

	}


