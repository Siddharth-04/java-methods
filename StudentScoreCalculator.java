import java.util.Random;
import java.util.Scanner;

public class StudentScoreCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int students = scanner.nextInt();
        
        int[][] scores = generateScores(students);
        double[][] results = calculateResults(scores);
        displayScorecard(scores, results);
    }

    public static int[][] generateScores(int count) {
        Random random = new Random();
        int[][] scores = new int[count][3];
        
        for (int i = 0; i < count; i++) {
            scores[i][0] = 10 + random.nextInt(90); // Physics score between 10 and 99
            scores[i][1] = 10 + random.nextInt(90); // Chemistry score between 10 and 99
            scores[i][2] = 10 + random.nextInt(90); // Math score between 10 and 99
        }
        return scores;
    }

    public static double[][] calculateResults(int[][] scores) {
        double[][] results = new double[scores.length][3];
        
        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;
            
            results[i][0] = total;
            results[i][1] = Math.round(average * 100.0) / 100.0;
            results[i][2] = Math.round(percentage * 100.0) / 100.0;
        }
        return results;
    }

    public static void displayScorecard(int[][] scores, double[][] results) {
        System.out.println("Student\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage");
        for (int i = 0; i < scores.length; i++) {
            System.out.println((i + 1) + "\t" + scores[i][0] + "\t" + scores[i][1] + "\t" + scores[i][2] + "\t" + results[i][0] + "\t" + results[i][1] + "\t" + results[i][2]);
        }
    }
}
