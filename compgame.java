import java.util.*;
public class prog3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Random rd=new Random();
		int com=rd.nextInt(9)+1;
		System.out.println("Enter a number");
		int user=sc.nextInt();
		if(com==user)
		{
			System.out.println("You are right");
		}
		else if(Math.abs(com-user)==1)
		{
			System.out.println("You are close");
		}
		else
		{
			System.out.println("You are wrong");
		}
		System.out.println(com);
		

	}

}

