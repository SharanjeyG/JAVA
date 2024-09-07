package ZOHO;

public class DtoDD {
    public static void main(String[] args) {
        // Scanner sc =new Scanner(System.in);
        // int r=sc.nextInt();
        // int c=sc.nextInt();
        // int[] a=new int[r*c];
        // int ind=0;
        int[] a={1,2,3,4,5,6,7,8,9};
        int r=3,c=3,ind=0;
        int[][] b=new int[r][c];
        if((r*c)==a.length){
            for(int i=0;i<r;i++){
                for(int j=0;j<c;j++){
                    b[i][j]=a[ind];
                    ind++;
                }
            }     
            for(int i=0;i<r;i++){
                for(int j=0;j<c;j++){
                    System.out.print(b[i][j]+" ");
                }
                System.out.println();
            }          
        }
        else{
            System.out.println("Numbers are not available for array");
        }
    }
}
