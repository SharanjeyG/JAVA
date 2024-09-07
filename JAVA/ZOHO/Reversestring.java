package ZOHO;
import java.util.Scanner;

//print the string in reverse 
//I/P: Good Afternoon all
//O/P: all Afternoon Good
public class Reversestring {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String s = new String();
        s = sc.nextLine();
        //Using Split
        String[] c=s.split(" ");
        for(int i=c.length-1;i>=0;i--){
            System.out.print(c[i]+ " ");
        }
        System.out.println();

        //Using Traversing the string
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)==' '){
                for(int j=i+1;j<s.length();j++){
                    if(s.charAt(j)==' ') break;
                    System.out.print(s.charAt(j));
                }System.out.print(" ");
            }
        }
        for(int i=0;i<s.length();i++){
            System.err.print(s.charAt(i));
            if(s.charAt(i)==' ') break;
        }
        sc.close();
    }
}
