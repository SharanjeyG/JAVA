import java.util.*;
class Swap{/*Multiline Comment*/
	public static void main(String args[]){
		float a,b;
		Scanner d=new Scanner(System.in);
		System.out.println("Enter First value:");
		a=d.nextInt();
		System.out.println("Enter Second value:");
		b=d.nextInt();
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("Swapped First Value:"+a);
		System.out.println("Swapped Second Value:"+b);
	}
}