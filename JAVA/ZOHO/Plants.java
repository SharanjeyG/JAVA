package ZOHO;
import java.util.Scanner;
//1-Tomato, 0-Potato
public class Plants {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = sc.nextInt();
        int x=0;
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
        int r = (p-1)/n;
        int c = (p-1)%n;
        for(int i=0; i<n;i++){
            for(int j=0;j<n;j++){
                if(i==r&&j==c){
                    x=a[i][j];
                }
            }
        }
        if(x==1) System.out.println("Tomato");
        else System.out.println("Potato");
        sc.close();
    }
}
