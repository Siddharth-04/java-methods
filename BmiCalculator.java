import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] data = new double[10][3];
        String[] statuses = new String[10];

        for (int i = 0; i < 10; i++) {
            System.out.println("Enter weight for person " + (i + 1) + ": ");
            data[i][0] = sc.nextDouble();
            System.out.println("Enter height for person " + (i + 1) + ": ");
            data[i][1] = sc.nextDouble();
            data[i][2] = calculateBMI(data[i][0], data[i][1]);
            statuses[i] = getBMIStatus(data[i][2]);
        }
        sc.close();

        System.out.println("\nPerson Data:");
        System.out.println("Weight   Height   BMI    Status");
        for (int i = 0; i < 10; i++) {
            System.out.println(data[i][0] + "    " + data[i][1] + "   " + data[i][2] + "   " + statuses[i]);
        }
    }

    public static double calculateBMI(double weight, double height) {
        double heightInMeters = height / 100;
        return weight / (heightInMeters * heightInMeters);
    }

    public static String getBMIStatus(double bmi) {
        if (bmi <= 18.4) return "Underweight";
        else if (bmi <= 24.9) return "Normal weight";
        else if (bmi <= 39.9) return "Overweight";
        else return "Obese";
    }
}
