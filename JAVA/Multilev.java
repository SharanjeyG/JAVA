import java.util.*;

class X{
    String name;
    int id;
}
class Y extends X{
    void in(){
        Scanner d=new Scanner(System.in);
        System.out.println("Enter Your Name: ");
        name=d.nextLine();
        System.out.println("Enter Your Id: ");
        id=d.nextInt();
    }
}   
class Z extends Y{
    void out(){
        System.out.println("Name: "+name);
        System.out.println("Id: "+id);
    }
}

class Multilev {
    public static void main(String args[]){
        Z v=new Z();
        v.in();
        v.out();
    }
}
