package app;

import java.util.Date;

public class DurablePass extends Pass{

    private Date endDate;
    DaysCount day;

    public DurablePass(int price, DaysCount day ,boolean isPilging) {
        super(price ,isPilging);
        endDate = getDateOfReg();
        endDate.setDate(endDate.getDate() + day.getDays());

    }


    @Override
    public void verifyPass() {
        Date currentDate = new Date();
        if (endDate.compareTo(currentDate) >= 0) {
            System.out.println("Проезд разрешен");
        } else {
            System.out.println("Проезд запрещён");
        }
    }
}
