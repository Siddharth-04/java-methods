import java.util.Scanner;

public class FindNumberOfRounds{
	//function
	public static int countNumberOfRounds(int side1,int side2,int side3){
		int rounds = 5000/(side1+side2+side3);
		return rounds;
	}
	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		
        //input side if trianglular park
        System.out.print("Enter sides of park: ");
		int side1 = scanner.nextInt();
		int side2 = scanner.nextInt();
		int side3 = scanner.nextInt();
		
		int rounds = countNumberOfRounds(side1,side2,side3);
       
        
        System.out.println("The number of rounds athelete have to run is : " + rounds);
    }
}