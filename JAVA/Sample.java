import java.util.*;
class Sample {
    public static void main(String args[]){
       // byte v=127;
        int a=5,b=10,c,d,e;
        System.out.println(a);
        System.out.println(b);
        c=++a*b--;
        //++v;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        d=a--+ ++b;
        System.out.println(a);
        System.out.println(b);
        System.out.println(d);
        e=a+b++;
        System.out.println(e);
        /*System.out.println(v++);
        System.out.println(v);       
        System.out.println(1.0/3.0);
        System.out.println(1.0f/3.0f);*/
    }
}
