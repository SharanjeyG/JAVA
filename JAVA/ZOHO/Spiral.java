package ZOHO;

import java.util.Scanner;
//Print the elements in a spiral pattern
public class Spiral {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t=0, b=n-1, l=0,r=n-1;
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
        while(b>=t && l<=r){
            for(int i=l;i<=r;i++)
                System.out.print(a[t][i]+" ");
            t++;
            for(int i=t;i<=b;i++)
                System.out.print(a[i][r]+" ");
            r--;
            for(int i=r;i>=l;i--)
                System.out.print(a[b][i]+" ");
            b--;
            for(int i=b;i>=t;i--)
                System.out.print(a[i][l]+" ");
            l++;
        }
        sc.close();
    }
}
