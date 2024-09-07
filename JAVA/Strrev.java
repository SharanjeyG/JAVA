import java.util.*;
class Strrev {
    public static void main(String args[]){
        int n,i;
        String a,b="";
        Scanner x=new Scanner(System.in);
        System.out.println("Enter a String");
        a=x.nextLine();
        n=a.length();
        System.out.println("Reverse Array:");
        for(i=n-1;i>=0;i--){
            b+=a.charAt(i);
        }
        System.out.println(b);
    }
}
