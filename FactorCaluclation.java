import java.util.Scanner;

public class FactorCalculator {

    public static int[] findFactors(int number) { //find factor
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index++] = i;
            }
        }
        return factors;
    }

    public static int sumOfFactors(int[] factors) { //sum of factors
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    public static int productOfFactors(int[] factors) { //product of factors
        int product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    public static int sumOfSquaresOfFactors(int[] factors) { //sum of squares of factors
        int sum = 0;
        for (int factor : factors) {
            sum += Math.pow(factor, 2);
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt(); //input numbers

        int[] factors = findFactors(number);

        System.out.print("Factors: ");
        for (int factor : factors) {
            System.out.print(factor + " ");
        }
        System.out.println();

        System.out.println("Sum of factors: " + sumOfFactors(factors)); //print sum of factors
        System.out.println("Sum of squares of factors: " + sumOfSquaresOfFactors(factors)); //print sum of squares of factors
        System.out.println("Product of factors: " + productOfFactors(factors)); //print product of factor
    }
}
