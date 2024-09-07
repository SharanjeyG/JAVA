package ZOHO;
import java.util.Scanner;
//I/P: Good afternoon to all
//O/P: dooG noonretfa ot lla
public class Test1 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String s = new String();
        s = sc.nextLine();
        System.out.println(s.length());
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                for(int j=i-1;j>=0;j--){
                    if(s.charAt(j) == ' ') break;
                    System.out.print(s.charAt(j));
                }System.out.print(" ");
            }
        }
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i) == ' ') break;
            System.out.print(s.charAt(i));
        }
        sc.close();
    }
}
