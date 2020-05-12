
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
    
    public int validateInteger(String title) {
        while (true) {
            System.out.print(title);
            try {
                String intput = scanner.nextLine().trim();
                if (intput == null || intput.isEmpty()) {
                    System.out.println("Not Accepted Empty!!!");
                } else {
                    double inputDouble = Double.parseDouble(intput);
                    if (inputDouble - (int) inputDouble != 0) {
                        System.out.println("Inputed Value Must Be Integer Number!");
                    } else {
                        int number = Integer.parseInt(intput);
                        return number;
                    }
                }
            } catch (Exception e) {
                System.out.println("Inputed Value Must Be Integer Number!");
            }
        }
    }
}
