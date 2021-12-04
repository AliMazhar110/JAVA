package partTwo;

import java.util.Scanner;

public class Account {
    private String cust_name, acc_number;
    Scanner scan = new Scanner(System.in);
    public Account(){
        cust_name = null;
        acc_number = null;
    }
    protected void getData(){
        System.out.print("Enter Customer Name = ");
        cust_name = scan.nextLine();
        System.out.print("Enter Account Number = ");
        acc_number = scan.nextLine();
    }
    protected void putData(){
        System.out.println("Customer Name = "+cust_name);
        System.out.println("Account Number = "+acc_number);
    }
}
