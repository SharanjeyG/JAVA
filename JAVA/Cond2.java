import java.util.*;
class Cond2 {
    public static void main(String args[]){
        int a;
        Scanner d=new Scanner(System.in);
        System.out.println("Enter a Number:");
        a=d.nextInt();
        if(a>=0 && a<=9){
            System.out.println(a+"=One Digit");
        }
        else if(a>=10 && a<=99){
            System.out.println(a+"=Two Digit");
        }
        else{
            System.out.println(a+"=More than 2 Digit");
        }
    }
}
