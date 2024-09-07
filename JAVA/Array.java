import java.util.*;
class Array {
    public static void main(String args[]){
        int n,i,s=0;
        Scanner x=new Scanner(System.in);
        System.out.println("Enter the Array Size:");
        n=x.nextInt();
        int[] a=new int[n];
        System.out.println("Enter the Array Values:");
        for(i=0;i<n;i++){
            a[i]=x.nextInt();
        }
        System.out.println("Array Values:");
        for(i=0;i<n;i++){
            System.out.println(a[i]);
            s+=a[i];
        }
        System.out.println("Sum of Values:"+s);
    }
}

