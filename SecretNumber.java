import java.util.Scanner;
public class SecretNumber 
{
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        final int SECRET = 27;
        int num;
        boolean guessed = false;
        System.out.println("You have 3 goes to guess the secret number");
        System.out.println("HINT: It is a number less than 50");
        System.out.println();
        for (int i= 1; i<= 3; i++)
        {
            System.out.print("Enter guess: ");
            num = keyboard.nextInt();
            if (num == SECRET)
            {
                guessed = true;
                break;
            }
        }
        if (guessed)
        {
            System.out.println("Number gussed correctly");
        }
        else
        {
            System.out.println("Number NOT guessed");
        }
    }
}
