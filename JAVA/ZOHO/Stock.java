package ZOHO;
import java.util.ArrayList;

public class Stock {
    public static void main(String[] args) {
        int n=6, s=0, ind =0;
        int[] arr = {7,5,3,6,4,1};
        int m=arr[0];
        ArrayList<Integer> brr = new ArrayList<>();
        
        // for(int i=0; i<n;i++){
        //     for(int j=0;j<n;j++){
        //         if(arr[j]<arr[i]){
        //             s = arr[i]-arr[j];
        //             brr.add(s);

        //         }
        //     }
        // }
        for(int i=0; i<n;i++){
            if(m>arr[i]){
                m=arr[i];
                ind=i;
            }
        }
        for(int i=ind; i<n; i++){
            for(int j=i; j<n;j++){
                s=arr[j]-arr[i];
                brr.add(s);
            }
        }
        int l=brr.size();
        int max = brr.get(0);
        boolean x=false;
        for(int k=0; k<l;k++){
            if(max<brr.get(k)){
                max=brr.get(k);
                x=true;
            }
        }
        if(x){
            System.out.println(max);
        }
        else{
            System.out.println(-1);
        }
        // System.out.println(brr);
        // System.out.println(max);
    }
}
