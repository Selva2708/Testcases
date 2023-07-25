package testcase;
import java.util.*;
public class Example4 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the value n:");
		int n=s.nextInt();
		System.out.print("Enter the value m:");
		int m=s.nextInt();
		System.out.print("Enter the value N:");
		int N=s.nextInt();
		
		for(int i=n;i<=m;i++)
		{
			int val=i;
			int sum=0,d;
		while(val!=0)
		{
			d=val%10;
			sum=sum+d;
			val=val/10;
		}
		if(N==sum)
		{
			System.out.println(i);
		}
		}

	}

}
