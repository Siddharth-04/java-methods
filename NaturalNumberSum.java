import java.util.Scanner;

public class NaturalNumberSum {
    
    // Recursive method to calculate sum of n natural numbers
    public static int sumRecursive(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sumRecursive(n - 1);
    }
    
    // Formula method to calculate sum of n natural numbers
    public static int sumFormula(int n) {
        return n * (n + 1) / 2;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        
        if (!scanner.hasNextInt()) {
            System.out.println("Please enter a natural number");
            System.exit(1);
        }
        
        int n = scanner.nextInt();
        if (n <= 0) {
            System.out.println("Please enter a positive natural number");
            System.exit(1);
        }
        
        int recursiveSum = sumRecursive(n);
        int formulaSum = sumFormula(n);
        
        System.out.println("Sum using recursion : " + recursiveSum); //print recursiveSum
        System.out.println("Sum using formula : " + formulaSum); //print formulaSum
        
        if (recursiveSum == formulaSum) {
            System.out.println("Both methods produce the same result");
        } else {
            System.out.println("Mismatch in results");
        }
    }
}
