package app;

public class CumulativePass extends Pass {

    private int balance;

    public int getBalance() {
        return balance;
    }

    public void setBalance(int value) {
        this.balance = value;
    }

    public CumulativePass(int price) {
        super(price);
    }

    @Override
    public void verifyPass() {
        if(balance >= 8)
        {
            System.out.println("Проезд разрешен");
        }else{
            System.out.println("Проезд запрещён, пополните пожалуйста баланс");
        }
    }
}
