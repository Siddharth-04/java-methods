import java.util.Random;

public class EmployeeBonusCalculator {
    public static void main(String[] args) {
        int employees = 10;
        double[][] salaryData = generateSalaryAndService(employees);
        double[][] updatedData = calculateNewSalaryAndBonus(salaryData);
        displayResults(salaryData, updatedData);
    }

    public static double[][] generateSalaryAndService(int count) {
        Random random = new Random();
        double[][] data = new double[count][2];
        
        for (int i = 0; i < count; i++) {
            data[i][0] = 10000 + random.nextInt(90000); // Random salary between 10000 and 99999
            data[i][1] = 1 + random.nextInt(10); // Random years of service between 1 and 10
        }
        return data;
    }

    public static double[][] calculateNewSalaryAndBonus(double[][] data) {
        double[][] updatedData = new double[data.length][2];
        
        for (int i = 0; i < data.length; i++) {
            double salary = data[i][0];
            int years = (int) data[i][1];
            double bonusPercentage = (years > 5) ? 0.05 : 0.02;
            double bonus = salary * bonusPercentage;
            updatedData[i][0] = salary + bonus; // New salary
            updatedData[i][1] = bonus; // Bonus amount
        }
        return updatedData;
    }

    public static void displayResults(double[][] oldData, double[][] newData) {
        double totalOldSalary = 0, totalNewSalary = 0, totalBonus = 0;
        
        System.out.println("Emp\tOld Salary\tYears\tBonus\tNew Salary");
        for (int i = 0; i < oldData.length; i++) {
            totalOldSalary += oldData[i][0];
            totalNewSalary += newData[i][0];
            totalBonus += newData[i][1];
            
            System.out.println((i + 1) + "\t" + oldData[i][0] + "\t" + (int) oldData[i][1] + "\t" + newData[i][1] + "\t" + newData[i][0]);
        }
        
        System.out.println("\nTotal Old Salary: " + totalOldSalary);
        System.out.println("Total New Salary: " + totalNewSalary);
        System.out.println("Total Bonus Paid: " + totalBonus);
    }
}
