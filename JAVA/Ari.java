import java.util.*;
class Ari{/*Multiline Comment*/
	public static void main(String args[]){
		int a,b;
		float c,e;
		String s;
		Scanner d=new Scanner(System.in);
		System.out.println("Enter the Operation:");
		s=d.nextLine();
		System.out.println("Enter the a value:");
		a=d.nextInt();
		System.out.println("Enter the b value:");		
		b=d.nextInt();
		System.out.println("Enter the c value:");
		c=d.nextFloat();
		e=a+b+c;
		System.out.println("Output="+e);
		System.out.println(s+" is performed");
	}
}