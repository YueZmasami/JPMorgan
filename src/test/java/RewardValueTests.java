import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RewardValueTests {

    @Test
    void create_with_cash_value() {
        double cashValue = 100;
        RewardValue rewardValue = new RewardValue(cashValue);
        assertEquals(cashValue, rewardValue.getCashValue());
    }

    @Test
    void create_with_miles_value() {
        int milesValue = 10000;
        RewardValue rewardValue = new RewardValue(milesValue);
        assertEquals(milesValue, rewardValue.getMilesValue());
    }

    @Test
    void convert_from_cash_to_miles() {
        RewardValue rewardValue=new RewardValue(100);
        int expectMiles=(int)(100/ 0.0035);
        int actualMiles=rewardValue.convertToMiles(100);
        assertEquals(expectMiles, actualMiles);


    }

    @Test
    void convert_from_miles_to_cash() {

        RewardValue rewardValue=new RewardValue(10000);
        double expectCash=10000*0.0035;
        double actualCash=rewardValue.convertToCash(10000);
        assertEquals(expectCash, actualCash);

    }
}
