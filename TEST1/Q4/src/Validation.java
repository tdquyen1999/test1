
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
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

    public int getValidOption() {
        while (true) {
            System.out.print("Enter Options: ");
            try {
                String inputValue = scanner.nextLine().trim();
                if ((inputValue == null) || (inputValue.isEmpty())) {
                    System.out.println("Not Accepted Empty Option");
                } else {
                    double inputIsDouble = Double.parseDouble(inputValue);
                    if ((inputIsDouble - (int) inputIsDouble) != 0) {
                        System.out.println("Option is Integer Number!");
                    } else {
                        int validOption = Integer.parseInt(inputValue);
                        if ((validOption > 4) || (validOption < 0)) {
                            System.out.println("Out Of Range. Please Input in Range [1-4]");
                        } else {
                            return validOption;
                        }
                    }
                }
            } catch (Exception e) {
                System.out.println("Option Must Be Numeric!");
            }
        }
    }

    public int getValidRateOfUser(String title) {
        while (true) {
            System.out.print(title);
            try {
                String intputValue = scanner.nextLine().trim();
                if ((intputValue == null) || (intputValue.isEmpty())) {
                    System.out.println("Not Accepted Empty!!!");
                } else {
                    double inputIsDouble = Double.parseDouble(intputValue);
                    if ((inputIsDouble - (int) inputIsDouble) != 0) {
                        System.out.println("Inputed Value Must Be Integer Number!");
                    } else {
                        int inputIsInteger = Integer.parseInt(intputValue);
                        if ((inputIsInteger > 10) || (inputIsInteger < 1)) {
                            System.out.println("Out Of Range. Please Input in Range [1-10]");
                        } else {
                            return inputIsInteger;
                        }
                    }
                }
            } catch (Exception e) {
                System.out.println("Inputed Value Must Be Integer Number!");
            }
        }
    }

    public String getValidString(String title) {
        while (true) {
            System.out.print(title);
            try {
                String intputValue = scanner.nextLine().trim();
                if ((intputValue == null) || (intputValue.isEmpty())) {
                    System.out.println("Not Accepted Empty!!!");
                } else {
                    return intputValue;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public String getValidDate(String title) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        dateFormat.setLenient(false);
        while (true) {
            System.out.print(title);
            String input = scanner.nextLine();
            try {
                Date inputDate = dateFormat.parse(input);
                Date today = new Date();
                if (inputDate.compareTo(today) > 0) {
                    System.out.println("Please Enter PublishDate Less than or Equal Today!");
                } else {
                    dateFormat = new SimpleDateFormat("dd/MMM/yyyy", Locale.ENGLISH);
                    return dateFormat.format(inputDate);
                }
            } catch (Exception e) {
                System.out.println("Input Date Follows Format (dd/MM/yyyy) or Valid Date!");
            }
        }
    }
}
