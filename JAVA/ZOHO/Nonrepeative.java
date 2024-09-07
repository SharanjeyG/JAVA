package ZOHO;
import java.util.Scanner;
//print the character present only one time in string

public class Nonrepeative {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String s = new String();
        s = sc.nextLine();
        for(int i=0;i<s.length();i++){
            int c=0;
            for(int j=0;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j) && i!=j){
                    c++;
                    break;
                }
            }
            if(c==0){
                System.out.println(s.charAt(i));
            }
        }
        sc.close();
    }
}
