import java.util.Scanner;
public class TemperatureWithMethods 
{
    public static void main(String[] args) 
    {
        double[] temperature;
        temperature = enterTemps();
        displayTemps (temperature);    
    }
    static double[] enterTemps()
    {
        Scanner keyboard = new Scanner(System.in);
        double[] temperatureOut = new double[7];
        for(int i = 0; i< temperatureOut.length; i++)
        {
            System.out.println("Enter max temperature for day "+(i+1));
            temperatureOut[i] = keyboard.nextDouble();
        } 
        return temperatureOut;
    }
    static void displayTemps(double[] temperatureIn)
    {
        System.out.println( );
        System.out.println("***Temperature Entered***");
        {
            System.out.println();
            for(int i = 0; i< temperatureIn.length; i++)
            {
                System.out.println("Day "+(i+1)+" "+ temperatureIn[i]);
            }
        }
    }
}
