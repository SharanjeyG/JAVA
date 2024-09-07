package ZOHO;

import java.util.Scanner;
//I/P: 123456
//O/P: 214365
public class Encrypt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = str.length();
        String temp="";
        if(n%2 == 0){
            for(int i=0; i<n-1; i+=2){
                temp+=str.charAt(i+1);
                temp+=str.charAt(i);
            }
        }
        else{
            for(int i=0; i<n-2; i+=2){
                temp+=str.charAt(i+1);
                temp+=str.charAt(i);
            }
            temp+=str.charAt(n-1);
        }
        System.out.println(temp);
        sc.close();
   }
}
