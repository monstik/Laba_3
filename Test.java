package app;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class Test {


    @Test
    void Test() {
        Turniket turnstile = new Turniket();

        Pass pass1 = SystemControl.createCumulativePass(90);
        Pass pass2 = SystemControl.createDurablePass(true, DaysCount.WEEK);
        Pass pass3 = SystemControl.createQuantitativePass(true, SimpleCount.TEN);

        turnstile.MakePass(card1);
        turnstile.MakePass(card1);
        turnstile.MakePass(card1);
        turnstile.MakePass(card1);
        turnstile.MakePass(card2);
        turnstile.MakePass(card3);


    }
}
