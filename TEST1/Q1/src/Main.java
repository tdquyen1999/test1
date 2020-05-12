

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Admin
 */
public class Main {

    public static void main(String[] args) {
        displaySqrtOfDelta();
    }

    public static void displaySqrtOfDelta() {
        Validation validation = new Validation();
        System.out.println("Welcome to Quadratic Equation Program, ");
        int firstNumber = validation.getValidIntegerNumber("Enter a: ");
        int secondNumber = validation.getValidIntegerNumber("Enter b: ");
        int thirdNumber = validation.getValidIntegerNumber("Enter c: ");
        if (firstNumber != 0) {
            double delta = Math.pow(secondNumber, 2) - (4 * firstNumber * thirdNumber);
            if (delta < 0) {
                System.out.println("Quadratic Equation Not Have Delta");
            } else {
                System.out.println("Square Root of Delta: " + (Math.round(Math.sqrt(delta) * 100.0) / 100.0));
            }
        } else {
            System.out.println("Quadratic Equation Not Have Delta");
        }
    }

}
