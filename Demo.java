 import java.util.*;

class  Demo

{
	public static void main(String[]args)
	{
		Scanner s=new Scanner(System.in);
		

	int a,b,c;
     System.out.println("enter a values");

	 a=s.nextInt();

	 b=s.nextInt();
	  
	 c=s.nextInt();
	 if  (a>b)
		
		{ 
			if (a>c)
			{
				System.out.println("gretest number is="+a);
			}
			else
			{
		 System.out.println("gretest number is ="+c);}
 		}
     else
		 if(b>c)
		{
		 System.out.println("greatest  no="+b);

		}
		else
		{
			System.out.println("greatest no"+c);
		}
	}}