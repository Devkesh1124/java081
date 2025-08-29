package new_java;

public class MyBank {
    public static void main(String[] args) {
        Bank user=new Bank();
        try
        {
            user.withdrawal(120000);
        }
        catch (InsufficientBalanceException e)
        {
            System.out.println(e.getMessage());
        }

    }
}
