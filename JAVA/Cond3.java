import java.util.*;
class Cond3 {
    public static void main(String args[]){
        int a,b,f,e,c,tot;
        float avg;
        Scanner d=new Scanner(System.in);
        System.out.println("Enter Five marks:");
        a=d.nextInt();
        b=d.nextInt();
        c=d.nextInt();
        f=d.nextInt();
        e=d.nextInt();
        tot=a+b+c+f+e;
        avg=tot/3;
        if(a>=50 && b>=50 && c>=50 && f>=50 && e>=50){
            System.out.println("Pass");
            System.out.println("Total is "+tot);
            System.out.println("Average is "+avg);
            if(avg>=90)
            System.out.println("Grade A");
            else if(avg>=80 && avg<90)
            System.out.println("Grade B");
            else if(avg>=70 && avg<80)
            System.out.println("Grade C");
            else if(avg>=60 && avg<70)
            System.out.println("Grade D");
            else if(avg>=50 && avg<60)
            System.out.println("Grade E");
        }
        else{
            System.out.println("Fail"); 
            System.out.println("Grade F");
        }
    }   
}
