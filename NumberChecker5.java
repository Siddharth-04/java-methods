public class NumberChecker {
    public static void main(String[] args) {
        int number = 153;
        System.out.println("Number: " + number);
        
        //calling functions and printing output
        System.out.println("Is Prime: " + isPrime(number));
        System.out.println("Is Neon Number: " + isNeonNumber(number));
        System.out.println("Is Spy Number: " + isSpyNumber(number));
        System.out.println("Is Automorphic Number: " + isAutomorphicNumber(number));
        System.out.println("Is Buzz Number: " + isBuzzNumber(number));
    }

    public static boolean isPrime(int number) { //is prime function
        if (number < 2) return false;
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) return false;
        }
        return true;
    }

    public static boolean isNeonNumber(int number) { //isNeon number function
        int square = number * number, sum = 0;
        while (square > 0) {
            sum += square % 10;
            square /= 10;
        }
        return sum == number;
    }

    public static boolean isSpyNumber(int number) { //Spy number function
        int sum = 0, product = 1;
        while (number > 0) {
            int digit = number % 10;
            sum += digit;
            product *= digit;
            number /= 10;
        }
        return sum == product;
    }

    public static boolean isAutomorphicNumber(int number) { //Automorphic number function
        int square = number * number;
        int temp = number;
        if (square % 10 != temp % 10) return false;
        return true;
    }

    public static boolean isBuzzNumber(int number) { //Buzz number function
        if(number % 7 == 0 || number % 10 == 7){
            return true;
        }

        return false;
    }
}
