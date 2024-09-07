package ZOHO;

import java.util.Scanner;

class Subseq {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        int count = 0;
        int n = s1.length();
        int m = s2.length();
        int i = 0;
        int j = 0;
        int k = 0;
        while(i<n && j<m){
            if(s1.charAt(i)==s2.charAt(j)){
                count++;
                i++;
                j++;
            }
            else{
                i++;
            }
        }
        if(count == m){
            System.out.println("Using While Loop it is Subsequence");
        }
        else{
            System.out.println("Using While loop it is not Subsequence");
        }
        count = 0;
        for(i = 0; i<m; i++){
            for(j=k ; j<n; j++){
                if(s2.charAt(i)==s1.charAt(j)){
                    count++;
                    k = j+1;
                    break;
                }
            }
        }
        if(count == m){
            System.out.println("Using for Loop it is Subsequence");
        }
        else{
            System.out.println("Using for loop it is not Subsequence");
        }

    }
}