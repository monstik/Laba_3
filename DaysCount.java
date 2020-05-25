package app;

public enum DaysCount {

    ONEDAY(1, 10),
    WEEK(7, 50),
    MONTH(30, 190);

    private int days;
    private int price;

    public int getDays() {
        return days;
    }
    public int getPrice() {
        return price;
    }

    DaysCount(int days, int price) {
        this.days = days;
        this.price = price;
    }

}
