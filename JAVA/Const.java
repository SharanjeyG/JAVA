import java.util.Scanner;

class add {
    int a,b,c;
    add(){
        Scanner t= new Scanner(System.in);
        System.out.println("Enter Two Numbers: ");
        a=t.nextInt();
        b=t.nextInt();
        c=a+b;
    }
    add(int d){
        int e;
        a=4;
        b=4;
        e=a+b+d;
        System.out.println(e);
    }
    void out(){
        System.out.println(c);
    }
}
class Const{

    public static void main(String args[]) {
        int d;
        Scanner v=new Scanner(System.in);
        d=v.nextInt();
        add x=new add();
        x.out();
        add x1=new add(d);
        //x1.out();
    }
}