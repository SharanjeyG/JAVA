package ZOHO;

public class Encap {
    public static void main(String[] args) {
        int n=6;
        for(int i =0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==0||j==0||j==n-1||i==n-1){
                    System.out.print("* ");
                }
                else if(i==1||j==1||j==n-2||i==n-2){
                    System.out.print("o ");
                }
                else if(i==2||j==2||j==n-3||i==n-3){
                    System.out.print("* ");
                }
                else{
                    System.out.print("o ");
                }
            }System.out.println();
        }
    }
}