package testcase;
import java.util.*;
public class Example7 {
public static void main(String args[])
{
	Scanner s=new Scanner(System.in);
    System.out.print("Enter the string:");
    String str=s.nextLine();
      str=str.toLowerCase();
      int count1=0,count2=0,count3=0,count4=0,count5=0;
      for(int i=0;i<str.length();i++)
      {
    	  if(str.charAt(i)=='a')
    	  {
    		  count1++;
          }
    	  else if(str.charAt(i)=='e')
    	  {
    		  count2++;
          }
    	  else if(str.charAt(i)=='i')
    	  {
    		  count3++;
          }
    	  else if(str.charAt(i)=='o')
    	  {
    		  count4++;
          }
    	  else if(str.charAt(i)=='u')
    	  {
    		  count5++;
          }
    	  
      }
      System.out.println("a:"+count1);
      System.out.println("e:"+count2);
      System.out.println("i:"+count3);
      System.out.println("o:"+count4);
      System.out.println("u:"+count5);
	}
}

