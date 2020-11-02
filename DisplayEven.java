import java.util.Scanner;
public class DisplayEven 
{
    public static void main(String[] args) 
    {
    
      Scanner keyboard = new Scanner(System.in);
      System.out.print("Enter the number: ");
      int value = keyboard.nextInt();
      System.out.println(); 
      for(int i = 1; i <= value; i++)
      {
          if(i%2 == 0)
          {
              System.out.println(i+ " is even");
          }
          else
          {
              System.out.println(i+ " is odd");
          }
      }   
    }    
}
