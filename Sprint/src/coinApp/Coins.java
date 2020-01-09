package coinApp;


public abstract class Coins {

    private double numsOfCoins;
    protected double sum;
    protected double totalValue;

    public Coins() {

    }

    public Coins(double nums) {
        this.totalValue = nums;
    }

    public double getTotalValue() {
        return totalValue;
    }



    public abstract void getCount();



}
