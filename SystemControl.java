package app;

import java.util.ArrayList;

public class SystemControl {
    public ArrayList<Pass> Passes;

    public void createQuantitativePass(SimpleCount s1mpleCount, boolean isPilgin){
        int price = s1mpleCount.getPrice();
        if(isPilgin){
            price /=2;
        }

        Passes.add(new QuantitativePass(price, s1mpleCount.getCountTravels(),false));
    }

    public void createDurablePass(DaysCount daysCount, boolean isPilgin){
        int price = daysCount.getPrice();
        if(isPilgin){
            price /=2;
        }

        Passes.add(new DurablePass(price,daysCount,false));
    }

    public void createCumulativePass(int price){

        Passes.add(new CumulativePass(price));
    }



}
