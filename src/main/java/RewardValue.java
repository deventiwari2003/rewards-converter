public class RewardValue {
    public static final double CONVERSION_MILES_TO_RATE = 0.0035;
    double cash;
    long miles;

    public RewardValue(double cash) {
        this.cash = cash;
    }
    public RewardValue(long miles)
    {
        this.miles = miles;
    }
    public double getCashValue()
    {
        this.cash = this.miles / RewardValue.CONVERSION_MILES_TO_RATE ;
        return this.cash;
    }
    public long getMilesValue()
    {
        this.miles = (long) (RewardValue.CONVERSION_MILES_TO_RATE * this.cash);
        return this.miles;
    }
}
