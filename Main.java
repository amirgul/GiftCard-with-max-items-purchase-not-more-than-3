import java.util.Scanner;

public class Main
{

    public static final int MAX_ITEMS = 3;
    public static final double TOTAL_SPEND = 100.0;
    public static void main(String[] args)
    {

        Scanner keyboard = new Scanner(System.in);
        boolean haveMoney = true;
        double leftToSpend = TOTAL_SPEND;
        double amount_spend = 0;
        int numberOfItems = 1;
        while ((haveMoney &&numberOfItems <= MAX_ITEMS))
        {
            System.out.println("you can buy total of: " + (MAX_ITEMS -numberOfItems +1));
            System.out.println("Costing no more than: " + leftToSpend);
            System.out.println("Enter the price of item number: " + numberOfItems);
            double itemPrice = keyboard.nextDouble();
            if(itemPrice <= leftToSpend)
            {
                System.out.println("you can buy this item");
                amount_spend = amount_spend + itemPrice;
                leftToSpend = TOTAL_SPEND - amount_spend;
                System.out.println("you spend: " + itemPrice + " for this item");
                if (leftToSpend > 0)
                    numberOfItems++;
                else
                    {
                    System.out.println("you are out of money");
                    haveMoney = false;
                    }
            }
            else
                System.out.println("item is too expensive");



        }
        System.out.println("you spend: " + amount_spend + " and are done shopping");
    }
}
