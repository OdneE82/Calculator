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
        /*
        int Operation = 0;
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
                if(number2 == 0) {
                    System.out.println("Error: Cannot divide by zero.");
                    break;
                }
                Operation = (int) Math.round(number1 / (double) number2);
                break;
            default:
                System.out.println("Error: Invalid Operation");
                break;
        }
         */


        //Enhanced switch Calculation
        var result = switch (operation.toLowerCase()) {
            case "multiplication" -> number1*number2;
            case "addition" -> number1 + number2;
            case "subtraction" -> number1 - number2;
            case "division" -> number2 == 0 ? "Error: Cannot divide by zero." : (double)number1/(double)number2;
            default -> "Error: Invalid Operation";
        };

        if(result instanceof String) {
            System.out.println((String)result);
        } else if(result instanceof Double) {
            System.out.printf("Result: %.2f", (Double)result);
        } else {
            System.out.println("Result: " + result);
        }


        //System.out.println("Result: " + result);
        //System.out.println("Answer: " + Operation);

        //System.out.println("Method: " + operation);
        //System.out.println("Number 1: " + number1);
        //System.out.println("Number 2: " + number2);

    }
}