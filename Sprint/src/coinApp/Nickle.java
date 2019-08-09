package coinApp;

public class Nickle extends Coins {

    protected int count = 0;
    protected double total = 0;
    protected double value = .05;

    public Nickle() {
        super(.05);
        this.total = 1;
    }

    public Nickle(int nums) {
        super(nums * .05);
        this.total = nums;

    }

//
//    @Override
//    public double getTotalValue() {
//        return this.totalValue = getTotalValue();
//    }


    @Override
    public void getCount() {
        if (this.total > 1) {
            System.out.println("You have : " + this.total + " Nickles");
        } else {
            System.out.println("You have : " + this.total + " Nickle");

        }
    }
}