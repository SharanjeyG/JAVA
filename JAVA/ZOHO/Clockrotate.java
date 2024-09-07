package ZOHO;
import java.util.*;
//Matrix -> Transpose -> Clockwise Rotation
public class Clockrotate {
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
        System.out.println();
        for(int i=0; i<n;i++){
            for(int j=0;j<n;j++){
                if(i>j){
                    t=a[i][j];
                    a[i][j]=a[j][i];
                    a[j][i]=t;
                }
            }
        }

        for(int i=0; i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        for(int i=0; i<n;i++){
            for(int j=0;j<n/2;j++){
                    t=a[i][j];
                    a[i][j]=a[i][n-j-1];
                    a[i][n-j-1]=t;
            }
        }
        for(int i=0; i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}