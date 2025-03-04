import java.util.Scanner;

public class ChocolateDistribution {

    public static int[] distributeChocolates(int numberOfChocolates, int numberOfChildren) {
        if (numberOfChildren == 0) {
            return new int[]{0, numberOfChocolates}; // Avoid division by zero
        }
        int chocolatesPerChild = numberOfChocolates / numberOfChildren;
        int remainingChocolates = numberOfChocolates % numberOfChildren;
        return new int[]{chocolatesPerChild, remainingChocolates};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of chocolates: ");
        int numberOfChocolates = scanner.nextInt();
        System.out.print("Enter the number of children: ");
        int numberOfChildren = scanner.nextInt();

        if (numberOfChildren == 0) {
            System.out.println("Error: Cannot divide chocolates among zero children.");
        } else {
            int[] result = distributeChocolates(numberOfChocolates, numberOfChildren);
            System.out.println("Each child gets: " + result[0] + " chocolates");
            System.out.println("Remaining chocolates: " + result[1]);
        }
    }
}
