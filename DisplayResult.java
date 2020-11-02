import java.util.Scanner;
public class DisplayResult
{
    public static void main(String[] args) 
    {
        int mark;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What exam mark did you get?");
        mark = keyboard.nextInt();
        while (mark < 0 || mark > 100)
        {
            System.out.println("Invalid mark: please re-enter");
            mark = keyboard.nextInt();
        }
        if (mark >= 40)
        {
            System.out.println("Congratulations, you passed");
        }
        else
        {
            System.out.println("Sorry, you failed");
        }

    }

}
