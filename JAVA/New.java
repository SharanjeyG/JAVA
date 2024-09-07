import java.util.Scanner;

class New {
    int a,b,c;
    public void in(){
        Scanner v=new Scanner(System.in);
        System.out.println("Enter Two Numbers: ");
        a=v.nextInt();
        b=v.nextInt();
        c=a+b;
        System.out.println("Answer: "+c);
    }
    /* public void out(){
        System.out.println("Answer: "+c);
    }*/
}
