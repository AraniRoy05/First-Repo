import java.util.*;
public class prog_3 {
               public static void main(String[]args)
               {
            	   Scanner sc=new Scanner(System.in);
            	   int n=0;
            	   do
            	   {
            		   n=sc.nextInt();
            		   if(n!=0)
            		   {
            			   if(n%2==0)
            				   System.out.println("Even number");
            			   else
            				   System.out.println("Odd number");
            		   }
            	   }
            	   while(n!=0);
               }
               
}
