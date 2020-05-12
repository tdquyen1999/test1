
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

    public int validateOption() {
        while (true) {
            System.out.print("Enter Options: ");
            try {
                String name = scanner.nextLine().trim();
                if (name == null || name.isEmpty()) {
                    System.out.println("Not Accepted Empty Option");
                } else {
                    double inputDouble = Double.parseDouble(name);
                    if (inputDouble - (int) inputDouble != 0) {
                        System.out.println("Option is Integer Number!");
                    } else {
                        int option = Integer.parseInt(name);
                        if (option > 4 || option < 0) {
                            System.out.println("Out Of Range. Please Input in Range [1-4]");
                        } else {
                            return option;
                        }
                    }
                }
            } catch (Exception e) {
                System.out.println("Option Must Be Numeric!");
            }
        }
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

    public int validateRate(String title) {
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
                        if (number > 10 || number < 1) {
                            System.out.println("Out Of Range. Please Input in Range [1-10]");
                        } else {
                            return number;
                        }
                    }
                }
            } catch (Exception e) {
                System.out.println("Inputed Value Must Be Integer Number!");
            }
        }
    }

    public String validateString(String title) {
        while (true) {
            System.out.print(title);
            try {
                String intput = scanner.nextLine().trim();
                if (intput == null || intput.isEmpty()) {
                    System.out.println("Not Accepted Empty!!!");
                } else {
                    return intput;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public String validateDate(String mess) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        dateFormat.setLenient(false);
        while (true) {
            System.out.print(mess);
            String input = scanner.nextLine();
            try {
                Date date = dateFormat.parse(input);
                Date today = new Date();
                if (date.compareTo(today) > 0) {
                    System.out.println("Please Enter PublishDate Less than or Equal Today!");
                } else {
                    dateFormat = new SimpleDateFormat("dd/MMM/yyyy", Locale.ENGLISH);
                    return dateFormat.format(date);
                }
            } catch (Exception e) {
                System.out.println("Input Date Follows Format (dd/MM/yyyy) or Valid Date!");
            }
        }
    }
}
