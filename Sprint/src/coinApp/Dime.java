package coinApp;

public class Dime extends Coins {

    protected int count = 0;
    protected double total = 0;
    protected double value = .10;
    protected double totalValue = 0;



    public Dime() {
        super(.10);
        count++;
        this.total = 1;

    }

    public Dime(double nums) {
        super(nums * .10);
        count++;
        this.total = nums;

    }


//    @Override
//    public double getTotalValue() {
//        return this.totalValue = getTotalValue();
//    }


    @Override
    public void getCount() {
        if (this.total > 1) {
            System.out.println("You have : " + this.total + " Dimes");
        } else {
            System.out.println("You have : " + this.total + " Dime");


        }
    }
}