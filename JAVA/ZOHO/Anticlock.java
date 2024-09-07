package ZOHO;
import java.util.Scanner;

public class Anticlock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int t=0;
        int[][] a=new int[r][c];
        int[][] tr=new int[c][r];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Original Matrix");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                tr[j][i]=a[i][j];
            }
        }
        System.out.println("Transpose Matrix");
        for(int i=0;i<c;i++){
            for(int j=0;j<r;j++){
                System.out.print(tr[i][j]+" ");
            } 
            System.out.println();
        }
        System.out.println();

        for(int i=0;i<c/2;i++){
            for(int j=0;j<r;j++){
                t=tr[i][j];
                tr[i][j]=tr[c-i-1][j];
                tr[c-i-1][j]=t;
            } 
        }
        System.out.println("AntiClockWise Matrix");
        for(int i=0;i<c;i++){
            for(int j=0;j<r;j++){
                System.out.print(tr[i][j]+" ");
            } 
            System.out.println();
        }
        System.out.println();
        sc.close();
    }
}
