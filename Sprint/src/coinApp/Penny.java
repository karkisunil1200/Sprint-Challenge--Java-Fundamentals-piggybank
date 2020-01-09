package coinApp;

public class Penny extends Coins {

    private int count = 0;
    private double total = 0;
    protected double value = .01;
    protected double totalValue = 0;


    public Penny(double nums) {
        super(nums * .01);
        count++;
        this.total = nums;
    }

    public Penny() {
        super(.01);
        count++;
        this.total = 1;
    }


//    @Override
//    public double getTotalValue() {
//        return this.totalValue = getTotalValue();
//    }


    @Override
    public void getCount() {
        if (this.total > 1) {
            System.out.println("You have : " + this.total + " Pennies");
        } else {
            System.out.println("You have : " + this.total + " Penny");


        }
    }
}