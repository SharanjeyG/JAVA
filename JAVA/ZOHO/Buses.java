package ZOHO;

public class Buses {
    public static void main(String[] args) {
        int n=5, m=10, b=0, s=0;
        int[] arr ={4,5,5,6,4};
        for(int i=0;i<n;i++){
            if(arr[i]+s<=m){
                s+=arr[i];
            }
            else{
                b++;
                s=arr[i];
            }
        }
        if(s<=m){
            b++;
        }
        System.out.println(b);
    }
}
