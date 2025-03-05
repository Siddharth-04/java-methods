import java.util.ArrayList;

public class NumberChecker {
    public static int countDigits(int number) {
        int count = 0;
        while(number > 0) {
            number /= 10;
            count++;
        }

        return count;
    }

    public static int[] getDigitsArray(int number) {
        int count = countDigits(number);
        int[] digits = new int[count];
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }
        return digits;
    }    

    public static int findSumOfDigits(int[] digits) {
        int sum = 0;
        for (int i=0 ; i<digits.length; i++) {
            int digit = digits[i];
            sum += digit;
        }
        return sum;
    }

    public static int findSumOfSquares(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, 2);
        }
        return sum;
    }

    public static boolean isHarshadNumber(int number, int sumOfDigits) {
        return number % sumOfDigits == 0;
    }

    public static int[][] findDigitFrequency(int[] digits) { //digit frequency
        int[] freq = new int[10];
        int nonZeroCount = 0;
        for (int digit : digits) {
            if (freq[digit] == 0) {
                nonZeroCount++;
            }
            freq[digit]++;
        }
        int[][] result = new int[nonZeroCount][2];
        int index = 0;
        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0) {
                result[index][0] = i;
                result[index][1] = freq[i];
                index++;
            }
        }
        return result;
    }

    public static boolean isDuckNumber(int[] digits) {
        for (int i = 1; i < digits.length; i++) {
            if (digits[i] == 0) return true;
        }
        return false;
    }

    public static boolean isArmstrongNumber(int number) {
        int sum = 0, temp = number;
        int power = countDigits(number);
        while (temp > 0) {
            sum += Math.pow(temp % 10, power);
            temp /= 10;
        }
        return sum == number;
    }

    public static int[] findLargestTwo(int[] digits) {
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;
        for (int num : digits) {
            if (num > max1) {
                max2 = max1;
                max1 = num;
            } else if (num > max2) {
                max2 = num;
            }
        }
        return new int[]{max1, max2};
    }

    public static int[] findSmallestTwo(int[] digits) {
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
        for (int num : digits) {
            if (num < min1) {
                min2 = min1;
                min1 = num;
            } else if (num < min2) {
                min2 = num;
            }
        }
        return new int[]{min1, min2};
    }
    public static void main(String[] args) {
        int number = 153; // Take random number
        System.out.println("Number: " + number);
        
        int count = countDigits(number);
        System.out.println("Count of Digits: " + count); //count digits
        
        int[] digits = getDigitsArray(number);
        System.out.println("Digits Array: ");
        for (int digit : digits) {
            System.out.print(digit + " ");
        }
        System.out.println();
        
        int sum = findSumOfDigits(digits);
        System.out.println("Sum of Digits: " + sum);
        
        int sumOfSquares = findSumOfSquares(digits);
        System.out.println("Sum of Squares of Digits: " + sumOfSquares);
        
        System.out.println("Is Harshad Number: " + isHarshadNumber(number, sum));
        
        int[][] frequency = findDigitFrequency(digits);
        System.out.println("Digit Frequency:");
        for (int[] row : frequency) {
            System.out.println("Digit " + row[0] + ": " + row[1] + " times");
        }
        
        System.out.println("Is Duck Number: " + isDuckNumber(digits));
        System.out.println("Is Armstrong Number: " + isArmstrongNumber(number));
        
        int[] largestTwo = findLargestTwo(digits);
        System.out.println("Largest: " + largestTwo[0] + ", Second Largest: " + largestTwo[1]);
        
        int[] smallestTwo = findSmallestTwo(digits);
        System.out.println("Smallest: " + smallestTwo[0] + ", Second Smallest: " + smallestTwo[1]);
    }

    
}
