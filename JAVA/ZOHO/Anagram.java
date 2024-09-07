package ZOHO;

import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        int count = 0;
        String s2 = sc.nextLine();
        for(int i=0; i<s1.length(); i++){
            for(int j=0; j<s2.length();j++){
                if(s1.charAt(i) == s2.charAt(j)){
                    count++;
                    break;
                }
            }
        }
        if(count==s1.length() && count==s2.length()){
            System.out.print("Anagram");
        }
        else{
            System.out.print("Not an Anagram");
        }
        sc.close();
    }
}
