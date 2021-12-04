class Operate{
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
public class cmdLine{
    public static void main(String[] args){
        int a,b;
        Operate obj = new Operate();
        a = Integer.parseInt(args[0]);
        switch(a){
            case 1:
                b = Integer.parseInt(args[1]);
                System.out.println("Factorial of " + b + " = " + obj.factorial(b));                    
                break;
            case 2:
                a=0;
                b = Integer.parseInt(args[1]);
                System.out.print("Fibonacci of " + b + " = ");
                while(a<b){
                    System.out.print(" "+obj.fibonacci(a));
                    a++;
                }
                System.out.println("\n");
                break;
            default:
                System.out.println("Opps!!! Wrong Option");
        }
    }
}