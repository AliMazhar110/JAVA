import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        DataBase db = new DataBase();
        while(true){
            System.out.println("\nMain Menu - ");
            System.out.println("1. Insert into Table");
            System.out.println("2. Delete From Table");
            System.out.println("3. Drop Table(Not Recommended)");
            System.out.println("4. Search Employee");
            System.out.println("5. Edit Salary.");
            System.out.println("6. Display");
            System.out.println("7. Create New Table.");
            System.out.println("8. Exit.");
            System.out.print("Enter Choice = ");
            int choice = scan.nextInt();
            switch (choice){
                case 1:
                    System.out.println("\nFill Details--");
                    System.out.print("Enter Employee number = ");
                    int empno = scan.nextInt();
                    scan.nextLine();
                    System.out.print("Enter Employee Name = ");
                    String name = scan.nextLine();
                    System.out.print("Enter Department = ");
                    String depart = scan.nextLine();
                    System.out.print("Enter Job = ");
                    String job = scan.nextLine();
                    System.out.print("Enter Salary = ");
                    float salary = scan.nextFloat();
                    db.insertInTable(empno, name, depart, job, salary);
                    scan.nextLine();
                    break;
                case 2:
                    System.out.print("\nEnter Employee Number = ");
                    int emno = scan.nextInt();
                    db.deleteEmployee(emno);
                    scan.nextLine();
                    break;
                case 3:
                    db.dropTable();
                    break;
                case 4:
                    scan.nextLine();
                    System.out.print("\nEnter Employee Name = ");
                    String empname = scan.nextLine();
                    db.search(empname);
                    break;
                case 5:
                    scan.nextLine();
                    System.out.print("\nEnter Employee Number = ");
                    int empnumber = scan.nextInt();
                    scan.nextLine();
                    System.out.print("Enter New Salary = ");
                    float sal = scan.nextFloat();
                    db.updateSalary(empnumber,sal);
                    scan.nextLine();
                    break;
                case 6:
                    db.displayTable();
                    break;
                case 7:
                    db.createTable();
                    break;
                case 8:
                    return;
                default:
                    System.out.println("OOPS!!! Wrong CHOICE");
            }
        }
    }
}
