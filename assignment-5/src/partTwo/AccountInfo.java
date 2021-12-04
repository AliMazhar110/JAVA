package partTwo;

import java.util.Scanner;

public class AccountInfo {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        AccountDetails acc = new AccountDetails();
        char c='y';
        do{
            System.out.println("\nMain Menu - ");
            System.out.println("1. Create Account.");
            System.out.println("2. Show Details.");
            System.out.println("3. Exit");
            System.out.print("Enter choice = ");
            int choice = scan.nextInt();
            switch(choice){
                case 1:
                    System.out.println();
                    acc.getData();
                    break;
                case 2:
                    System.out.println("--------------------ACCOUNT DETAILS--------------------");
                    acc.putData();
                    System.out.println("--------------------ACCOUNT DETAILS--------------------");
                    break;
                case 3:
                    c='n';
                    break;
                default:
                    System.out.println("OPPS!!! Wrong Choice.");
            }
        }while(c=='y');
        scan.close();
    }
}
