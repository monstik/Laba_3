package app;

public class QuantitativePass extends Pass {

    private int countTravels;

    public int getCountTravels() {
        return countTravels;
    }

    public void setCountTravels(int value) {
        countTravels = value;
    }

    public QuantitativePass(int price, int countTravels, boolean isPilging) {
        super(price ,isPilging);

        this.countTravels = countTravels;
    }

    @Override
    public void verifyPass() {
        if(countTravels > 0)
        {
            System.out.println("Проезд разрешен");
        }else{
            System.out.println("Проезд запрещён, количество доступных поездок - 0");
        }
    }
}





