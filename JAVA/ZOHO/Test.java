package ZOHO;
import java.util.*;
/**
 * Test
 */
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int r=0,b=0;
        sc.nextLine();
        String[] ant = new String[n];
        for(int i=0; i<n; i++){
            ant[i] = sc.nextLine();
        }
        System.out.println(Arrays.toString(ant));
        for(int i=0; i<n;i++){
            if(ant[i].equals("red") || ant[i].equals("r")){ r++;}
            else {b++;}
        }
        System.out.println(r+" "+b);
        if(r==b){
            System.out.println("Peaceful");
        }
        else System.out.println("Not Peaceful");
        sc.close();
    }
}