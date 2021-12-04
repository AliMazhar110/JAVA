import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class DataSheet {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        ArrayList<Students> list = new ArrayList<>();
        Tools tool = new Tools();
        char c='y';
        String str,name,prn,branch,dob;
        int[] arr = new int[5];
        int a,b;
        double d;
        System.out.print("Total number of students you want to enter = ");
        a = scan.nextInt();
        for(int i=0;i<a;i++){
            scan.nextLine();
            System.out.print("\nEnter Name = ");
            name = scan.nextLine();
            System.out.print("Enter PRN = ");
            prn = scan.nextLine();
            System.out.print("Enter Branch = ");
            branch = scan.nextLine();
            System.out.print("Enter Date Of Birth(ddmmyy) = ");
            dob = scan.nextLine();
            System.out.println("\nEnter Marks :-");
            for(int j=0;j<5;j++){
                System.out.print("Marks in Subject-"+(j+1)+" = ");
                arr[j]=scan.nextInt();
            }
            list.add(new Students(name,prn,branch,arr,dob));
            d = list.get(i).sum()/5.0;
            tool.grades(d);
        }
        do{
            System.out.println("\nMain Menu");
            System.out.println("1. Add Student.");
            System.out.println("2. Delete.");
            System.out.println("3. Search.");
            System.out.println("4. Edit Profile.");
            System.out.println("5. Grades Obtained.");
            System.out.println("6. Sort List(as per marks).");
            System.out.println("7. Display.");
            System.out.println("8. Exit");
            System.out.print("Enter your choice = ");
            a = scan.nextInt();
            switch(a){
                case 1:
                    System.out.print("Total number of students you want to enter = ");
                    a = scan.nextInt();
                    for(int i=0;i<a;i++){
                        scan.nextLine();
                        System.out.print("\nEnter Name = ");
                        name = scan.nextLine();
                        System.out.print("Enter PRN = ");
                        prn = scan.nextLine();
                        System.out.print("Enter Branch = ");
                        branch = scan.nextLine();
                        System.out.print("Enter Date Of Birth(ddmmyy) = ");
                        dob = scan.nextLine();
                        System.out.println("\nEnter Marks :-");
                        for(int j=0;j<5;j++){
                            System.out.print("Marks in Subject-"+(j+1)+" = ");
                            arr[j]=scan.nextInt();
                        }
                        list.add(new Students(name,prn,branch,arr,dob));
                        d = list.get(list.size()-1).sum()/5.0;
                        tool.grades(d);
                    }
                    break;
                case 2:
                    System.out.println("Search the student by - ");
                    System.out.println("1. Name");
                    System.out.println("2. PRN");
                    System.out.print("Enter your choice = ");
                    a = scan.nextInt();
                    scan.nextLine();
                    if(a==1){
                        System.out.print("\nEnter Name of student = ");
                        str = scan.nextLine();
                        if(tool.delete(list,str,"name")){
                            System.out.println("\nSuccessfully Deleted.");
                        }
                        else{
                            System.out.println("\nMatch not found.");
                        }
                    }
                    else if(a==2){
                        System.out.print("\nEnter PRN of student = ");
                        str = scan.nextLine();
                        if(tool.delete(list,str,"prn")){
                            System.out.println("\nSuccessfully Deleted.");
                        }
                        else{
                            System.out.println("\nMatch not found.");
                        }
                    }
                    else{
                        System.out.println("OOPS!!! Wrong Choice.");
                    }
                    break;
                case 3:
                    System.out.println("Search the student by - ");
                    System.out.println("1. Name");
                    System.out.println("2. PRN");
                    System.out.print("Enter your choice = ");
                    a = scan.nextInt();
                    scan.nextLine();
                    if(a==1){
                        System.out.print("\nEnter Name of student = ");
                        str = scan.nextLine();
                        b = tool.find(list,str,"name");
                        if(b==-1){
                            System.out.println("\nMatch not found.");
                        }
                        else{
                            tool.display(list.get(b));
                        }
                    }
                    else if(a==2){
                        System.out.print("\nEnter PRN of student = ");
                        str = scan.nextLine();
                        b = tool.find(list,str,"prn");
                        if(b==-1){
                            System.out.println("\nMatch not found.");
                        }
                        else{
                            tool.display(list.get(b));
                        }
                    }
                    else{
                        System.out.println("OOPS!!! Wrong Choice.");
                    }
                    break;
                case 4:
                    String set;
                    System.out.println("Search the student by - ");
                    System.out.println("1. Name");
                    System.out.println("2. PRN");
                    System.out.print("Enter your choice = ");
                    a = scan.nextInt();
                    scan.nextLine();
                    if(a==1){
                        System.out.print("\nEnter Name of student = ");
                        str = scan.nextLine();
                        b = tool.find(list,str,"name");
                        if(b==-1){
                            System.out.println("\nMatch not found.");
                        }
                        else{
                            System.out.println("\n1. Edit Name.");
                            System.out.println("2. Edit PRN.");
                            System.out.println("3. Edit Branch.");
                            System.out.println("4. Edit Date of Birth");
                            System.out.println("5. Edit Marks");
                            System.out.print("Enter your choice = ");
                            a = scan.nextInt();
                            scan.nextLine();
                            if(a==1){
                                System.out.print("Enter New Name = ");
                                set = scan.nextLine();
                                tool.replace(list.get(b),a,set);
                            }
                            else if(a==2){
                                System.out.print("Enter New PRN = ");
                                set = scan.nextLine();
                                tool.replace(list.get(b),a,set);
                            }
                            else if(a==3){
                                System.out.print("Enter New Branch = ");
                                set = scan.nextLine();
                                tool.replace(list.get(b),a,set);
                            }
                            else if(a==4){
                                System.out.print("Enter New DOB = ");
                                set = scan.nextLine();
                                tool.replace(list.get(b),a,set);
                            }
                            else if(a==5){
                                System.out.println("Enter New Marks :-");
                                for(int j=0;j<5;j++){
                                    System.out.print("Marks in Subject-"+(j+1)+" = ");
                                    arr[j]=scan.nextInt();
                                }
                                tool.replaceMarks(list.get(b), arr);
                            }
                            else{
                                System.out.println("OOPS!!! Wrong Choice.");
                            }
                        }
                    }
                    else if(a==2){
                        System.out.print("\nEnter PRN of student = ");
                        str = scan.nextLine();
                        b = tool.find(list,str,"prn");
                        if(b==-1){
                            System.out.println("\nMatch not found.");
                        }
                        else{
                            System.out.println("\n1. Edit Name.");
                            System.out.println("2. Edit PRN.");
                            System.out.println("3. Edit Branch.");
                            System.out.println("4. Edit Date of Birth");
                            System.out.println("5. Edit Marks");
                            System.out.print("Enter your choice = ");
                            a = scan.nextInt();
                            scan.nextLine();
                            if(a==1){
                                System.out.print("Enter New Name = ");
                                set = scan.nextLine();
                                tool.replace(list.get(b),a,set);
                            }
                            else if(a==2){
                                System.out.print("Enter New PRN = ");
                                set = scan.nextLine();
                                tool.replace(list.get(b),a,set);
                            }
                            else if(a==3){
                                System.out.print("Enter New Branch = ");
                                set = scan.nextLine();
                                tool.replace(list.get(b),a,set);
                            }
                            else if(a==4){
                                System.out.print("Enter New DOB = ");
                                set = scan.nextLine();
                                tool.replace(list.get(b),a,set);
                            }
                            else if(a==5){
                                System.out.println("Enter New Marks :-");
                                for(int j=0;j<5;j++){
                                    System.out.print("Marks in Subject-"+(j+1)+" = ");
                                    arr[j]=scan.nextInt();
                                }
                                tool.replaceMarks(list.get(b), arr);
                            }
                            else{
                                System.out.println("OOPS!!! Wrong Choice.");
                            }
                        }
                    }
                    else{
                        System.out.println("OOPS!!! Wrong Choice.");
                    }
                    break;
                case 5:
                    tool.gradesRatio();
                    break;
                case 6:
                    Collections.sort(list,Tools.setByMarks);
                    break;
                case 7:
                    System.out.println("--------------------------------------------------");
                    System.out.println("                     List                         ");
                    for(int i=0;i<list.size();i++){
                        System.out.println("--------------------------------------------------");
                        tool.display(list.get(i));
                        System.out.println("--------------------------------------------------");
                    }
                    break;
                case 8:
                    c='n';
                    break;
                default:
                    System.out.println("OOPS!!!! Wrong Choice.");
            }
        }while(c=='y');
        scan.close();
    }
}
