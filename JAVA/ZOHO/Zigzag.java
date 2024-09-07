package ZOHO;

import java.util.Scanner;
// Add the elements in Z shape
public class Zigzag {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int t=0;
            int n = sc.nextInt();
            int [][] a = new int[n][n];
            for(int i=0; i<n;i++){
                for(int j=0;j<n;j++){
                    a[i][j] = sc.nextInt();
                }
            }
            for(int i=0; i<n;i++){
                for(int j=0;j<n;j++){
                    System.out.print(a[i][j]+" ");
                }
                System.out.println();
            }
            for(int i=0; i<n;i++){
                for(int j=0;j<n;j++){
                    if(i==0||i==n-1||j==n-i-1){
                        t+=a[i][j];
                    }
                }
            }
            System.out.println(t);
            sc.close();
    }
}
