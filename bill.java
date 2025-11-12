import java.util.*;
public class bill {

	public static void main(String[] args) {
		
		        Scanner sc = new Scanner(System.in);

		       
		        System.out.print("Enter the number of units consumed: ");
		        int r= sc.nextInt();

		        double bill = 0.0;
		        if(r>50)
		        {
		        	if(r>200)
		        	{
		        		if(r>400)
		        		{
		        			bill = 50 * 3.0 + 150 * 4.80 + 200 * 5.80 + (r - 400) * 6.20;
		        		}
		        		else
		        		{
		        			bill = 50 * 3.0 + 150 * 4.80 + (r - 200) * 5.80;
		        		}
		        	}
		        	else
		        	{
		        		 bill = 50 * 3.0 + (r - 50) * 4.80;
		        	}
		        }
		        else
		        {
		        	bill = r * 3.0;
		        }
		       
		     System.out.println(bill);
	}
}

		       
		       