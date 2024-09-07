import java.util.Scanner;

class Student {
    String name;
    int id;

    void in(int id,String name){
        name= name;
        id=id; 
    }
    void out(){
        System.out.println(name);
        System.out.println(id);
    }
}
class Object{
    public static void main(String args[]) {
        Student s=new Student();
        Scanner d=new Scanner(System.in);
        System.out.println("Id: ");
        s.id=d.nextInt();
        System.out.println("Name: ");
        s.name=d.next();
        //System.out.println(s.name);
        //System.out.println(s.id);
        s.in(s.id,s.name);
        s.out();
    }
}
