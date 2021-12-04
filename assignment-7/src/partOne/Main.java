package partOne;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = 0, b = 0,c = 0 ,d = 0;
        while(true) {
            System.out.println("\nFill All The Details - \n");
            System.out.print("Enter Numerator of 1st Rational Number = ");
            try {
                a = scan.nextInt();
            }
            catch(InputMismatchException e) {
                System.out.println("Enter Only Integers.");
                scan.nextLine();
                continue;
            }
            System.out.print("Enter Denominator of 1st Rational Number = ");
            try {
                b = scan.nextInt();
                if(b==0){
                    System.out.println("Rational Number = a/b, where b is not equal to 0.");
                    continue;
                }
            }
            catch(InputMismatchException e){
                System.out.println("Enter Only Integers.");
                scan.nextLine();
                continue;
            }
            System.out.print("Enter Numerator of 2nd Rational Number = ");
            try {
                c = scan.nextInt();
            }
            catch(InputMismatchException e){
                System.out.println("Enter Only Integers.");
                scan.nextLine();
                continue;
            }
            System.out.print("Enter Denominator of 2nd Rational Number = ");
            try {
                d = scan.nextInt();
                if(d==0){
                    System.out.println("Rational Number = c/d, where d is not equal to 0.");
                    continue;
                }
            }
            catch(InputMismatchException e){
                System.out.println("Enter Only Integers.");
                scan.nextLine();
                continue;
            }
            Operations opr = new Operations(a, b, c, d);
            System.out.println("");
            opr.add();
            System.out.println("\n");
            opr.sub();
            System.out.println("\n");
            opr.multiplication();
            System.out.println("\n");
            opr.divide();
            System.out.println("\n");
            opr.compare();
            System.out.println("\n");
            opr.floatPoint();
            System.out.println("\n");
            opr.absolute();
            System.out.println("\n");
            System.out.print("Do you want to exit(yY)? = ");
            char t = scan.next().charAt(0);
            if(t=='y' || t=='Y'){
                break;
            }
        }
    }
}
