import java.util.Scanner;

public class MyFirstCalculator {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in); //create Scanner object or instance
        System.out.print("Enter your first number: ");
        int number1 = input.nextInt();

        System.out.print("Enter your second number: ");
        int number2 = input.nextInt();
System.out.println();
        System.out.println("Your sum is : " + add(number1, number2));
        System.out.println("Your difference is : " + sub(number1, number2));
        System.out.println("Your product is : " + multi(number1, number2));
        System.out.println("You division is " + div(number1, number2));

    }

    static int add(int number1, int number2){
       int addition = number1 + number2;
       return addition;
    }

    static int sub(int number1, int number2){
        int substraction = number1 - number2;
        return substraction;
    }
    static int multi(int number1, int number2){
        int multiplication = number1 * number2;
        return multiplication;
    }
    static int div(int number1, int number2){
        int division = number1 / number2;
        return division;

    }
}
