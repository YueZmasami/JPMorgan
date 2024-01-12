public class RewardValue {

private double cashValue;
private double milesValue;
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = convertToMiles(cashValue);
    }

    public RewardValue(double milesValue, boolean isMiles) {
        this.milesValue = milesValue;
        this.cashValue = isMiles ? convertToCash(milesValue) : milesValue;
    }



    public double getCashValue() {
        return cashValue;
    }


    public double getMilesValue() {
        return milesValue;
    }




    private double convertToCash(double milesValue) {
        return milesValue * 0.0035;
    }


    private double convertToMiles(double cashValue) {
        return cashValue / 0.0035;
    }





}
