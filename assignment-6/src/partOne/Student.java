package partOne;

import java.util.Scanner;

public class Student {
    private String name, prn;
    int[] marks = new int[5];
    Scanner scan = new Scanner(System.in);
    Student(){
        name = prn = null;
        for(int i=0;i<5;i++){
            marks[i] = 0;
        }
    }
    void getData(){
        System.out.println("\nEnter Details - ");
        System.out.print("Enter Name = ");
        name = scan.nextLine();
        System.out.print("Enter PRN = ");
        prn = scan.nextLine();
        System.out.println("\nEnter Marks - ");
        for(int i=0;i<5;i++){
            System.out.print("Enter marks of Subject-"+(i+1)+" = ");
            marks[i] = scan.nextInt();
        }
    }
    String getName(){
        return name;
    }
    String getPrn(){
        return prn;
    }
}