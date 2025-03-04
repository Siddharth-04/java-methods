import java.util.Scanner;
public class SpringSeason {
    public static boolean checkSeason(int month, int day) {
        
        boolean isSpring = (month == 3 && day >= 20 && day <= 31) || (month == 4 && day >= 1 && day <= 30) || (month == 5 && day >= 1 && day <= 31) || (month == 6 && day >= 1 && day <= 20);
        if (isSpring) {
            return true;
        } 
        return false;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the month : ");
        int month = scanner.nextInt();
        System.out.println("Enter the day : ");
        int day = scanner.nextInt();

        if (checkSeason(month, day)) {
            System.out.println("It's a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
        
    }
}