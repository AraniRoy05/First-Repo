import java.util.*;
public class prog8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Random rd=new Random();
		int m=rd.nextInt(3)+1;
		System.out.println("Enter a year");
		int y=sc.nextInt();
		if(m==1)
			System.out.println("January");
		else if(m==2)
		{
			if((y%4==0 && y%100!=0)||(y%400==0))
			{
				System.out.println("Year is leap year and february has 29 days");
			}
			else
			{
				System.out.println("Year is not a leap year and february has 28 days");
			}
		}
		else 
			System.out.println("March");
            
	}
	

}
