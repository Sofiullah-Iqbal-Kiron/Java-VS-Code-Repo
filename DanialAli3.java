import java.util.Scanner;

public class DanialAli3 {
    public static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("------------Activity 3 --------------");
        System.out.println("My name is Danial Ali");
        System.out.println("Roll Number is 20-CS-79");
        Account a1 = new Account();
        a1.setBalance(2500);
        a1.showBalance();

        Account a2 = new Account();
        a2.setBalance(5000);
        a2.showBalance();
    }

    class Account {
        double balance;

        public void setBalance(double b) {
            balance = b;
        }

        public void showBalance() {
            System.out.println("Balance is" + balance);
        }

        public void addDeposite() {
            System.out.print("Enter deposite ammount: ");
            double deposite = input.nextDouble();
            balance += deposite;
            System.out.println("Deposite added. Current balance: " + balance);
        }

        public void moneyWithdraw() {
            System.out.print("Ammount to withdraw: ");
            double toWithdraw = input.nextDouble();
            balance -= toWithdraw;
            System.out.println("Balance after withdraw: " + balance);
        }
    }
}