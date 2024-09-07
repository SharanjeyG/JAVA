package ZOHO;

public class Duplicate {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,2,3,7,5,6};
        for(int i=0;i<a.length;i++){
            int f=0;
            for(int j=i-1;j>0;j--){
                if(a[i]==a[j]){
                    f=1;
                    break;
                }
            }
            if(f==0){
                System.out.print(a[i]+" ");
            }
        }
    }
}
