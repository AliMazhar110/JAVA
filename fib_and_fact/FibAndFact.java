import java.io.BufferedReader;
import java.io.InputStreamReader;
class Operations{
    public int factorial(int n){
        if(n==0 || n==1){
            return 1;
        }
        return(n*factorial(n-1));
    }
    public int fibonacci(int n){
        if(n<=1){
            return n;
        }
        return(fibonacci(n-2)+fibonacci(n-1));
    }
}
public class FibAndFact{
    public static void main(String[] args) throws Exception{
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
        int a,b;
        char c='y';
        Operations obj = new Operations();
        do{
            System.out.println("Main Menu :-");
            System.out.println("1. Factorial of a number.");
            System.out.println("2. Fibonacci Series");
            System.out.println("3. Exit");
            System.out.print("Enter your choice = ");
            a = Integer.parseInt(br.readLine());
            switch(a){
                case 1:
                    System.out.print("Enter the number = ");
                    b = Integer.parseInt(br.readLine());
                    System.out.println("Factorial of " + b + " = " + obj.factorial(b));
                    break;
                case 2:
                    a=0;
                    System.out.print("Enter the number = ");
                    b = Integer.parseInt(br.readLine());
                    System.out.print("Fibonacci of " + b + " = ");
                    while(a<b){
                        System.out.print(" "+obj.fibonacci(a));
                        a++;
                    }
                    break;
                case 3:
                    c='n';
                    break;
                default:
                    System.out.println("Opps!!! Wrong Option");
            }
            System.out.println("\n");
        }while(c=='y');
        br.close();
    }
}