public class RewardValue {
    public static final double CONVERSION_MILES_TO_RATE = 0.0035;
    double cash;
    //int miles;

    public RewardValue(double cash) {
        this.cash = cash;
    }
    public RewardValue(int miles)
    {
        this.cash = RewardValue.convert_cash(miles);
    }
    public static int convert_miles(double cash)
    {
        int miles;
        miles = (int)(cash / RewardValue.CONVERSION_MILES_TO_RATE) ;
        return miles;
    }

    public static double convert_cash(int miles)
    {
        double cash;
        cash = RewardValue.CONVERSION_MILES_TO_RATE * miles;
        return cash;
    }
    public double getCashValue()
    {
        //this.cash = this.miles / RewardValue.CONVERSION_MILES_TO_RATE ;
        return this.cash;
    }
    public int getMilesValue()
    {
        return RewardValue.convert_miles(this.cash);
    }
}
