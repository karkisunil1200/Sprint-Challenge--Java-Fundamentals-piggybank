package coinApp;

public class Dollars extends Coins {

    protected int count = 0;
    protected double total = 0;
    protected double value = 1;

    public Dollars() {
        super(1);
        this.total = 1;
    }

    public Dollars(int num) {
        super(num * 1);
        this.total = num;

    }


//    @Override
//    public double getTotalValue() {
//        return this.totalValue = getTotalValue();
//    }


    @Override
    public void getCount() {
        if (this.total > 1) {
            System.out.println("You have : " + this.total + " Dollars");
        } else {
            System.out.println("You have : " + this.total + " Dollar");


        }
    }
}
