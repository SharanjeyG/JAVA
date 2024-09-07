package ZOHO;
import java.util.Scanner;
// Check if the sum of forward diagonal and reverse diagonal is Equal
public class Diagsum {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
            int t1=0,t2=0,t3=0,t4=0;
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
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    if(i==j){
                        t1+=a[i][j];
                    }
                    if(j==n-i-1){
                        t2+=a[i][j];
                    }
                }
            }
            for(int i=0;i<n;i++){
                t3+=a[i][i];
                t4+=a[i][n-i-1];
            }
            System.out.println(t3+t4);
            if(t1==t2) System.out.println("Equal");
            else System.out.println("Not Equal");
            sc.close();
        }
}
