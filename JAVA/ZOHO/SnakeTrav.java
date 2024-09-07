package ZOHO;
import java.util.Scanner;
//Odd row same as it is , even row swap the numbers
public class SnakeTrav {
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
            //Odd Row
            // for(int i=0; i<n;i++){
            //     for(int j=0;j<n/2;j++){
            //         if(i%2!=0){
            //             t=a[i][j];
            //             a[i][j]=a[i][n-j-1];
            //             a[i][n-j-1]=t;
            //         }
            //     }
            // }

            //Odd Column
            for(int i=0;i<n/2;i++){
                for(int j=0;j<n;j++){
                    if(j%2!=0){
                        t=a[i][j];
                        a[i][j]=a[n-i-1][j];
                        a[n-i-1][j]=t;
                    }
                }
            }
            for(int i=0; i<n;i++){
                for(int j=0;j<n;j++){
                    System.out.print(a[j][i]+" ");
                }
            }
            sc.close();
        }
    }

