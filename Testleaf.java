import java.util.*;

class Testleaf

{
	public static void main(String[]args)
	{
		Scanner s=new Scanner(System.in);
	
	int a;
	System.out.println("enter a number");
     a=s.nextInt();
       
	 
		 if(a%4==0&&(a%100!=0 || a%400==0))
		{
		 System.out.println("it is a leaf year");
		
 		}
        else
			
		      {

            	 System.out.println("it is  not a leaf year");
	           }
           }}

