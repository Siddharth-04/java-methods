import java.util.Scanner;

public class LeapYearChecker {
    
    // Method to check if a year is a leap year
    public static boolean isLeapYear(int year) {
        if (year < 1582) {
            return false;
        }
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0); //return if it is leap year
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year : ");
        
        if (!scanner.hasNextInt()) { //if not integer
            System.out.println("Invalid input! Please enter a valid year.");
            scanner.close();
            return;
        }
        
        int year = scanner.nextInt();
        if (year < 1582) {
            System.out.println("Invalid input! Leap year calculation is valid only for years greater than 1582."); //invalid input
        } else {
            if (isLeapYear(year)) {
                System.out.println(year + " is a Leap Year.");
            } else {
                System.out.println(year + " is NOT a Leap Year.");
            }
        }
    }
}
