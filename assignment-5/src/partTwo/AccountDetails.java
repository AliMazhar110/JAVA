package partTwo;

public class AccountDetails extends SavingAccount{
    private String deposits, withdrawal;
    public AccountDetails(){
        deposits = null;
        withdrawal = null;
    }
    protected void getData(){
        super.getData();
        System.out.print("Enter Deposit Amount = ");
        deposits = scan.nextLine();
        System.out.print("Enter Withdrawal Amount = ");
        withdrawal = scan.nextLine();
    }
    protected void putData(){
        super.putData();
        System.out.println("Deposited = "+deposits);
        System.out.println("Withdraw = "+withdrawal);
    }
}
