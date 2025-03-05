import java.util.Scanner;

class CollinearPoints{
    public static void findCollinearUsingSlope(int [] x, int [] y) {
        int slopeAB = (y[2] - y[1]) / (x[2] - x[1]);
        int slopeBC = (y[1] - y[0]) / (x[1] - x[0]);
        int slopeAC = (y[2] - y[0]) / (x[2] - x[0]);

        boolean collinear = false;
        if (slopeAB == slopeBC && slopeBC == slopeAC) {
            collinear = true;
        }
        if (collinear) {
            System.out.println("Collinear using slope");
        } else {
            System.out.println("Not Collinear using slope");
        }
    }

    public static void findCollinearUsingArea(int [] x,int [] y){
        double area = 0.5 * (x[0] * (y[1] - y[2]) + x[1] * (y[2] - y[0]) + x[2] * (y[0] - y[1]));
        if (area == 0) {
            System.out.println("Collinear using area");
        } else {
            System.out.println("Not Collinear using area");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] x = new int[3];
        int[] y = new int[3];

        System.out.println("Enter the points:");
        for (int i = 0; i < 3; i++) {
            x[i] = scanner.nextInt();
            y[i] = scanner.nextInt();
        }

        findCollinearUsingArea(x, y);
        findCollinearUsingSlope(x, y);
    }
}