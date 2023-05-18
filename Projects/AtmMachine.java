import java.util.Scanner;  

public class ATM_Machine {
    public static void main(String args[] )  {  
         
        int balance = 0, withdraw, deposit;  
        
        try (Scanner sc = new Scanner(System.in)) {
            while(true)  {  
                System.out.println("**********ATM Machine********** \n");  
                System.out.println("Select 1 for Withdraw");  
                System.out.println("Select 2 for Deposit");  
                System.out.println("Select 3 for Check Current Balance");  
                System.out.println("Select 4 for Terminate\n");  
                System.out.print("Select the operation:"); 
                int select = sc.nextInt();  
                switch(select)  {  
                    case 1:  
                        System.out.print("Enter Amount to withdraw : ");  
                        withdraw = sc.nextInt();
                        if(balance >= withdraw) {  
                            balance = balance - withdraw;  
                            System.out.println("Please collect your money");  
                        }  
                        else  {  
                            System.out.println("Insufficient Balance");  
                        }  
                        System.out.println("");  
                        break;  
                    case 2:  
                        System.out.print("Enter Amount to deposit:");  
                        deposit = sc.nextInt();  
                        balance = balance + deposit;  
                        System.out.println("Your amount has been deposited successfully");  
                        System.out.println("");  
                        break;  
                    case 3:  
                        System.out.println("Current Balance : "+balance);  
                        System.out.println("");  
                        break;  
                    case 4:  
                     
                        System.exit(0);  
                }  
            }
        }  
    }  
}
