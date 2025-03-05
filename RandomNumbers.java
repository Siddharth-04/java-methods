import java.util.Random;

public class RandomNumbers {
    public static int[] generate4DigitRandomArray(int size) {//generate4DigitRandomArray method
        Random random = new Random();
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            numbers[i] = 1000 + random.nextInt(9000);
        }
        return numbers;
    }

    public static double[] findAverageMinMax(int[] numbers) { //findAverageMinMax method
        int min = numbers[0], max = numbers[0], sum = 0;
        for (int num : numbers) {
            sum += num;
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        double average = (double) sum / numbers.length;
        return new double[]{average, min, max};
    }

    public static void main(String[] args) {
        int size = 5;
        int[] numbers = generate4DigitRandomArray(size); //generate4DigitRandomArray method called
        double[] results = findAverageMinMax(numbers); //findAverageMinMax method called

        System.out.println("Generated Numbers:");
        for (int num : numbers) {
            System.out.println(num);
        }

        System.out.println("\nAverage: " + results[0]);
        System.out.println("Minimum: " + results[1]);
        System.out.println("Maximum: " + results[2]);
    }   
}
