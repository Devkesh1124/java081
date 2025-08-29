package new_java;

public class Bank {
    private int Balance=100000;
    public void withdrawal(int amount){
        if(amount>Balance){
            throw new InsufficientBalanceException("cannot withdraw you have less amount");
        }
        else
        {
            Balance=Balance-amount;
            System.out.println("Withdrawal complete");
            System.out.println("remaining balance: "+Balance);
        }
    }
}
