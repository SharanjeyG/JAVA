package ZOHO;

import java.util.Scanner;

public class Bin2Dec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        String s2="";
        int dec=0;
        for(int i=s.length()-1;i>=0;i--){
            s2+=s.charAt(i);
        }
        for(int i=0;i<s2.length();i++){
            if(s2.charAt(i)-'0'==1){
                dec+=Math.pow(2,i);
            }
        }
        System.out.println(dec);
        sc.close();
    }
}
