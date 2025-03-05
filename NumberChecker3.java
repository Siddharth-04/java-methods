public class NumberChecker {
    public static int countDigits(int number) { //countDigits to count the digits of the number}
        int count = 0;
        while (number > 0) {
            count++;
            number /= 10;
        }
        return count;
    }

    public static int[] getDigitsArray(int number) { //getDigitsArray to get the digits of the number
        int count = countDigits(number);
        int[] digits = new int[count];
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }
        return digits;
    }

    public static int[] reverseArray(int[] array) { //reverseArray to reverse the array
        int[] reversed = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            reversed[i] = array[array.length - 1 - i];
        }
        return reversed;
    }

    public static boolean areArraysEqual(int[] array1, int[] array2) { //areArraysEqual if the arrays are equal
        if (array1.length != array2.length) return false;
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) return false;
        }
        return true;
    }

    public static boolean isPalindrome(int[] digits) { //isPalindrome if the array is equal to its reverse
        int[] reversed = reverseArray(digits);
        return areArraysEqual(digits, reversed);
    }

    public static boolean isDuckNumber(int[] digits) { //isDuck number if it contains 0 and not in the first position
        for (int i = 1; i < digits.length; i++) {
            if (digits[i] == 0) return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int number = 153;
        System.out.println("Number: " + number);
        
        int count = countDigits(number);
        System.out.println("Count of Digits: " + count);
        
        int[] digits = getDigitsArray(number);
        System.out.print("Digits Array: ");
        for (int i = 0; i < digits.length; i++) {
            System.out.print(digits[i] + " ");
        }
        System.out.println();
        
        int[] reversedDigits = reverseArray(digits);
        System.out.print("Reversed Digits Array: ");
        for (int i = 0; i < reversedDigits.length; i++) {
            System.out.print(reversedDigits[i] + " ");
        }
        System.out.println();
        
        System.out.println("Is Palindrome: " + isPalindrome(digits));
        System.out.println("Is Duck Number: " + isDuckNumber(digits));
    }

    
}
