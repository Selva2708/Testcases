package testcase;
import java.util.*;
public class Example1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("No:");
		int n=s.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println(" ");
		}
		}

}

	
