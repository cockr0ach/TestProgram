import java.util.Scanner;
public class DoWhile 
{
    public static void main(String[] args) 
    {
        double price, tax;
        char reply;
        Scanner keyboard = new Scanner(System.in);
        do
        {
            System.out.print("Enter initial price: ");
            price = keyboard.nextDouble();
            System.out.print("Enter tax rate: ");
            tax = keyboard.nextDouble();
            price = price * (1+ tax/100);
            System.out.println("Cost after tax = "+price);
            System.out.println();
            System.out.print("Would you like to enter another product(y/n)?: ");
            reply = keyboard.next().charAt(0);
            System.out.println();
        }   
        while(reply =='y' || reply == 'y'); 
    }
}
