package ZOHO;
import java.util.Scanner;
//Check the reverse string in equal to the string
public class Pallindrom {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String s = new String();
        s = sc.nextLine();
        String r = "";
        for(int i=s.length()-1;i>=0;i--){
            r = r+s.charAt(i);
        }
        if(s.equals(r)) System.out.println("Pallindrome");
        else System.out.println("Not a Pallindrom");
        sc.close();
    }
}
