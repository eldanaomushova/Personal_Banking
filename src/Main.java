import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PersonalAccount personalAccount = new PersonalAccount(4169, "Eldana");
        String accountHolder = personalAccount.getAccountHolder();
        System.out.println(accountHolder);
        personalAccount.deposit(5000);
        try {
            personalAccount.withdraw(10000);
        } catch (InsufficientBalanceException e) {
            System.out.println("Error: " + e.getMessage());
        }
        personalAccount.printTransactionHistory();
    }
}