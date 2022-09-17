package Programs.Task_7.SubTask_3;

public class Wallet {
    public Wallet(int balance) {
        this.balance = balance;
    }

    private int balance;
    public int getBalance(){
        return balance;
    }
    public void spendMoney(int amount){
        balance -= amount;
    }
    @Override
    public String toString(){
        return "Wallet with the " + balance + " on balance";
    }
}
