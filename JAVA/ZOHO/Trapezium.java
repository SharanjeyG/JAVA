package ZOHO;

public class Trapezium {
    public static void main(String[] args) {
        int n=4, a=1, b=(n*n)+1;
        for(int i=0; i<n; i++){
            for(int j=0; j<i; j++){
                System.out.print("--");
            }
            for(int k=0; k<n-i; k++){
                System.out.print(a+"*");
                a++;
            }
            for(int l=0; l<n-i-1; l++){
                System.out.print(b+"*");
                b++;
            }
            System.out.println(b);
            b= b-((n-i-1)*2);
        }
    }
}
