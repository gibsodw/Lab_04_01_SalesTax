public class Main
{
    public static void main(String[] args) {
        double purchasePrice = 4.75;
        double salesTax = 1.05;
        double total = 0;

        System.out.println("What is the price of your purchase?");

        total = purchasePrice * salesTax;

        System.out.println("The total cost of your purchase at a 5% sales tax is " + total);

    }
}
