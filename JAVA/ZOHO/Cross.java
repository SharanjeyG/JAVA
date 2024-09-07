package ZOHO;

import java.util.*;

/**
 * Cross
 */
public class Cross {

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int y= x.nextInt();
        int n=0;
        ArrayList<Integer> m = new ArrayList<>();
        while (y!=0) {
            n=y%10;
            m.add(n);
            y = y/10;
        }
        System.out.println(m);
        for(int i=0; i<m.size(); i++){
            for(int j=0; j<m.size();j++){
                if(i==j){
                    System.out.print(m.get(i));
                }
                else if(j == m.size()-i-1){
                    System.out.print(m.get(m.size()-i-1));
                }
                else{
                    System.out.print(" ");
                }
            }System.out.println();
        }
        x.close();
    }
}