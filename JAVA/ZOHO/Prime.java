package ZOHO;
import java.util.ArrayList;

public class Prime {
    public static void main(String[] args) {
        ArrayList<Integer> arr = loop();
        int[] b = {4,6,9,3,7};
        for(int num:b){
            if (arr.contains(num)){
                System.out.println(num);
            }
        }
    }

    public static ArrayList<Integer> loop(){
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 2; i <= 100; i++){
            boolean x = true;
            for(int j = 2; j < i; j++){
                if(i % j == 0){
                    x = false;
                    break;
                }
            }
            if(x){
                arr.add(i);
            }
        }
        System.out.println(arr);
        return arr; // return the ArrayList
    }
}
