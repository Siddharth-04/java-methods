import java.util.Scanner;

public class CalculateNumberOfHandshakes{
	//function
	public static int countHandshakes(int numberOfStudents){
		int handshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;
		return handshakes;
	}
	
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //input number of students
        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();
    
        int handshakes = countHandshakes(numberOfStudents); //calling function
        
        System.out.println("The maximum number of handshakes by " + numberOfStudents + " students is " + handshakes);
    }
}