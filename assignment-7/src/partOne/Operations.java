package partOne;

public class Operations extends RationalNumbers{
    private int m,n;
    private double p,q;
    Operations(int a, int b, int c, int d){
        super(a,b,c,d);
        this.m = 0;
        this.n = 0;
        this.q = 0;
        this.p = 0;
    }
    public void add(){
        m = getA()*getD() + getC()*getB();
        n = getB()*getD();
        simplified();
        System.out.println(getA() + "     " + getC() + "     " + m);
        System.out.println("-" + "  +  " + "-" + "  =  " + "-");
        System.out.println(getB() + "     " + getD() + "     " + n);

    }
    public void sub(){
        m = getA()*getD() - getC()*getB();
        n = getB()*getD();
        simplified();
        System.out.println(getA() + "     " + getC() + "     " + m);
        System.out.println("-" + "  -  " + "-" + "  =  " + "-");
        System.out.println(getB() + "     " + getD() + "     " + n);
    }
    public void multiplication(){
        m = getA()*getC();
        n = getB()*getD();
        simplified();
        System.out.println(getA() + "     " + getC() + "     " + m);
        System.out.println("-" + "  X  " + "-" + "  =  " + "-");
        System.out.println(getB() + "     " + getD() + "     " + n);
    }
    public void divide(){
        m = getA()*getD();
        n = getB()*getC();
        if(n==0){
            System.out.println("Division Not Possible.");
            return;
        }
        simplified();
        System.out.println(getA() + "     " + getC() + "     " + m);
        System.out.println("-" + "  /  " + "-" + "  =  " + "-");
        System.out.println(getB() + "     " + getD() + "     " + n);
    }
    public void floatPoint(){
        p = (double)getA()/(double)getB();
        q = (double)getC()/(double)getD();
        System.out.println("Rational Number - 1 = " + p);
        System.out.println("Rational Number - 2 = " + q);
    }
    public void compare(){
        p = (double)getA()/(double)getB();
        q = (double)getC()/(double)getD();
        if(p>q){
            System.out.println(getA() + "     " + getC());
            System.out.println("-" + "  >  " + "-");
            System.out.println(getB() + "     " + getD());
        }
        else if(p<q){
            System.out.println(getA() + "     " + getC());
            System.out.println("-" + "  <  " + "-");
            System.out.println(getB() + "     " + getD());
        }
        else if(p==q){
            System.out.println(getA() + "     " + getC());
            System.out.println("-" + "  =  " + "-");
            System.out.println(getB() + "     " + getD());
        }
    }
    public void absolute(){
        m = Math.abs(getA());
        n = Math.abs(getB());
        System.out.println("Absolute value of Rational of " + getA()+"/"+getB() + " = " + m+"/"+n);
        m = Math.abs(getC());
        n = Math.abs(getD());
        System.out.println("Absolute value of Rational of " + getC()+"/"+getD() + " = " + m+"/"+n);
    }
    public void simplified(){
        for(int i=9;i>0;i--){
            if(m%i == 0 && n%i == 0){
                m = m/i;
                n = n/i;
            }
        }
    }
}
