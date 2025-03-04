import java.util.Scanner;

public class FindRemainderAndQuotient{

    public static int[] findRemainderAndQuotient(int number, int divisor) { //function to find remainder and quotient
        int quotient = number / divisor;
        int remainder = number % divisor;
        return new int[]{quotient, remainder};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int number = scanner.nextInt(); //input number
        System.out.print("Enter the divisor: ");
        int divisor = scanner.nextInt(); //enter divisor

        if (divisor == 0) {
            System.out.println("Error: Division by zero is not allowed.");
        } else {
            int[] result = findRemainderAndQuotient(number, divisor); //call function and store the result in an array
            System.out.println("Quotient: " + result[0]);
            System.out.println("Remainder: " + result[1]);
        }
    }
}
