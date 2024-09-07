package ZOHO;

public class Kpattern {
    public static void main(String[] args) {
        int n=6, b=0;
        int[] a={2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};
        for(int i = 0; i<n;i++){
            for(int j=0; j<n-i;j++){
                System.out.print(a[b] +" ");
                b++;
            }
            System.out.println();
        }
        for(int i=0; i<n;i++){
            for(int j=0; j<i+1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
