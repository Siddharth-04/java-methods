import java.util.Scanner;

public class CheckNumber{
	//function
	public static int checkNumber(int number){
		if(number < 0)
			
			return -1;
		else if(number > 0)
			return 1;
		return 0;
	}
	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		
        //input the number
        System.out.print("Enter the number : ");
		int number = scanner.nextInt();
		
		int result = checkNumber(number);
        
        System.out.println("The result is : " + result);
    }
}