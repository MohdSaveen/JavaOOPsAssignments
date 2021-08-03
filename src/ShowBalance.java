public class ShowBalance extends WithdrawMoney{
    public int balance;

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance =balance;
    }

    Deposits deposits=new Deposits();
    public Deposits getDeposits() {
        return deposits;
    }
    WithdrawMoney withdrawMoney=new WithdrawMoney();
    public WithdrawMoney getWithdrawMoney() {
        return withdrawMoney;
    }

}
