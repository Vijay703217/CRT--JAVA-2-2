import java.util.*;
 class Vijaya
{
public static void main(String [] args)
{
 Scanner s=new Scanner(System.in);
int a,b,c;
a=s.nextInt();
b=s.nextInt();
c=s.nextInt();
int r=(a<b && a<c)?a:(b<c)?b:c;
System.out.println(r);
}
}
