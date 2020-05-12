
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Admin
 */
public class Validation {

    private Scanner scanner;

    public Validation() {
        scanner = new Scanner(System.in);
    }

    public int getValidIntegerNumber(String title) {
        while (true) {
            System.out.print(title);
            try {
                String intputedValue = scanner.nextLine().trim();
                if ((intputedValue == null) || (intputedValue.isEmpty())) {
                    System.out.println("Not Accepted Empty!!!");
                } else {
                    double inputedIsDouble = Double.parseDouble(intputedValue);
                    if (inputedIsDouble - (int) inputedIsDouble != 0) {
                        System.out.println("Inputed Value Must Be Integer Number!");
                    } else {
                        int validIntegerNumber = Integer.parseInt(intputedValue);
                        return validIntegerNumber;
                    }
                }
            } catch (Exception e) {
                System.out.println("Inputed Value Must Be Integer Number!");
            }
        }
    }
}
