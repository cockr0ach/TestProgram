import java.util.Scanner;
class FindCost
{
    public static void main(String[] args)
    {
        double price, tax;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("*** Product Price Check ***");
        System.out.print("Enter initial price: ");
        price = keyboard.nextDouble();
        System.out.print("Enter tax rate: ");
        tax = keyboard.nextDouble();
        if (price > 100)
        {
            System.out.println("Special Promotion: We pay half your tax");
            tax = tax * 0.5;
        }
        price = price * (1+tax/100);
        System.out.println("Cost after tax = " +price);
    }
}