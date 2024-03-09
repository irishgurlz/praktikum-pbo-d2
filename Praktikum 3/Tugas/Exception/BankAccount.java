/* 
Nama     : Aniqah Nursabrina
NIM      : 24060122120036
Tanggal  : 09/03/2024
 */ 
public class BankAccount {
    private double balance;
    private final double MIN_BALANCE = 100.0; // Saldo minimal
  
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }
  
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: $" + amount);
    }
  
    public void withdraw(double amount) throws InsufficientFundsException{
        try {
            if (this.balance - amount > this.MIN_BALANCE) {
                System.out.println("Withdrawn: $" + amount);
                this.balance -= amount;
            }
            else {
                throw new InsufficientFundsException("Insufficient funds. Minimum balance required: $"+this.MIN_BALANCE);
            }
        }
        catch (InsufficientFundsException ex) {
            System.out.println(ex.getMessage());
        }
    }
  
    public double getBalance() {
        return balance;
    }
  }
  
