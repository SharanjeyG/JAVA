import java.util.*;
class Cond {
    public static void main(String args[]){
        int a,b;
        Scanner d=new Scanner(System.in);
        System.out.println("Enter a Number:");
        a=d.nextInt();
        if(a%2==0){
            System.out.println(a+" is Even");
        }
        else{
            System.out.println(a+" is Odd");    
        }
        System.out.println("Enter the Age:");
        b=d.nextInt();
        if(b>=18){
            System.out.println(b+" is Major");
        }
        else{
            System.out.println(b+" is Minor");
        }
    }
}
