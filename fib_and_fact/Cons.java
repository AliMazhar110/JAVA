import java.io.Console;
class Op{
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
public class Cons {
    public static void main(String[] args){
        Console c = System.console();
        Op obj = new Op();
        int a = Integer.parseInt(c.readLine());
        int i=0;
        System.out.println("Factorial of " + a + " = " + obj.factorial(a));
        System.out.print("Fibonacci of " + a + " = ");
        while(i<a){
            System.out.print(" "+obj.fibonacci(i));
            i++;     
        }
    }
}
