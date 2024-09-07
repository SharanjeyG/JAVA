import java.util.*;

class A {
    int a,b;
    void in(){
    Scanner d=new Scanner(System.in);
    System.out.println("Enter Two Numbers: ");
    a=d.nextInt();
    b=d.nextInt();
    }
}
class B extends A{
    int c;
    void out(){
        c=a*b;
        System.out.println(c);
    }
}
class Single{
    public static void main(String args[]){
        B v=new B();
        v.in();
        v.out();
    }
}
