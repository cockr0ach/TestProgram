import java.util.Scanner;
public class TemperatureReadings
{
    public static void main(String[] args)
    {
    Scanner keyboard = new Scanner(System.in);
    double[] temperature;
    temperature = new double[7];
    for (int i=0; i<temperature.length; i++)
    {
        System.out.println("Enter the Max temperature of day: "+(i+1));
        temperature[i]=keyboard.nextDouble();
    }
    System.out.println();
    System.out.println("****temperature****");
    System.out.println();
    for(int i = 0; i< temperature.length; i++)
    {
        System.out.println("Day "+(i+1)+": "+temperature[i]);
    }
  }
}