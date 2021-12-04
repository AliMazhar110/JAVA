package partOne;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int choice;
        char c='y';
        Rectangle rect = new Rectangle();
        Square sq = new Square();
        Circle cir = new Circle();
        do{
            System.out.println("Main Menu");
            System.out.println("1. Rectangle");
            System.out.println("2. Circle");
            System.out.println("3. Square");
            System.out.println("4. Exit");
            System.out.print("Enter your choice = ");
            choice = scan.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Main Menu");
                    System.out.println("1. Create new Rectangle");
                    System.out.println("2. View Old Rectangle");
                    System.out.print("Enter your choice = ");
                    int i = scan.nextInt();
                    if(i==1){
                        System.out.print("\nEnter Length = ");
                        double length = scan.nextDouble();
                        System.out.print("Enter Width = ");
                        double width = scan.nextDouble();
                        scan.nextLine();
                        System.out.print("Enter Filled Status(True/False) = ");
                        String filled = scan.nextLine().toLowerCase(Locale.ROOT);
                        if(filled.equals("true")){
                            System.out.print("Enter Colour = ");
                            String color = scan.nextLine();
                            rect = new Rectangle(width,length,color,true);
                        }
                        else {
                            rect = new Rectangle(length,width);
                        }
                    }
                    else if(i==2){
                        System.out.println("\nDetails of Rectangle :-");
                        System.out.println("\nLength = "+rect.getLength());
                        System.out.println("Width = "+rect.getWidth());
                        System.out.printf("Area = %.2f\n",rect.getArea());
                        System.out.printf("Perimeter = %.2f\n",rect.getPerimeter());
                        System.out.println("Filled = "+rect.isFilled());
                        if(rect.isFilled()){
                            System.out.println("Color = "+rect.getColor());
                        }
                        if(rect.getLength() != 0 && rect.getWidth() != 0) {
                            System.out.print("\nDo you want to edit Rectangle(y/n) = ");
                            char j = scan.next().charAt(0);
                            if(j == 'y' || j == 'Y'){
                                System.out.println("Main Menu");
                                System.out.println("1. Edit Filled Status");
                                System.out.println("2. Edit Length");
                                System.out.println("3. Edit Width");
                                System.out.print("Enter your choice = ");
                                choice = scan.nextInt();
                                switch (choice){
                                    case 1:
                                        scan.nextLine();
                                        System.out.print("Enter Filled Status(True/False) = ");
                                        String filled = scan.nextLine().toLowerCase(Locale.ROOT);
                                        rect.setFilled(Boolean.parseBoolean(filled));
                                        if(filled.equals("true")) {
                                            System.out.print("Enter Colour = ");
                                            String color = scan.nextLine();
                                            rect.setColor(color);
                                        }
                                        break;
                                    case 2:
                                        System.out.print("Enter Length = ");
                                        double length = scan.nextDouble();
                                        rect.setLength(length);
                                        break;
                                    case 3:
                                        System.out.print("Enter Width = ");
                                        double width = scan.nextDouble();
                                        rect.setWidth(width);
                                        break;
                                    default:
                                        System.out.println("Opps!!! Wrong Choice!!!");
                                }
                            }
                        }
                    }
                    break;
                case 2:
                    System.out.println("Main Menu");
                    System.out.println("1. Create new Circle");
                    System.out.println("2. View Old Circle");
                    System.out.print("Enter your choice = ");
                    i = scan.nextInt();
                    if(i==1){
                        System.out.print("\nEnter Radius = ");
                        double radius = scan.nextDouble();
                        scan.nextLine();
                        System.out.print("Enter Filled Status(True/False) = ");
                        String filled = scan.nextLine().toLowerCase(Locale.ROOT);
                        if(filled.equals("true")){
                            System.out.print("Enter Colour = ");
                            String color = scan.nextLine();
                            cir = new Circle(radius,color,true);
                        }
                        else {
                            cir = new Circle(radius);
                        }
                    }
                    else if(i==2){
                        System.out.println("\nDetails of Circle :-");
                        System.out.println("\nRadius = "+cir.getRadius());
                        System.out.printf("Area = %.2f\n",cir.getArea());
                        System.out.printf("Perimeter = %.2f\n",cir.getPerimeter());
                        System.out.println("Filled = "+cir.isFilled());
                        if(cir.isFilled()){
                            System.out.println("Color = "+cir.getColor());
                        }
                        if(cir.getRadius() != 0) {
                            System.out.print("\nDo you want to edit Circle(y/n) = ");
                            char j = scan.next().charAt(0);
                            if(j == 'y' || j == 'Y'){
                                System.out.println("Main Menu");
                                System.out.println("1. Edit Filled Status");
                                System.out.println("2. Edit Radius");
                                System.out.print("Enter your choice = ");
                                choice = scan.nextInt();
                                switch (choice){
                                    case 1:
                                        scan.nextLine();
                                        System.out.print("Enter Filled Status(True/False) = ");
                                        String filled = scan.nextLine().toLowerCase(Locale.ROOT);
                                        cir.setFilled(Boolean.parseBoolean(filled));
                                        if(filled.equals("true")) {
                                            System.out.print("Enter Colour = ");
                                            String color = scan.nextLine();
                                            cir.setColor(color);
                                        }
                                        break;
                                    case 2:
                                        System.out.print("Enter Radius = ");
                                        double length = scan.nextDouble();
                                        cir.setRadius(length);
                                        break;
                                    default:
                                        System.out.println("Opps!!! Wrong Choice!!!");
                                }
                            }
                        }
                    }
                    break;
                case 3:
                    System.out.println("Main Menu");
                    System.out.println("1. Create new Square");
                    System.out.println("2. View Old Square");
                    System.out.print("Enter your choice = ");
                    i = scan.nextInt();
                    if(i==1){
                        System.out.print("\nEnter Side = ");
                        double side = scan.nextDouble();
                        scan.nextLine();
                        System.out.print("Enter Filled Status(True/False) = ");
                        String filled = scan.nextLine().toLowerCase(Locale.ROOT);
                        if(filled.equals("true")){
                            System.out.print("Enter Colour = ");
                            String color = scan.nextLine();
                            sq = new Square(side,color,true);
                        }
                        else {
                            sq = new Square(side);
                        }
//                        sq.setLength(side);
//                        sq.setWidth(side);
                    }
                    else if(i==2){
                        System.out.println("\nDetails of Circle :-");
                        System.out.println("\nSide = "+sq.getSide());
                        System.out.printf("Area = %.2f\n",sq.getArea());
                        System.out.printf("Perimeter = %.2f\n",sq.getPerimeter());
                        System.out.println("Filled = "+sq.isFilled());
                        if(sq.isFilled()){
                            System.out.println("Color = "+sq.getColor());
                        }
                        if(sq.getSide() != 0) {
                            System.out.print("\nDo you want to edit Circle(y/n) = ");
                            char j = scan.next().charAt(0);
                            if(j == 'y' || j == 'Y'){
                                System.out.println("Main Menu");
                                System.out.println("1. Edit Filled Status");
                                System.out.println("2. Edit Side");
                                System.out.print("Enter your choice = ");
                                choice = scan.nextInt();
                                switch (choice){
                                    case 1:
                                        scan.nextLine();
                                        System.out.print("Enter Filled Status(True/False) = ");
                                        String filled = scan.nextLine().toLowerCase(Locale.ROOT);
                                        sq.setFilled(Boolean.parseBoolean(filled));
                                        if(filled.equals("true")) {
                                            System.out.print("Enter Colour = ");
                                            String color = scan.nextLine();
                                            sq.setColor(color);
                                        }
                                        break;
                                    case 2:
                                        System.out.print("Enter Side = ");
                                        double side = scan.nextDouble();
                                        sq.setSide(side);
                                        sq.setLength(side);
                                        sq.setWidth(side);
                                        break;
                                    default:
                                        System.out.println("Opps!!! Wrong Choice!!!");
                                }
                            }
                        }
                    }
                    break;
                case 4:
                    c='n';
                    break;
                default:
                    System.out.println("Opps!!! Wrong Choice!!");
            }
        }while(c=='y');
    }
}
