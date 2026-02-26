import java.util.*;
public class Prog_1 {
    static void input(int arr[])
    {
    	Scanner sc=new Scanner(System.in);
    	for(int i=0;i<arr.length;i++)
    	{
    		arr[i]=sc.nextInt();
    	}
    }
    public static void main(String [] args)
    {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter length of array");
    	int n=sc.nextInt();
    	int a[]=new int[n];
    	int b[]=new int[n];
    	input(a);
    	input(b);
    	int c[]=new int[n];
    	for(int i=0;i<n;i++)
    	{
    		c[i]=a[i]*b[i];
    		System.out.print(c[i]+" ");
    	}
    }
}
