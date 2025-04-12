package calculators;
import java.util.Scanner;

public class MyFirstCalculator {
    public static void main (String[] args){
        //create Scanner object or instance
        Scanner input = new Scanner(System.in); //create Scanner object or instance

        Algorithm algo = new Algorithm();  //Create an object

        System.out.print("Enter your first number: ");
        int number1 = input.nextInt();

        System.out.print("Enter your second number: ");
        int number2 = input.nextInt();

        input.close();   // to close the Resource

        System.out.println("Your sum is : " + algo.add(number1, number2));
        System.out.println("Your difference is : " + algo.sub(number1, number2));
        System.out.println("Your product is : " + algo.multi(number1, number2));
        System.out.println("You division is " + algo.div(number1, number2));

    }  
}
