import java.util.*;

class Quadraticequation

{
	public static void main(String[]args)
	{
		Scanner s=new Scanner(System.in);
	
	double a,b,c;
	System.out.println("enter a numbers");    
        a=s.nextDouble();
        b=s.nextDouble(); 
	    c=s.nextDouble();
		double r1,r2,d;
		d=b*b-4*a*c;
		if(d<0)
		{
			System.out.println("the roots are not possiable");
		}
		 else
		{
		r1=(-b+Math.sqrt(d))/(2*a);
        r2=(-b-Math.sqrt(d))/(2*a);
		 System.out.println("the root 1="+r1);
		 System.out.println("the root 2="+r2);
		
 		}
           }}

