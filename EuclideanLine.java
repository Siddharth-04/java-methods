import java.util.Scanner;

public class EuclideanLine {
    //method to calculate distance
    public static double calculateEuclideanDistance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    //method to find equation of line
    public static double[] findEquationOfLine(int x1, int y1, int x2, int y2) {
        double slope = (double) ((y2 - y1) / (x2 - x1));
        double yIntercept = y1 - (slope * x1);
        double[] result = {slope, yIntercept};
        return result;
    }    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Taking input 
        System.out.print("Enter x1: ");
        int x1 = scanner.nextInt();
        System.out.print("Enter y1: ");
        int y1 = scanner.nextInt();
        System.out.print("Enter x2: ");
        int x2 = scanner.nextInt();
        System.out.print("Enter y2: ");
        int y2 = scanner.nextInt();
         
        double distance = calculateEuclideanDistance(x1, y1, x2, y2); //function to calculate distance
        System.out.println("Euclidean Distance: " + distance);
        
        double[] equation = findEquationOfLine(x1, y1, x2, y2); //finding line equation
        System.out.println("Equation of line: y = " + equation[0] + "x + " + equation[1]); //printing
    }
}
