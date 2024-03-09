/* 
Nama     : Aniqah Nursabrina
NIM      : 24060122120036
Tanggal  : 09/03/2024
 */ 
public class BankApp {
    public static void main(String[] args) {
         BankAccount account = new BankAccount(500.0);
  
         try {
                account.withdraw(200.0);
                System.out.println("Saldo saat ini: $" + account.getBalance());
                account.withdraw(400.0);
         }
         catch (InsufficientFundsException ex) { 
            System.out.println(ex.getMessage());
         }

    }
  }
  