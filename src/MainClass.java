import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
                Deposits deposits = new Deposits();
                System.out.println("Enter Deposit Money ");
                deposits.setDepositMoney(scanner.nextInt());
                System.out.println("Money has Deposited");
                WithdrawMoney withdrawMoney = new WithdrawMoney();
                System.out.println("Enter Withdrawl money value");
                withdrawMoney.setWithdrawl(scanner.nextInt());
                System.out.println("Withdrawl amount is =" + withdrawMoney.getWithdrawl());
                ShowBalance showBalance = new ShowBalance();
                 System.out.println("Your balance is =");
                showBalance.setBalance(deposits.getDepositMoney()-withdrawMoney.getWithdrawl());
                 System.out.println(showBalance.getBalance());
        System.out.println("----------------------------------------------------");
                 System.out.println("Your Account details");
        System.out.println("----------------------------------------------------");
                ShowAccountDetails showAccountDetails = new ShowAccountDetails();
                System.out.println("Your deposit money was =");
                showAccountDetails.setDetails(deposits.getDepositMoney());
                System.out.println(showAccountDetails.getDetails());
                System.out.println("Your withdrawl amount was =");
                showAccountDetails.setDetails(withdrawMoney.getWithdrawl());
                System.out.println(showAccountDetails.getDetails());
                System.out.println("Your balance is =");
                showAccountDetails.setDetails(showBalance.getBalance());
                System.out.println(showAccountDetails.getDetails());



    }
}