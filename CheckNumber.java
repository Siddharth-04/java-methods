import java.util.Scanner;

class CheckNumber{
    public static boolean isPositive(int number){
        if(number > 0){
            System.out.println(number + " is a positive number");
            return true;
        }
        else{
            System.out.println(number + " is not a positive number");
        }

        return false;
    }

    public static void isEven(int number){      
        if(number % 2 == 0){
            System.out.println(number + " is even number");
        }
        else{
            System.out.println(number + " is odd number");
        }    
    }

    public static int compare(int [] numbers){
        int number1 = numbers[0];
        int number2 = numbers[numbers.length-1];

        if(number1 > number2){
            System.out.println(number1 + " is greater than " + number2);
            return 1;
        }
        else if(number1 < number2){
            System.out.println(number1 + " is less than " + number2);
            return -1;
        }
        else{
            System.out.println(number1 + " is equal to " + number2);
            return 0;
        }
    }


    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int [] numbers = new int[5];

        for(int i=0 ; i<5 ; i++){
            System.out.println("Enter the " + (i+1) +" number: ");
            numbers[i] = scanner.nextInt();
        }

        for(int i=0 ; i<5 ; i++){
            if(isPositive(i)){
                isEven(i);
            }
        }

        int result = compare(numbers);
        
    }
}