package coinApp;


import java.util.ArrayList;

public class Main {



    public static void printMoney(ArrayList<Coins> coin, CheckMoney tester) {

        for(Coins c : coin ) {

            if(tester.test(c)) {
                System.out.println(c.getTotalValue());
            }
        }
    }

    public static void main(String[] args) {
        // write your code here

        ArrayList<Coins> piggyBank = new ArrayList<Coins>();

        piggyBank.add(new Quarter(4));
        piggyBank.add(new Dime(6));
        piggyBank.add(new Dime(6));
        piggyBank.add(new Dime());
        piggyBank.add(new Dollars(3));
        piggyBank.add(new Penny(9));
        piggyBank.add(new Penny());
        piggyBank.add(new Quarter());
        piggyBank.add(new Nickle(12));


        piggyBank.forEach(a -> System.out.println(a.getTotalValue()));
//        for (Coins coins : piggyBank) {
//            coins.getCount();
//        }


    }


}
