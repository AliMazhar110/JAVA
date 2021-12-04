package partTwo;
public class SavingAccount extends Account{
    private String min_balance,saving_bal;
    public SavingAccount(){
        min_balance = null;
        saving_bal = null;
    }
    protected void getData(){
        super.getData();
        System.out.print("Enter Minimum Balance = ");
        min_balance = scan.nextLine();
        System.out.print("Enter Saving Balance = ");
        saving_bal = scan.nextLine();
    }
    protected void putData(){
        super.putData();
        System.out.println("Minimum Balance = "+min_balance);
        System.out.println("Saving Balance = "+ saving_bal);
    }
}
