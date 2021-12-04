import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Vector<Employee> list = new Vector<Employee>();
        Tools tool = new Tools();
        char c='y';
        int a,salary,b,d;
        String name,id,sex,job,company;
        System.out.print("Total number of Profiles you want to create = ");
        a=scan.nextInt();
        for(int i=0;i<a;i++){
            scan.nextLine();
            System.out.print("\nEnter Name of Employee = ");
            name = scan.nextLine();
            System.out.print("Enter ID = ");
            id = scan.nextLine();
            System.out.print("Enter Gender = ");
            sex = scan.nextLine();
            System.out.print("Enter Job Title = ");
            job = scan.nextLine();
            System.out.print("Enter Organization's Name = ");
            company = scan.nextLine();
            System.out.print("Enter Salary = ");
            salary = scan.nextInt();
            list.add(Employee.makeObject(name,id,sex,job,company,salary));
        }
        do{
            System.out.println("\nMain Menu");
            System.out.println("1. Add Employee.");
            System.out.println("2. Delete Employee.");
            System.out.println("3. Search Employee.");
            System.out.println("4. Compare 2 Employees");
            System.out.println("5. Sort(by names).");
            System.out.println("6. Display.");
            System.out.println("7. Show total number of profiles.");
            System.out.println("8. Exit");
            System.out.print("Enter your choice = ");
            a = scan.nextInt();
            switch(a){
                case 1:
                    System.out.print("Total number of Profiles you want to create = ");
                    a=scan.nextInt();
                    for(int i=0;i<a;i++){
                        scan.nextLine();
                        System.out.print("\nEnter Name of Employee = ");
                        name = scan.nextLine();
                        System.out.print("Enter ID = ");
                        id = scan.nextLine();
                        System.out.print("Enter Gender = ");
                        sex = scan.nextLine();
                        System.out.print("Enter Job Title = ");
                        job = scan.nextLine();
                        System.out.print("Enter Organization's Name = ");
                        company = scan.nextLine();
                        System.out.print("Enter Salary = ");
                        salary = scan.nextInt();
                        list.add(Employee.makeObject(name,id,sex,job,company,salary));
                    }
                    break;
                case 2:
                    System.out.println("\nMain Menu:-");
                    System.out.println("1. Search By Name.");
                    System.out.println("2. Search By ID.");
                    System.out.print("Enter your choice = ");
                    a = scan.nextInt();
                    scan.nextLine();
                    if(a==1){
                        System.out.print("Enter Name = ");
                        String option = scan.nextLine();
                        b = tool.search(list,"name",option);
                        if(b!=-1){
                            tool.delete(list,b);
                            System.out.println("\nProfile Successfully deleted.");
                        }
                        else
                            System.out.println("\nMatch Not Found.");
                    }
                    else if(a==2){
                        System.out.print("Enter ID = ");
                        String option = scan.nextLine();
                        b = tool.search(list,"id",option);
                        if(b!=-1){
                            tool.delete(list,b);
                            System.out.println("\nProfile Successfully deleted.");
                        }
                        else
                            System.out.println("\nMatch Not Found.");
                    }
                    else
                        System.out.println("\nOOPS!!! Wrong choice.");
                    break;
                case 3:
                    System.out.println("\nMain Menu:-");
                    System.out.println("1. Search By Name.");
                    System.out.println("2. Search By ID.");
                    System.out.print("Enter your choice = ");
                    a = scan.nextInt();
                    scan.nextLine();
                    if(a==1){
                        System.out.print("Enter Name = ");
                        String option = scan.nextLine();
                        b = tool.search(list,"name",option);
                        if(b!=-1){
                            tool.display(list.get(b));
                        }
                        else
                            System.out.println("\nMatch Not Found.");
                    }
                    else if(a==2){
                        System.out.print("Enter ID = ");
                        String option = scan.nextLine();
                        b = tool.search(list,"id",option);
                        if(b!=-1){
                            tool.display(list.get(b));
                        }
                        else
                            System.out.println("\nMatch Not Found.");
                    }
                    else
                        System.out.println("\nOOPS!!! Wrong choice.");
                    break;
                case 4:
                    System.out.println("\nMain Menu:-");
                    System.out.println("1. Search By Name.");
                    System.out.println("2. Search By ID.");
                    System.out.print("Enter your choice = ");
                    a = scan.nextInt();
                    scan.nextLine();
                    if(a==1){
                        System.out.print("Enter Name = ");
                        String option = scan.nextLine();
                        b = tool.search(list,"name",option);
                        System.out.print("\nEnter Name = ");
                        option = scan.nextLine();
                        d = tool.search(list,"name",option);
                        if(b!=-1 && d!=-1){
                            tool.compareBySalary(list.get(b),list.get(d));
                        }
                        else if(b==-1 || d==-1)
                            System.out.println("\nMatch Not Found.");
                    }
                    else if(a==2){
                        System.out.print("Enter ID = ");
                        String option = scan.nextLine();
                        b = tool.search(list,"id",option);
                        System.out.print("\nEnter ID = ");
                        option = scan.nextLine();
                        d = tool.search(list,"id",option);
                        if(b!=-1 && d!=-1){
                            tool.compareBySalary(list.get(b),list.get(d));
                        }
                        else if(b==-1 || d==-1)
                            System.out.println("\nMatch Not Found.");
                    }
                    else
                        System.out.println("\nOOPS!!! Wrong choice.");
                    break;
                case 5:
                    Collections.sort(list,Tools.setByName);
                    break;
                case 6:
                    System.out.println("\n---------------------------------------------------");
                    System.out.println("-----------------------LIST------------------------");
                    for(int i=0;i<list.size();i++){
                        System.out.println("---------------------------------------------------");
                        tool.display(list.get(i));
                        System.out.println("---------------------------------------------------");
                    }
                    break;
                case 7:
                    System.out.println("\nTotal Profiles = "+Employee.count);
                    break;
                case 8:
                    c='n';
                    break;
                default:
                    System.out.println("\nOOPS!!! Wrong choice.");
            }

        }while(c=='y');
        scan.close();
    }
}
