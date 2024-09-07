package ZOHO;

import java.util.Scanner;

public class UniformMat {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
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
            System.out.println();
            boolean x=true;
            boolean y=true;
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    if(a[i][j]%2!=0){
                        x=false;
                    }
                    if(a[i][j]%2==0) y=false;
                }
            }
            if(x||y){ System.out.println("Yes");}
            else {System.out.println("No");}
            sc.close();
        }
}
