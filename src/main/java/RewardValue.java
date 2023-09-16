public class RewardValue {
    public static final double CONVERSION_MILES_TO_RATE = 0.0035;
    double cash;
    int miles;

    public RewardValue(double cash) {
        this.cash = cash;
    }
    public RewardValue(int miles)
    {
        this.miles = miles;
    }
    public double getCashValue()
    {
        this.cash = this.miles / RewardValue.CONVERSION_MILES_TO_RATE ;
        return this.cash;
    }
    public int getMilesValue()
    {
        this.miles = (int) (RewardValue.CONVERSION_MILES_TO_RATE * this.cash);
        return this.miles;
    }
}
