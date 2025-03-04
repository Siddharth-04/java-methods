import java.util.Scanner;

public class WindChillCalculator{

    public static double calculateWindChill(double temperature, double windSpeed) { //method to calculate wind chill
        return 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //scanner

        System.out.print("Enter the temperature : ");
        double temperature = scanner.nextDouble(); //temperature
        System.out.print("Enter the wind speed : ");
        double windSpeed = scanner.nextDouble(); //windSpeed

        if (temperature > 50 || windSpeed < 3) {
            System.out.println("Wind chill calculation is only valid for temperatures ≤ 50°F and wind speeds ≥ 3 mph."); //error message
        } else {
            double windChill = calculateWindChill(temperature, windSpeed);
            System.out.printf("The wind chill temperature is: %.2f°F%n", windChill);   //output print
        }
    }
}
