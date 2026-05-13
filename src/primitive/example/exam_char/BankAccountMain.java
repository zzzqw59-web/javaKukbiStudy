package primitive.example.exam_char;

public class BankAccountMain {
    static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.deposit(10000);
        account.withdraw(1000);
        System.out.println("account = " + account.getBalance());
    }
}
