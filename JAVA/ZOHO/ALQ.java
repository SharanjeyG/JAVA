package ZOHO;

import java.util.Scanner;

public class ALQ {
    static int[][] park = new int[10][10];

    public static int create() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                park[i][j] = 0;
            }
        }
        System.out.println("Create Success");
        return 0;
    }

    public static int display() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(park[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Display Success");
        return 0;
    }

    public static int insert(){
        Scanner sc=new Scanner(System.in);
        int type = sc.nextInt();
        // String numb=sc.nextLine();
        // int time= sc.nextInt();
        int car=0,bik=0,cyc=0;
        while(type==1 && car<4){
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 4; j++) {
                    park[i][j] = type;
                }
            }
            car++;
        }
        while(type==1 && bik<4){
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 4; j++) {
                    park[i][j] = type;
                }
            }
            bik++;
        }
        while(type==1 && cyc<2){
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 4; j++) {
                    park[i][j] = type;
                }
            }
            cyc++;
        }
        sc.close();
        return 0;
    }

    public static void main(String[] args) {
        create();
        display();
        insert();
    }
}
