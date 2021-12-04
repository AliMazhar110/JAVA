package partOne;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("\nEnter number of Students = ");
        int num = scan.nextInt();
        ArrayList<Result> student = new ArrayList<>(num);
        for(int i=0;i<num;i++){
            student.add(new Result());
            student.get(i).percentCalculator();
        }
        System.out.println("\nDetails - ");
        System.out.println("-------------------------------------------------------");
        System.out.println("|        NAME          |       PRN       |    Marks   |");
        System.out.println("-------------------------------------------------------");
        for(int i=0;i<num;i++){
            student.get(i).display();
            System.out.println("");
            System.out.println("-------------------------------------------------------");
        }
        scan.close();
    }
}
