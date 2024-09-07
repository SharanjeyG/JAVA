import java.util.*;
class Area{/*Multiline Comment*/
	public static void main(String args[]){
		int a,b,c;
		Scanner d=new Scanner(System.in);
		System.out.println("Enter the value of a:");
		a=d.nextInt();
		System.out.println("Enter the value of b:");
		b=d.nextInt();
		c=((a*a)+(b*b)+(2*a*b));
		System.out.println("Area:"+c);
	}
}