import java.util.Scanner;

class FindYoungestAndTallest {
    //method to find youngest person
    public static int findYoungest(int[] ages) {
        int youngestIndex = 0;
        int minAge = Integer.MAX_VALUE;
        for (int i = 0; i < ages.length; i++) {
            if (minAge > ages[i]) {
                minAge = ages[i];
                youngestIndex = i;
            }
        }
        return youngestIndex;
    }

    //method to find tallest person
    public static int findTallest(double[] heights) {
        int tallestIndex = 0;
        double maxHeight = 0;
        for (int i = 0; i < heights.length; i++) {
            if (maxHeight < heights[i]) {
                maxHeight = heights[i];
                tallestIndex = i;
            }
        }
        return tallestIndex;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] ages = new int[3];
        double[] heights = new double[3];
        
        String[] names = {"Amar", "Akbar", "Anthony"}; //names of 3 persons

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age and height of " + names[i] + " : ");
            ages[i] = scanner.nextInt(); //input age and height of 3 persons
            heights[i] = scanner.nextDouble();
        }

        int youngestIndex = findYoungest(ages);
        int tallestIndex = findTallest(heights);

        for (int i = 0; i < 3; i++) {
            System.out.println("Age : " + ages[i] + ", Height : " + heights[i]);
        }

        System.out.println(names[tallestIndex] + " is tallest");
        System.out.println(names[youngestIndex] + " is youngest");
    }
}
