package testcase;
import java.util.*;
public class Example2 {
       public static void main(String args[])
       {
    	   Scanner s=new Scanner(System.in);
   		System.out.println("Enter the value:");
   		int n=s.nextInt();
   		for(int i=1;i<=n;i++)
   		{
   			for(int j=1;j<=n;j++) 
   			{
   				   if(i==1||j==1||j==n||i==n) 
   				   {
   					   System.out.print("*");
   				   }
   				else
   				 {
   					 System.out.print(" ");
   				 }
   			}
   			System.out.println();
   			}
       }
}
