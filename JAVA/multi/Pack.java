package multi;
import java.util.*;

public class Pack {
    int a,b,c;
    public void pro(){
        Scanner d=new Scanner(System.in);
        System.out.println("Enter Two Numbers:");
        a=d.nextInt();
        b=d.nextInt();
        c=a*b;
    }
    public void dis(){
        System.out.println("Product: "+c);
    }
}
