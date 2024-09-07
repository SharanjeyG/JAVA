package ZOHO;
import java.util.*;

public class Upptri {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = new int[n][n];
        for(int i=0; i<n;i++){
            for(int j=0;j<n;j++){
                a[i][j] = sc.nextInt();
            }
        }
        for(int i=0; i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
        boolean x=true;
        for(int i=0; i<n;i++){
            for(int j=0;j<n;j++){
                if(i>j && a[i][j]!=0){
                    x=false;
                }
            }
        }


        if(x){
            System.out.println("Upper Triangular Matrix");
        }
        else{
            System.out.println("Not an Upper Triangular Matrix");
        }
        sc.close();
    }
}
