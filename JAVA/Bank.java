import java.io.*;
import java.util.*;
class Bank {
    public static void main(String args[])
    {
        int v, bal=0,d,w;
        Scanner n=new Scanner(System.in);
        do{
        System.out.println("For Deposit : 1\nWithdraw : 2\nBalance : 3\nExit : 4");
        v=n.nextInt();
 
        switch(v)
        {
            case 1:
            System.out.println("Enter the Amount you want to Deposit");
            d=n.nextInt();
            bal+=d;
            System.out.println("Deposit success your account balance = "+bal);
            break;

            case 2:
            System.out.println("Enter the Amount you want to Withdraw");
            w=n.nextInt();
            if(w>bal)
            {
                System.out.print("Insufficient balance");
            }
            else
            {
                bal-=w;
                System.out.println("Withdraw success your Account Balance = "+bal);
            }
            break;

            case 3:
            System.out.println("Your Account Balance = "+bal);
            break;

            default:
            System.out.println("Thank U Visit Again");
            break;
        }
    }
    while(v!=4);
    
} 
}
