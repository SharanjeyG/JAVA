package ZOHO;
import java.util.*;
//I/P: Motorcycle
//O/P: Motor
public class Removechar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1= sc.nextLine();
        String s2 = sc.nextLine();
        int n=s1.length();
        int m =s2.length();
        if(n>m){
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    if(s1.charAt(i) != s2.charAt(j)){
                        System.out.print(s1.charAt(i));
                        break;
                    }
                    else{
                        i++;
                    }
                }
            }
        }
        sc.close();
    }
}
