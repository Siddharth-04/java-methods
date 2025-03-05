public class NumberChecker {
    public static boolean isPrime(int number) {
        if (number < 2) return false;
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) return false;
        }
        return true;
    }

    public static boolean isBuzzNumber(int number) { //buzz number
        if (number % 7 == 0 || number % 10 == 7){
            return true;
        }

        return false;
    }

    public static int[] findFactors(int number) { //find factors
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) count++;
        }
        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) factors[index++] = i;
        }
        return factors;
    }

    public static int findGreatestFactor(int[] factors) { //find greatest factor
        return factors[factors.length - 2];
    }

    public static int sumOfFactors(int[] factors) { //sum of factors
        int sum = 0;
        for (int i = 0; i < factors.length; i++) {
            sum += factors[i];
        }
        return sum;
    }

    public static int productOfFactors(int[] factors) { //product of factors
        int product = 1;
        for (int i = 0; i < factors.length; i++) {
            product *= factors[i];
        }
        return product;
    }

    public static double productOfCubeOfFactors(int[] factors) { //product of cube
        double product = 1;
        for (int i = 0; i < factors.length; i++) {
            product *= Math.pow(factors[i], 3);
        }
        return product;
    }
    public static void main(String[] args) {
        int number = 153;
        System.out.println("Number: " + number);
        
        System.out.println("Is Prime: " + isPrime(number));
        System.out.println("Is Buzz Number: " + isBuzzNumber(number));
        
        int[] factors = findFactors(number);
        System.out.println("Greatest Factor: " + findGreatestFactor(factors));
        System.out.println("Sum of Factors: " + sumOfFactors(factors));
        System.out.println("Product of Factors: " + productOfFactors(factors));
        System.out.println("Product of Cube of Factors: " + productOfCubeOfFactors(factors));
    }

    
}
