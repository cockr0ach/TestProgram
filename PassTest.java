import java.util.Scanner;
public class PassTest 
{
    public static void main(String[] args) 
    {
       double marks ;
       Scanner keyboard = new Scanner(System.in);
       System.out.print("Enter Your Marks: ");
       marks = keyboard.nextDouble();
       if(marks < 40)
       {
            System.out.println("Sorry You Are Fail");
       } 
       else
       {
             System.out.println("You Are Pass");
       }
    }
}
