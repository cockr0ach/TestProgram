import java.util.Scanner;
public class TimeTableWithSwitch 
{
    public static void main(String[] args) 
    {
         Scanner keyboard = new Scanner(System.in);
        char group;
        System.out.println("*** Lab Times***");
        System.out.println("Enter Your Group  (A,B,C)");
        group = keyboard.next().charAt(0);
        switch (group) 
        {
             case 'A':System.out.println("10.00 a.m");
                break;
       
             case 'B':System.out.println("1.00 p.m");
                break;
        
             case 'C':System.out.println("10.00 a.m");
                 break;
    
             default: System.out.println("No such group");
        }
    }
}

