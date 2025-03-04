import java.util.Scanner;

public class TrigonometricFunctions{ 

    public static double[] calculateTrigonometricFunctions(double angle) { //method to calculate trigonometric functions
        double radians = Math.toRadians(angle);
        double sine = Math.sin(radians);
        double cosine = Math.cos(radians);
        double tangent = Math.tan(radians);
        return new double[]{sine, cosine, tangent};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the angle in degrees: ");
        double angle = scanner.nextDouble(); //input angle

        double[] results = calculateTrigonometricFunctions(angle);

        System.out.println("Sine:" + results[0]); //output print
        System.out.println("Cosine: " + results[1]);
        System.out.println("Tangent: " + results[2]);
    }
}
