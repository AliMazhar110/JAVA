import java.util.Scanner;
import java.lang.Math;
class Calculator{
    private double total;
    public Calculator(){
        total=0;
    }
    public double addition(double a,double b){
        total = a+b;
        return total;
    }
    public double subtraction(double a,double b){
        total = a-b;
        return total;
    }
    public double multiplication(double a,double b){
        total = a*b;
        return total;
    }
    public double division(double a,double b){
        total = a/b;
        return total;
    }
    public double power(double a, double b){
        total = Math.pow(a,b);
        return total;
    }
    public double mean(int arr[], int i){
        int j=0;
        double total = 0;
        for(;j<i;j++){
            total+=arr[j];
        }
        return(total/i);
    }
    public double sqrt(int low, int high, int N){
        if(low<=high){
            int mid = (int)(low+high)/2;
            if ((mid * mid <= N) && ((mid + 1) * (mid + 1) > N)){ 
                return mid; 
            }
            else if (mid * mid < N) { 
                return sqrt(mid + 1, high, N); 
            } 
            else { 
                return sqrt(low, mid - 1, N); 
            }  
        }
        return low;
    }
    public int gcd(int a, int b){
        if(b==0){
            return a;
        }
        System.out.println(a + " = " + b + " x " + a/b + " + " + a%b);
        return gcd(b,a%b);
    }
    
}
public class calc{
    public static void main(String[] args){
        Calculator obj = new Calculator();
        Scanner scan = new Scanner(System.in);
        int d;
        double a,b;
        char c='y';
        do{
            System.out.println("Main Menu :-");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Power");
            System.out.println("6. GCD(a,b)");
            System.out.println("7. Average of n numbers");
            System.out.println("8. Square Root");
            System.out.println("9. Exit");
            System.out.print("Enter you choice = ");
            d = scan.nextInt();
            switch(d){
                case 1:
                    System.out.print("Enter 1st number = ");
                    a = scan.nextDouble();
                    System.out.print("Enter 2nd number = ");
                    b = scan.nextDouble();
                    System.out.println(a + " + " + b + " = " + obj.addition(a, b));
                    break;
                case 2:
                    System.out.print("Enter 1st number = ");
                    a = scan.nextDouble();
                    System.out.print("Enter 2nd number = ");
                    b = scan.nextDouble();
                    System.out.println(a + " - " + b + " = " + obj.subtraction(a, b));
                    break;
                case 3:
                    System.out.print("Enter 1st number = ");
                    a = scan.nextDouble();
                    System.out.print("Enter 2nd number = ");
                    b = scan.nextDouble();
                    System.out.println(a + " x " + b + " = " + obj.multiplication(a, b));
                    break;
                case 4:
                    System.out.print("Enter 1st number = ");
                    a = scan.nextDouble();
                    System.out.print("Enter 2nd number = ");
                    b = scan.nextDouble();
                    System.out.println(a + " / " + b + " = " + obj.division(a, b));
                    break;
                case 5:
                    System.out.print("Enter the number = ");
                    a = scan.nextDouble();
                    System.out.print("Enter the power = ");
                    b = scan.nextDouble();
                    System.out.println(a + "^" + b + " = " + obj.power(a, b));
                    break;
                case 6:
                    System.out.print("Enter 1st number = ");
                    int p = scan.nextInt();
                    System.out.print("Enter 2nd number = ");
                    int q = scan.nextInt();
                    if(p>=q)
                        System.out.println("gcd(" + p + "," + q +  ") = " + obj.gcd(p, q));
                    else
                        System.out.println("gcd(" + q + "," + p +  ") = " + obj.gcd(q, p));
                    break;
                case 7:
                    String str = " ";
                    str = scan.nextLine();
                    int i=0;
                    int[] arr = new int[20];
                    while(true){
                        System.out.print("Enter the number = ");
                        str = scan.nextLine();
                        if(str.equals("exit")){
                            break;
                        }
                        arr[i] = Integer.parseInt(str);
                        i++;
                    }
                    System.out.println("Average = "+obj.mean(arr,i));
                    break;
                case 8:
                    System.out.print("Enter the Number = ");
                    a = scan.nextDouble();
                    System.out.println("Sqrt of "+a+" = "+obj.sqrt(0,(int)a,(int)a));
                    break;
                case 9:
                    c='n';
                    break;
                default:
                    System.out.println("OOPs!!! Wrong Choice");
            }
            System.out.println("\n");
        }while(c=='y');
        scan.close();
    }
}
