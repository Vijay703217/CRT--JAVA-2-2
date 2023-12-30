import java.util.*;
class Run
{
public static void main(String [ ] arg)
{
Scanner in=new Scanner(System.in);
System.out.println("Enter an number");
int n=in.nextInt();
int t=n,x;
x=n;
int r=0,d;
while (t>0)
{
d=t%10;
r=r*10+d;
t=t/10;
}
if (r==x){
System.out.println("isa palinodrome");
}
else
{
System.out.println(" is a not a palinodrome");}}
}