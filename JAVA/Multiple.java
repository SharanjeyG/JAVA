import java.util.*;

class E{
    int a,b;
    void in(){
        Scanner d=new Scanner(System.in);
        System.out.println("Enter Two Numbers: ");
        a=d.nextInt();
        b=d.nextInt();
    }
}
interface F{
    public void out();
}
class G extends E implements F{
    int c;
    
    public void out(){
        c=a+b;
        System.out.println(c);
   }
}
class Multiple{
    public static void main(String args[]){
        G a=new G();
        a.in();
        a.out();
    }
}