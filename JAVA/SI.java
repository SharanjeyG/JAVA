import java.util.*;
class SI{
public static void main(String args[])
{
float p,n,r,si;
Scanner din=new Scanner(System.in);
System.out.println("Enter the Principle value :");
p=din.nextFloat();
System.out.println("Enter the Number of years :");
n=din.nextFloat();
System.out.println("Enter the Rate  of Interest :");
r=din.nextFloat();
si=(p*n*r)/100;
System.out.println("SI:"+si);
}
}  