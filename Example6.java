package testcase;
import java.util.*;
public class Example6 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("String:");
		String str=s.nextLine();
		for(int i=0;i<str.length();i++)
		{
			if(Character.isAlphabetic(str.charAt(i)))//to check the character is alphabet
			{
				System.out.print(str.charAt(i));
	        }
			else 
			{
				int a=Character.getNumericValue(str.charAt(i));//to store the numeric value in given string
			    for(int j=1;j<a;j++)
				{
					System.out.print(str.charAt(i-1));
				}
			}
		}
	}

}
