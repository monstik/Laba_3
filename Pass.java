package app;


import java.util.Date;

public abstract class Pass {

    private int id;
    private boolean isBlocked;
    public boolean isPilging;
    private Date registrationDate;
    protected int price;

    public static int count;

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public boolean isBlocked() {
        return isBlocked;
    }

    public int getId() {
        return id;
    }

    public int getPrice() {
        return price;
    }


    public abstract void verifyPass();

    public void BlockPass(boolean blocked) {
        isBlocked = blocked;
    }

    public Pass(int price, boolean isPilging) {
        this(price);
        this.isPilging = isPilging;

    }

    public Pass(int price) {
        this.id = count++;
        this.isPilging = false;
        this.isBlocked = false;
        registrationDate = new Date();
        this.price = price;

    }

    public String GetInformationForPass() {
        return ("Pass id-" + id + "/ isBlocket-" + isBlocked + "/ registrationDate-" + registrationDate);
    }


}
