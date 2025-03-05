public class NumberChecker {

    //methods
    public static int countDigits(int number) {
        int count = 0;
        while (number > 0) {
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
        for (int i = 0; i < digits.length; i++) {
            if (digits[i] > max1) {
                max2 = max1;
                max1 = digits[i];
            } else if (digits[i] > max2) {
                max2 = digits[i];
            }
        }
        return new int[]{max1, max2};
    }

    public static int[] findSmallestTwo(int[] digits) {
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
        for (int i = 0; i < digits.length; i++) {
            if (digits[i] < min1) {
                min2 = min1;
                min1 = digits[i];
            } else if (digits[i] < min2) {
                min2 = digits[i];
            }
        }
        return new int[]{min1, min2};
    }

    public static void main(String[] args) {
        int number = 153;
        System.out.println("Number: " + number);

        int count = countDigits(number);
        System.out.println("Count of Digits: " + count); //count digits

        int digits[] = getDigitsArray(number);
        System.out.println("Is Duck Number: " + isDuckNumber(digits)); //is duck number
        System.out.println("Is Armstrong Number: " + isArmstrongNumber(number)); //is armstrong number

        int[] largestTwo = findLargestTwo(digits); //largest 2 number
        System.out.println("Largest: " + largestTwo[0] + ", Second Largest: " + largestTwo[1]);

        int[] smallestTwo = findSmallestTwo(digits); //smallest two number
        System.out.println("Smallest: " + smallestTwo[0] + ", Second Smallest: " + smallestTwo[1]);
    }
}
