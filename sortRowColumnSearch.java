package sem_2;
import java.util.*;
public class sortRowColumnSearch {
	public static void search(int[][]matrix,int target)
	{
		int r=0;
		int c=matrix.length-1;
		while(r<matrix.length && c>=0)
		{
			if(matrix[r][c]==target)
			{
				System.out.println("Target found in row "+ r + " and column "+c);
				return;
			}
			else if(matrix[r][c]<target)
			{
				r++;
			}
			else
			{
				c--;
			}
		}
		System.out.println("Target not found");
	}
	public static void main(String args[])
	{
		int [][] arr= {
			               {10, 20, 30, 40},
			               {15, 25, 35, 45},
			               {17, 27, 37, 47},
			               {19, 29, 39, 49}
		};
		search(arr,40);
		
		}
	}


