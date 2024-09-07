package ZOHO;

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word1 = sc.nextLine();
        String word2;
        while(word1.charAt(word1.length()-1) == (word2 = sc.nextLine()).charAt(0)){
            word1 = word2;
        }
        System.out.println("Over!");
        sc.close();
        // String w2 = sc.nextLine();
        // System.out.println(w1);
        // while(w1.charAt(w1.length()-1) == w2.charAt(0)){
        //     System.out.println(w2); 
        //     w1 = w2;
        //     w2 = sc.nextLine();
        // }
        // System.out.println("Over!");
    }
}
