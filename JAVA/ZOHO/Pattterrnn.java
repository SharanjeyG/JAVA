package ZOHO;

public class Pattterrnn {
    // public static void main(String[] args) {
    //     int n=6, a=1;
    //     for(int i=0; i<n;i++){
    //         if(i%2==0) a=(3*i)+1;
    //         else a=i*2;
    //         for(int j=0; j<i+1; j++){
    //             System.out.print(a+" ");
    //             a++;
    //         }
    //         System.out.println();
    //     }
    // }

    public static void main(String[] args) {
        int n=6;
        for(int i=0; i<n;i++){
            if(i%2==0){
                for(int j=0; j<i+1; j++){
                    System.out.print(((3*i)+1) + " ");
                }
            }
            else{
                for(int j=0; j<i+1; j++){
                    System.out.print(i*2+ " ");
                }
            }
        }
    }
}
