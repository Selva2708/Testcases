package testcase;
import java.util.*;
public class Example10 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("No:");
		int n=s.nextInt();
		int c,m=2*n,k;
		for(int i=1;i<=m;i=i+2,n--)
		{
			c=i;
			k=n;
			for(int j=1;j<=c;j++)
			{
				while(k!=0)
				{
					--k;
					System.out.print(" ");
			    }
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
