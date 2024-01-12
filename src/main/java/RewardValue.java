public class RewardValue {

private final double cashValue;
public static final double MILES_TO_CASH_CONVERSION_RATE=0.0035;


    public RewardValue(double cashValue) {
        this.cashValue = cashValue;

    }


    public RewardValue(int milesValue) {
        this.cashValue = convertToCash(milesValue);
    }



    public double getCashValue() {
        return cashValue;
    }


    public double getMilesValue() {
        return convertToMiles(this.cashValue);

    }




    public double convertToCash(double milesValue) {
        return milesValue * MILES_TO_CASH_CONVERSION_RATE;
    }


    public int convertToMiles(double cashValue) {

       return (int) (cashValue/MILES_TO_CASH_CONVERSION_RATE);
    }





}
