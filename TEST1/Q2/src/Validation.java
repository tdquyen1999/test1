
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

    public double getValidDoubleNumber(String title) {
        while (true) {
            System.out.print(title);
            try {
                String intputValue = scanner.nextLine().trim();
                if (intputValue == null || intputValue.isEmpty()) {
                    System.out.println("Not Accepted Empty!!!");
                } else {
                    double validDouble = Double.parseDouble(intputValue);
                    return validDouble;
                }
            } catch (Exception e) {
                System.out.println("Inputed Value Must Be Number!");
            }
        }
    }
}
