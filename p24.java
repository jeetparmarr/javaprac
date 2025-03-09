class Banking extends Exception {
    Banking(String message) {
        super(message);
    }
}
class BankAcc{
    int balance;
/* 
    BankAcc(int balance) {
        this.balance = balance;
    }
*/
    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: Rs " + amount + " | Current Balance: Rs " + balance);
    }

    void withdraw(double amount) throws Banking {
        if (amount > balance) {
            throw new Banking("Not Sufficient Fund");
        }
        balance -= amount;
        System.out.println("Withdrawn: Rs " + amount + " | Remaining Balance: Rs " + balance);
    }
}

public class p24 {
    public static void main(String[] args) {
        BankAcc account = new BankAcc();
        
        try {
            account.deposit(25000);
            account.withdraw(20000);
            account.withdraw(4000);
            account.withdraw(2000); // This should throw an exception
        } catch (Banking e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
