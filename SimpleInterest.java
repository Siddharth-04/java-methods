import java.util.Scanner;

class SimpleInterest{
	public static double calculateSimpleIneterest(double principle,double rate,int time){
		double simpleInterest = (principle*rate*time)/100;
		return simpleInterest;
	}
	public static void main(String [] args){
		Scanner scanner = new Scanner(System.in);
		//inputs
		System.out.print("Enter principle : ");
		double principle = scanner.nextDouble();
		System.out.print("Enter rate of interest : ");
		double rate = scanner.nextDouble();
		System.out.print("Enter time : ");
		int time = scanner.nextInt();
		
		double simpleInterest = calculateSimpleIneterest(principle,rate,time); //calling function
		System.out.print("The simple Interest is " + simpleInterest + " for principle " + principle + ",Rate of Interest " + rate + "and Time " + time);	
	}
}