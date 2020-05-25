package app;

public enum SimpleCount {
    FOUR(4, 40),
    TEN(10, 80),
    TWENTY(20, 140);

    private int travels;
    private int price;

    public int getCountTravels() {
        return travels;
    }

    public int getPrice() {
        return price;
    }

    SimpleCount(int travels, int price) {
        this.travels = travels;
        this.price = price;
    }
}