import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);

        //Operation input
        System.out.println("Enter mathematical operation");
        String operation = myObj.nextLine();

        //Number input
        System.out.println("Enter 2 numbers");
        int number1 = myObj.nextInt();
        int number2 = myObj.nextInt();


        //Calculation
        int Operation;
        switch(operation.toLowerCase()) {
            case "multiplication":
                Operation = number1 * number2;
                break;
            case "addition":
                Operation = number1 + number2;
                break;
            case "subtraction":
                Operation = number1 - number2;
                break;
            case "division":
                Operation = number1 / number2;
                break;
            default:
                Operation = 0;
        }

        System.out.println("Answer: " + Operation);

        //System.out.println("Method: " + operation);
        //System.out.println("Number 1: " + number1);
        //System.out.println("Number 2: " + number2);

    }
}