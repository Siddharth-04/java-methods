import java.util.Scanner;

public class SumOfNaturalNumbers{
    public static void sumOfNaturalNumbers(int number){
        if (number >= 0) {
            int sum = number * (number + 1)/2; // formula of calculating the sum of n natural numbers
            System.out.println("The sum of " + number + " natural numbers is " + sum);
        } else {
            System.out.println("The number " + number + " is not a natural number");
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        sumOfNaturalNumbers(number);  
    }
}