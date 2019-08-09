package coinApp;



public class Quarter extends Coins{

    protected int count = 0;
    protected double total = 0;
    protected double value = .10;
    protected double totalValue = 0;

    public Quarter() {
        super(.25);
        this.total = 1;
    }

    public Quarter(double nums) {
        super(nums * .25);
        this.total = nums;

    }

//    @Override
//    public double getTotalValue() {
//        return this.totalValue = getTotalValue();
//    }


    @Override
    public void getCount() {
        if(this.total >  1) {
            System.out.println("You have : " + this.total + " Quarters");
        } else {
            System.out.println("You have : " + this.total + " Quarter");
        }
    }
}
